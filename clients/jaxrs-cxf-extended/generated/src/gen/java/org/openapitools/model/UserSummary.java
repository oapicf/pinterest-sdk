package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UserSummary  {
  
 /**
  * Username
  */
  @ApiModelProperty(example = "username", value = "Username")
  private String username;

 /**
  * Always \"user\"
  */
  @ApiModelProperty(example = "user", value = "Always \"user\"")
  private String type;
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
   */
 public void setUsername(String username) {
    this.username = username;
  }

  /**
   * Sets the <code>username</code> property.
   */
  public UserSummary username(String username) {
    this.username = username;
    return this;
  }

 /**
  * Always \&quot;user\&quot;
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public UserSummary type(String type) {
    this.type = type;
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
    UserSummary userSummary = (UserSummary) o;
    return Objects.equals(this.username, userSummary.username) &&
        Objects.equals(this.type, userSummary.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSummary {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

