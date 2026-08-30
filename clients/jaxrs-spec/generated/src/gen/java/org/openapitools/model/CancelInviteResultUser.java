package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Metadata of the member/partner that has access to the asset.
 **/
@ApiModel(description = "Metadata of the member/partner that has access to the asset.")
@JsonTypeName("CancelInviteResultUser")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CancelInviteResultUser   {
  private String email;
  private String id;
  private String username;

  public CancelInviteResultUser() {
  }

  /**
   * Email of the business member/partner.
   **/
  public CancelInviteResultUser email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(value = "Email of the business member/partner.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  @JsonProperty("email")
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Unique identifier of the business member/partner.
   **/
  public CancelInviteResultUser id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(value = "Unique identifier of the business member/partner.")
  @JsonProperty("id")
   @Size(min=1,max=20)public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Username of the business member/partner.
   **/
  public CancelInviteResultUser username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(value = "Username of the business member/partner.")
  @JsonProperty("username")
  public String getUsername() {
    return username;
  }

  @JsonProperty("username")
  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelInviteResultUser cancelInviteResultUser = (CancelInviteResultUser) o;
    return Objects.equals(this.email, cancelInviteResultUser.email) &&
        Objects.equals(this.id, cancelInviteResultUser.id) &&
        Objects.equals(this.username, cancelInviteResultUser.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelInviteResultUser {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
