package org.openapitools.model;

import org.openapitools.model.BusinessRoleForMembers;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class MembersToDeleteBodyMembersInner  {
  
  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member")
 /**
   * Unique identifier of the member
  **/
  private String memberId;

  @ApiModelProperty(required = true, value = "")
  private BusinessRoleForMembers businessRole;
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

  public MembersToDeleteBodyMembersInner memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

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

  public MembersToDeleteBodyMembersInner businessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
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
    MembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner = (MembersToDeleteBodyMembersInner) o;
    return Objects.equals(this.memberId, membersToDeleteBodyMembersInner.memberId) &&
        Objects.equals(this.businessRole, membersToDeleteBodyMembersInner.businessRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, businessRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembersToDeleteBodyMembersInner {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    businessRole: ").append(toIndentedString(businessRole)).append("\n");
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

