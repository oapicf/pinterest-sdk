package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.BusinessRoleForMembers;

/**
 * Single instance of a business member to have its role updated
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateMemberBusinessRoleBody   {
  
  private BusinessRoleForMembers businessRole;
  private String memberId;

  public UpdateMemberBusinessRoleBody () {

  }

  public UpdateMemberBusinessRoleBody (BusinessRoleForMembers businessRole, String memberId) {
    this.businessRole = businessRole;
    this.memberId = memberId;
  }

    
  @JsonProperty("business_role")
  public BusinessRoleForMembers getBusinessRole() {
    return businessRole;
  }
  public void setBusinessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
  }

    
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
    UpdateMemberBusinessRoleBody updateMemberBusinessRoleBody = (UpdateMemberBusinessRoleBody) o;
    return Objects.equals(businessRole, updateMemberBusinessRoleBody.businessRole) &&
        Objects.equals(memberId, updateMemberBusinessRoleBody.memberId);
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
