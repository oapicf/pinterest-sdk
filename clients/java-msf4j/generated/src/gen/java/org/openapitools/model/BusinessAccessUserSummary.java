package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Metadata of the member/partner that has access to the asset.
 */
@ApiModel(description = "Metadata of the member/partner that has access to the asset.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessAccessUserSummary   {
  @JsonProperty("email")
  private String email;

  @JsonProperty("id")
  private String id;

  @JsonProperty("username")
  private String username;

  public BusinessAccessUserSummary email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the business member/partner.
   * @return email
  **/
  @ApiModelProperty(example = "business0101@business.com", value = "Email of the business member/partner.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BusinessAccessUserSummary id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier of the business member/partner.
   * @return id
  **/
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the business member/partner.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BusinessAccessUserSummary username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Username of the business member/partner.
   * @return username
  **/
  @ApiModelProperty(example = "business0101", value = "Username of the business member/partner.")
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
    BusinessAccessUserSummary businessAccessUserSummary = (BusinessAccessUserSummary) o;
    return Objects.equals(this.email, businessAccessUserSummary.email) &&
        Objects.equals(this.id, businessAccessUserSummary.id) &&
        Objects.equals(this.username, businessAccessUserSummary.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, id, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessAccessUserSummary {\n");
    
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

