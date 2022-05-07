package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Use this if your feed file requires username and password.
 */
@ApiModel(description="Use this if your feed file requires username and password.")

public class CatalogsFeedCredentials  {
  
 /**
  * The required password for downloading a feed.
  */
  @ApiModelProperty(required = true, value = "The required password for downloading a feed.")
  private String password;

 /**
  * The required username for downloading a feed.
  */
  @ApiModelProperty(required = true, value = "The required username for downloading a feed.")
  private String username;
 /**
  * The required password for downloading a feed.
  * @return password
  */
  @JsonProperty("password")
  @NotNull
  public String getPassword() {
    return password;
  }

  /**
   * Sets the <code>password</code> property.
   */
 public void setPassword(String password) {
    this.password = password;
  }

  /**
   * Sets the <code>password</code> property.
   */
  public CatalogsFeedCredentials password(String password) {
    this.password = password;
    return this;
  }

 /**
  * The required username for downloading a feed.
  * @return username
  */
  @JsonProperty("username")
  @NotNull
  public String getUsername() {
    return username;
  }

  /**
   * Sets the <code>username</code> property.
   */
 public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Sets the <code>username</code> property.
   */
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

