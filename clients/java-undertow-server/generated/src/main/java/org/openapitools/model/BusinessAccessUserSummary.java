/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.14.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-11-05T02:05:24.181167181Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessAccessUserSummary   {
  
  private String email;
  private String id;
  private String username;

  /**
   * Email of the business member/partner.
   */
  public BusinessAccessUserSummary email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "business0101@business.com", value = "Email of the business member/partner.")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * Unique identifier of the business member/partner.
   */
  public BusinessAccessUserSummary id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the business member/partner.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   * Username of the business member/partner.
   */
  public BusinessAccessUserSummary username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(example = "business0101", value = "Username of the business member/partner.")
  @JsonProperty("username")
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
    return Objects.equals(email, businessAccessUserSummary.email) &&
        Objects.equals(id, businessAccessUserSummary.id) &&
        Objects.equals(username, businessAccessUserSummary.username);
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

