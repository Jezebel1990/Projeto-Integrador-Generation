package com.IntegradorG3.LojaPrincipal.seguranca;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.IntegradorG3.LojaPrincipal.model.Usuario;

public class UserDetailsImp implements UserDetails{
  private static final long serialVersionUID = 1L;
  
  private String userName;
  private String password;
  
  public UserDetailsImp(Usuario user) {
	  this.userName = user.getEmail();
	  this.password = user.getSenha();
  }
  
  public UserDetailsImp() {}
  
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}
}