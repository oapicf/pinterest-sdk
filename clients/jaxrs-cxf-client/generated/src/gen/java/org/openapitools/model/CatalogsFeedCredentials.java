package org.openapitools.model;

import io.swagger.annotations.ApiModel;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * This field is **OPTIONAL**. Use this if your feed file requires username and password.
 **/
@ApiModel(description="This field is **OPTIONAL**. Use this if your feed file requires username and password.")

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
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogsFeedCredentials catalogsFeedCredentials = (CatalogsFeedCredentials) o;
    return Objects.equals(this.password, catalogsFeedCredentials.password) &&
        Objects.equals(this.username, catalogsFeedCredentials.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(password, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogsFeedCredentials {\n");
    
    sb.append("    password: ").append("*").append("\n");
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

