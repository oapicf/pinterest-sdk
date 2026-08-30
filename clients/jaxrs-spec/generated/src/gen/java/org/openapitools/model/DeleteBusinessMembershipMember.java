package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessRoleForMembers;
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
 * Single instance of a business member to be removed from the business.
 **/
@ApiModel(description = "Single instance of a business member to be removed from the business.")
@JsonTypeName("DeleteBusinessMembershipMember")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class DeleteBusinessMembershipMember   {
  private BusinessRoleForMembers businessRole;
  private String memberId;

  public DeleteBusinessMembershipMember() {
  }

  @JsonCreator
  public DeleteBusinessMembershipMember(
    @JsonProperty(required = true, value = "business_role") BusinessRoleForMembers businessRole,
    @JsonProperty(required = true, value = "member_id") String memberId
  ) {
    this.businessRole = businessRole;
    this.memberId = memberId;
  }

  /**
   **/
  public DeleteBusinessMembershipMember businessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "business_role")
  @NotNull public BusinessRoleForMembers getBusinessRole() {
    return businessRole;
  }

  @JsonProperty(required = true, value = "business_role")
  public void setBusinessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
  }

  /**
   * Unique identifier of the member
   **/
  public DeleteBusinessMembershipMember memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  
  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member")
  @JsonProperty(required = true, value = "member_id")
  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=25)public String getMemberId() {
    return memberId;
  }

  @JsonProperty(required = true, value = "member_id")
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
    DeleteBusinessMembershipMember deleteBusinessMembershipMember = (DeleteBusinessMembershipMember) o;
    return Objects.equals(this.businessRole, deleteBusinessMembershipMember.businessRole) &&
        Objects.equals(this.memberId, deleteBusinessMembershipMember.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessRole, memberId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteBusinessMembershipMember {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
