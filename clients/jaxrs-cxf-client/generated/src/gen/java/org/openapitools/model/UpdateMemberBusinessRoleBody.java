package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.BusinessRoleForMembers;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Single instance of a business member to have its role updated
 **/
@ApiModel(description="Single instance of a business member to have its role updated")

public class UpdateMemberBusinessRoleBody  {
  
  @ApiModelProperty(required = true, value = "")
  private BusinessRoleForMembers businessRole;

  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member")
 /**
   * Unique identifier of the member
  **/
  private String memberId;
 /**
   * Get businessRole
   * @return businessRole
  **/
  @JsonProperty("business_role")
  public BusinessRoleForMembers getBusinessRole() {
    return businessRole;
  }

  public void setBusinessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
  }

  public UpdateMemberBusinessRoleBody businessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
    return this;
  }

 /**
   * Unique identifier of the member
   * @return memberId
  **/
  @JsonProperty("member_id")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public UpdateMemberBusinessRoleBody memberId(String memberId) {
    this.memberId = memberId;
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
    UpdateMemberBusinessRoleBody updateMemberBusinessRoleBody = (UpdateMemberBusinessRoleBody) o;
    return Objects.equals(this.businessRole, updateMemberBusinessRoleBody.businessRole) &&
        Objects.equals(this.memberId, updateMemberBusinessRoleBody.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessRole, memberId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberBusinessRoleBody {\n");
    
    sb.append("    businessRole: ").append(toIndentedString(businessRole)).append("\n");
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
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

