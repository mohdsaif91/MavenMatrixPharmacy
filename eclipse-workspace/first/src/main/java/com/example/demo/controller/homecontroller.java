package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.hank;

@Controller
@RestController
public class homecontroller {
	@Autowired
	employee em;

	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}

	@RequestMapping("/employee/{id}")
	public int dosmoething(@PathVariable("id") int id, @RequestBody hank kl) {
		String name = null, lanme = null;
		Integer ogid = null;
		List<hank> jk = new ArrayList<>();
		System.out.println("your variable is " + id);
		jk.add(kl);
		for (hank hk : jk) {
			lanme = hk.getLname();
			name = hk.getName();
			ogid = hk.getId();
		}
		hank hm = new hank();
		hm.setId(ogid);
		hm.setName(name);
		hm.setLname(lanme);
		em.save(hm);
		return 0;
	}

	@PutMapping(path = "/empupdate/{id}", consumes = { "application/json" })
	public hank empupdate(@PathVariable int hn, @RequestBody hank hj) {
		System.out.println("called or Not Called");
		List<hank> jk = new ArrayList<>();
		jk.add(hj);
		for (hank hk : jk) {
			System.out.println("lname " + hk.getLname());
			System.out.println("name " + hk.getName());
			System.out.println("id " + hk.getId());
		}
		hank hg = em.findById(hn).orElse(new hank());
		em.save(hg);
		return hg;
	}

	@DeleteMapping("empdelete/{id}")
	public String dele(@PathVariable int id) {
		hank hk = em.getOne(id);
		em.delete(hk);
		return "deleted";
	}

	@GetMapping("/empadd")
	public String empadd(hank hk) {
		System.out.println("i have called this method");
		em.save(hk);
		return "home.jsp";
	}

	@PostMapping("/empaddq")
	public String empaddq(hank hk) {
		System.out.println("i have called this method");
		em.save(hk);
		return "home.jsp";
	}

	@RequestMapping("/getemp")
	public ModelAndView getemp(@RequestParam int id) {
		hank k = new hank();
		String name = "jack frost";
		ModelAndView mv = new ModelAndView("disp.jsp");
		k = em.findById(id).orElse(new hank());
		System.out.println(k.getId());
		System.out.println(k.getLname());
		System.out.println(k.getName());
		mv.addObject("name", k);
		mv.addObject("chri", name);
		System.out.println(em.findByname("lion"));
		System.out.println(em.findByidGreaterThan(1));
		System.out.println(em.findByidLessThan(3));
		System.out.println(em.findBynameSorted("xyz"));
		return mv;
	}

	@RequestMapping(path = "/emp", produces = { "application/xml" })
	@ResponseBody
	public List<hank> getall() {
		return em.findAll();
	}

	@RequestMapping("/emp/{id}")
	@ResponseBody
	public Optional<hank> getid(@PathVariable("id") int id) {
		System.out.println(em.findById(id).toString());
		return em.findById(id);
	}
}
