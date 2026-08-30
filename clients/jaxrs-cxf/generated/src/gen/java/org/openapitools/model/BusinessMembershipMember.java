package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BusinessRoleForMembers;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A business member identified by `member_id` with their `business_role` in the business.
 */
@ApiModel(description="A business member identified by `member_id` with their `business_role` in the business.")

public class BusinessMembershipMember  {
  
  @ApiModelProperty(required = true, value = "")

  @Valid

  private BusinessRoleForMembers businessRole;

 /**
  * Unique identifier of the member.
  */
  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member.")

  private String memberId;
 /**
   * Get businessRole
   * @return businessRole
  **/
  @JsonProperty("business_role")
  @NotNull
  public BusinessRoleForMembers getBusinessRole() {
    return businessRole;
  }

  public void setBusinessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
  }

  public BusinessMembershipMember businessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
    return this;
  }

 /**
   * Unique identifier of the member.
   * @return memberId
  **/
  @JsonProperty("member_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public BusinessMembershipMember memberId(String memberId) {
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
    BusinessMembershipMember businessMembershipMember = (BusinessMembershipMember) o;
    return Objects.equals(this.businessRole, businessMembershipMember.businessRole) &&
        Objects.equals(this.memberId, businessMembershipMember.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessRole, memberId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BusinessMembershipMember {\n");
    
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

