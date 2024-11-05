package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * UpdateMemberResult
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-05T03:06:09.428113339Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateMemberResult {

  private String businessRole;

  private String memberId;

  public UpdateMemberResult businessRole(String businessRole) {
    this.businessRole = businessRole;
    return this;
  }

  /**
   * The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
   * @return businessRole
   */
  
  @Schema(name = "business_role", example = "EMPLOYEE", description = "The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("business_role")
  public String getBusinessRole() {
    return businessRole;
  }

  public void setBusinessRole(String businessRole) {
    this.businessRole = businessRole;
  }

  public UpdateMemberResult memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Unique identifier of the business member.
   * @return memberId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "member_id", example = "140943737684417", description = "Unique identifier of the business member.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("member_id")
  public String getMemberId() {
    return memberId;
  }

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

