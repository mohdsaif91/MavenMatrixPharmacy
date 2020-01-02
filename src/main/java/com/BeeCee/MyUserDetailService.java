//package com.BeeCee;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.BeeCee.repo.UserDetailsRepo;
//@Service
//public class MyUserDetailService implements UserDetailsService {
//
//	@Autowired
//	UserDetailsRepo repo;
//	
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		
//		com.BeeCee.model.UserDetails user = repo.findByUsername(username);
//		
//		if(user==null)
//			throw new UsernameNotFoundException("User Not Found...");
//		
//		return new UserPrincipal(user) ;
//	}
//}
