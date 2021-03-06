package com.ziriusassignment.product.security;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
  ROLE_USER, ROLE_PRODUCT;

  public String getAuthority() {
    return name();
  }

}