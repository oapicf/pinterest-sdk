package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Use this if your feed file requires username and password.
 **/
@ApiModel(description="Use this if your feed file requires username and password.")
public class CatalogsFeedCredentials  {
  
  @ApiModelProperty(required = true, value = "The required password for downloading a feed.")
 /**
   * The required password for downloading a feed.
  **/
  private String password;

  @ApiModelProperty(required = true, value = "The required username for downloading a feed.")
 /**
   * The required username for downloading a feed.
  **/
  private String username;
 /**
   * The required password for downloading a feed.
   * @return password
  **/
  @JsonProperty("password")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CatalogsFeedCredentials password(String password) {
    this.password = password;
    return this;
  }

 /**
   * The required username for downloading a feed.
   * @return username
  **/
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CatalogsFeedCredentials username(String username) {
    this.username = username;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedCredentials {\n");
    
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

