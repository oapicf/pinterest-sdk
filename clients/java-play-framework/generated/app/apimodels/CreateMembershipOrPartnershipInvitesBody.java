package apimodels;

import apimodels.InviteType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Body to be used on path to send Members or Partners Invite or Request
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CreateMembershipOrPartnershipInvitesBody   {
  /**
   * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
   */
  public enum BusinessRoleEnum {
    EMPLOYEE("EMPLOYEE"),
    
    BIZ_ADMIN("BIZ_ADMIN"),
    
    PARTNER("PARTNER");

    private final String value;

    BusinessRoleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static BusinessRoleEnum fromValue(String value) {
      for (BusinessRoleEnum b : BusinessRoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("business_role")
  @NotNull

  private BusinessRoleEnum businessRole;

  @JsonProperty("invite_type")
  @NotNull
@Valid

  private InviteType inviteType;

  @JsonProperty("members")
  @Size(min=1,max=50)

  private List<String> members = null;

  @JsonProperty("partners")
  @Size(min=1,max=50)

  private List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners = null;

  public CreateMembershipOrPartnershipInvitesBody businessRole(BusinessRoleEnum businessRole) {
    this.businessRole = businessRole;
    return this;
  }

   /**
   * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
   * @return businessRole
  **/
  public BusinessRoleEnum getBusinessRole() {
    return businessRole;
  }

  public void setBusinessRole(BusinessRoleEnum businessRole) {
    this.businessRole = businessRole;
  }

  public CreateMembershipOrPartnershipInvitesBody inviteType(InviteType inviteType) {
    this.inviteType = inviteType;
    return this;
  }

   /**
   * Get inviteType
   * @return inviteType
  **/
  public InviteType getInviteType() {
    return inviteType;
  }

  public void setInviteType(InviteType inviteType) {
    this.inviteType = inviteType;
  }

  public CreateMembershipOrPartnershipInvitesBody members(List<String> members) {
    this.members = members;
    return this;
  }

  public CreateMembershipOrPartnershipInvitesBody addMembersItem(String membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }
    this.members.add(membersItem);
    return this;
  }

   /**
   * A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
   * @return members
  **/
  public List<String> getMembers() {
    return members;
  }

  public void setMembers(List<String> members) {
    this.members = members;
  }

  public CreateMembershipOrPartnershipInvitesBody partners(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners) {
    this.partners = partners;
    return this;
  }

  public CreateMembershipOrPartnershipInvitesBody addPartnersItem(String partnersItem) {
    if (this.partners == null) {
      this.partners = new ArrayList<>();
    }
    this.partners.add(partnersItem);
    return this;
  }

   /**
   * A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
   * @return partners
  **/
  public List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> getPartners() {
    return partners;
  }

  public void setPartners(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

