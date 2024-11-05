package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessRoleForMembers;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Single instance of a business member to have its role updated
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Single instance of a business member to have its role updated")
public class UpdateMemberBusinessRoleBody   {
  
  private BusinessRoleForMembers businessRole;

  private String memberId;

  /**
   **/
  public UpdateMemberBusinessRoleBody businessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("business_role")
  @NotNull
  public BusinessRoleForMembers getBusinessRole() {
    return businessRole;
  }
  public void setBusinessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
  }


  /**
   * Unique identifier of the member
   **/
  public UpdateMemberBusinessRoleBody memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  
  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member")
  @JsonProperty("member_id")
  @NotNull
 @Pattern(regexp="^\\d+$") @Size(max=25)  public String getMemberId() {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

