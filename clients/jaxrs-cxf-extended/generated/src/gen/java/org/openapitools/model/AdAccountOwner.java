package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdAccountOwner  {
  
 /**
  * Public username for the user account
  */
  @ApiModelProperty(value = "Public username for the user account")
  private String username;

 /**
  * The owning account's user ID.
  */
  @ApiModelProperty(value = "The owning account's user ID.")
  private String id;
 /**
  * Public username for the user account
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
  public AdAccountOwner username(String username) {
    this.username = username;
    return this;
  }

 /**
  * The owning account&#39;s user ID.
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public AdAccountOwner id(String id) {
    this.id = id;
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
    AdAccountOwner adAccountOwner = (AdAccountOwner) o;
    return Objects.equals(this.username, adAccountOwner.username) &&
        Objects.equals(this.id, adAccountOwner.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdAccountOwner {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

