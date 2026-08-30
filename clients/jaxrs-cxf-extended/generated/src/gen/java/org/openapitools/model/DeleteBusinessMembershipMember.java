package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BusinessRoleForMembers;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Single instance of a business member to be removed from the business.
 */
@ApiModel(description="Single instance of a business member to be removed from the business.")

public class DeleteBusinessMembershipMember  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private BusinessRoleForMembers businessRole;

 /**
  * Unique identifier of the member
  */
  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member")
  private String memberId;
 /**
  * Get businessRole
  * @return businessRole
  */
  @JsonProperty("business_role")
  @NotNull
  public BusinessRoleForMembers getBusinessRole() {
    return businessRole;
  }

  /**
   * Sets the <code>businessRole</code> property.
   */
 public void setBusinessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
  }

  /**
   * Sets the <code>businessRole</code> property.
   */
  public DeleteBusinessMembershipMember businessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
    return this;
  }

 /**
  * Unique identifier of the member
  * @return memberId
  */
  @JsonProperty("member_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getMemberId() {
    return memberId;
  }

  /**
   * Sets the <code>memberId</code> property.
   */
 public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  /**
   * Sets the <code>memberId</code> property.
   */
  public DeleteBusinessMembershipMember memberId(String memberId) {
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

