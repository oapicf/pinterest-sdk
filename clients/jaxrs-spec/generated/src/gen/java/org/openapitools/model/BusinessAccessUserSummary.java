package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Metadata of the member/partner that has access to the asset.
 **/
@ApiModel(description = "Metadata of the member/partner that has access to the asset.")
@JsonTypeName("BusinessAccessUserSummary")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class BusinessAccessUserSummary   {
  private String email;
  private String id;
  private String username;

  /**
   * Email of the business member/partner.
   **/
  public BusinessAccessUserSummary email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "business0101@business.com", value = "Email of the business member/partner.")
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
  public BusinessAccessUserSummary id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "383791336903426391", value = "Unique identifier of the business member/partner.")
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
  public BusinessAccessUserSummary username(String username) {
    this.username = username;
    return this;
  }

  
  @ApiModelProperty(example = "business0101", value = "Username of the business member/partner.")
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

