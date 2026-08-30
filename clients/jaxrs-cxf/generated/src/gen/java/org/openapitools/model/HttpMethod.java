package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * HTTP request method.
 */
public enum HttpMethod {
  
  GET("GET"),
  
  HEAD("HEAD"),
  
  POST("POST"),
  
  PUT("PUT"),
  
  DELETE("DELETE"),
  
  CONNECT("CONNECT"),
  
  OPTIONS("OPTIONS"),
  
  TRACE("TRACE"),
  
  PATCH("PATCH");

  private String value;

  HttpMethod(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static HttpMethod fromValue(String value) {
    for (HttpMethod b : HttpMethod.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

