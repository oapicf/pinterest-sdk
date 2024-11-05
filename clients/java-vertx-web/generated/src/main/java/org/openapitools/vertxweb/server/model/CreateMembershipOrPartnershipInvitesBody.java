package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.InviteType;

/**
 * Body to be used on path to send Members or Partners Invite or Request
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreateMembershipOrPartnershipInvitesBody   {
  


  public enum BusinessRoleEnum {
    EMPLOYEE("EMPLOYEE"),
    BIZ_ADMIN("BIZ_ADMIN"),
    PARTNER("PARTNER");

    private String value;

    BusinessRoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private BusinessRoleEnum businessRole;
  private InviteType inviteType;
  private List<String> members = new ArrayList<>();
  private List<String> partners = new ArrayList<>();

  public CreateMembershipOrPartnershipInvitesBody () {

  }

  public CreateMembershipOrPartnershipInvitesBody (BusinessRoleEnum businessRole, InviteType inviteType, List<String> members, List<String> partners) {
    this.businessRole = businessRole;
    this.inviteType = inviteType;
    this.members = members;
    this.partners = partners;
  }

    
  @JsonProperty("business_role")
  public BusinessRoleEnum getBusinessRole() {
    return businessRole;
  }
  public void setBusinessRole(BusinessRoleEnum businessRole) {
    this.businessRole = businessRole;
  }

    
  @JsonProperty("invite_type")
  public InviteType getInviteType() {
    return inviteType;
  }
  public void setInviteType(InviteType inviteType) {
    this.inviteType = inviteType;
  }

    
  @JsonProperty("members")
  public List<String> getMembers() {
    return members;
  }
  public void setMembers(List<String> members) {
    this.members = members;
  }

    
  @JsonProperty("partners")
  public List<String> getPartners() {
    return partners;
  }
  public void setPartners(List<String> partners) {
    this.partners = partners;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody = (CreateMembershipOrPartnershipInvitesBody) o;
    return Objects.equals(businessRole, createMembershipOrPartnershipInvitesBody.businessRole) &&
        Objects.equals(inviteType, createMembershipOrPartnershipInvitesBody.inviteType) &&
        Objects.equals(members, createMembershipOrPartnershipInvitesBody.members) &&
        Objects.equals(partners, createMembershipOrPartnershipInvitesBody.partners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessRole, inviteType, members, partners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateMembershipOrPartnershipInvitesBody {\n");
    
    sb.append("    businessRole: ").append(toIndentedString(businessRole)).append("\n");
    sb.append("    inviteType: ").append(toIndentedString(inviteType)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    partners: ").append(toIndentedString(partners)).append("\n");
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
