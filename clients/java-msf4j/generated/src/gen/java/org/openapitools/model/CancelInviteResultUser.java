package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Metadata of the member/partner that has access to the asset.
 */
@ApiModel(description = "Metadata of the member/partner that has access to the asset.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CancelInviteResultUser   {
  @JsonProperty("email")
  private String email;

  @JsonProperty("id")
  private String id;

  @JsonProperty("username")
  private String username;

  public CancelInviteResultUser email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the business member/partner.
   * @return email
  **/
  @ApiModelProperty(value = "Email of the business member/partner.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public CancelInviteResultUser id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the business member/partner.
   * @return id
  **/
  @ApiModelProperty(value = "Unique identifier of the business member/partner.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CancelInviteResultUser username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username of the business member/partner.
   * @return username
  **/
  @ApiModelProperty(value = "Username of the business member/partner.")
  public String getUsername() {
    return username;
  }

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

