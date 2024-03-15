package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class BoardOwner  {
  
  @ApiModelProperty(value = "")
  private String username;
 /**
  * Get username
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
  public BoardOwner username(String username) {
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
    BoardOwner boardOwner = (BoardOwner) o;
    return Objects.equals(this.username, boardOwner.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BoardOwner {\n");
    
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

