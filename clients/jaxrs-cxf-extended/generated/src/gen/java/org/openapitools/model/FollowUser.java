package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class FollowUser  {
  
 /**
  * Always 'user'
  */
  @ApiModelProperty(value = "Always 'user'")
  private String type;

 /**
  * Username
  */
  @ApiModelProperty(value = "Username")
  private String username;
 /**
  * Always &#39;user&#39;
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   * <br><em>N.B. <code>type</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   * <br><em>N.B. <code>type</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public FollowUser type(String type) {
    this.type = type;
    return this;
  }

 /**
  * Username
  * @return username
  */
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  /**
   * Sets the <code>username</code> property.
   * <br><em>N.B. <code>username</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Sets the <code>username</code> property.
   * <br><em>N.B. <code>username</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public FollowUser username(String username) {
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
    FollowUser followUser = (FollowUser) o;
    return Objects.equals(this.type, followUser.type) &&
        Objects.equals(this.username, followUser.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FollowUser {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

