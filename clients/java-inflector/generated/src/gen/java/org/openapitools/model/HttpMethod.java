package org.openapitools.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;



/**
 * HTTP request method.
 **/
import com.fasterxml.jackson.annotation.JsonCreator;

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
  public static HttpMethod fromValue(String text) {
    for (HttpMethod b : HttpMethod.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}


