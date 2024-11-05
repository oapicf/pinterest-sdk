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



@JsonTypeName("UpdateMemberResult")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateMemberResult   {
  private String businessRole;
  private String memberId;

  /**
   * The access level a member has to the business. Values are case-sensitive. &lt;br&gt; - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. &lt;br&gt; - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
   **/
  public UpdateMemberResult businessRole(String businessRole) {
    this.businessRole = businessRole;
    return this;
  }

  
  @ApiModelProperty(example = "EMPLOYEE", value = "The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.")
  @JsonProperty("business_role")
  public String getBusinessRole() {
    return businessRole;
  }

  @JsonProperty("business_role")
  public void setBusinessRole(String businessRole) {
    this.businessRole = businessRole;
  }

  /**
   * Unique identifier of the business member.
   **/
  public UpdateMemberResult memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  
  @ApiModelProperty(example = "140943737684417", value = "Unique identifier of the business member.")
  @JsonProperty("member_id")
   @Pattern(regexp="^\\d+$")public String getMemberId() {
    return memberId;
  }

  @JsonProperty("member_id")
  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMemberResult updateMemberResult = (UpdateMemberResult) o;
    return Objects.equals(this.businessRole, updateMemberResult.businessRole) &&
        Objects.equals(this.memberId, updateMemberResult.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessRole, memberId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberResult {\n");
    
    sb.append("    businessRole: ").append(toIndentedString(businessRole)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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

