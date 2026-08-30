package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.BusinessRoleForMembers;

/**
 * Single instance of a business member to be removed from the business.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeleteBusinessMembershipMember   {
  
  private BusinessRoleForMembers businessRole;
  private String memberId;

  public DeleteBusinessMembershipMember () {

  }

  public DeleteBusinessMembershipMember (BusinessRoleForMembers businessRole, String memberId) {
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
    DeleteBusinessMembershipMember deleteBusinessMembershipMember = (DeleteBusinessMembershipMember) o;
    return Objects.equals(businessRole, deleteBusinessMembershipMember.businessRole) &&
        Objects.equals(memberId, deleteBusinessMembershipMember.memberId);
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
