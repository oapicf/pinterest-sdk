package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Body to be used on path to send Members or Partners Invite or Request
 **/
@ApiModel(description="Body to be used on path to send Members or Partners Invite or Request")

public class CreateMembershipOrPartnershipInvitesBody  {
  
public enum BusinessRoleEnum {

EMPLOYEE(String.valueOf("EMPLOYEE")), BIZ_ADMIN(String.valueOf("BIZ_ADMIN")), PARTNER(String.valueOf("PARTNER"));


    private String value;

    BusinessRoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
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

  @ApiModelProperty(example = "BIZ_ADMIN", required = true, value = "The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.")
 /**
   * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  **/
  private BusinessRoleEnum businessRole;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private InviteType inviteType;

  @ApiModelProperty(example = "[\"business0101\",\"user@business.com\"]", value = "A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE")
 /**
   * A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
  **/
  private List<String> members = new ArrayList<>();

  @ApiModelProperty(example = "[\"809944451643622187\",\"766456567741825556\"]", value = "A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST")
 /**
   * A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
  **/
  private List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners = new ArrayList<>();
 /**
   * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
   * @return businessRole
  **/
  @JsonProperty("business_role")
  @NotNull
  public String getBusinessRole() {
    if (businessRole == null) {
      return null;
    }
    return businessRole.value();
  }

  public void setBusinessRole(BusinessRoleEnum businessRole) {
    this.businessRole = businessRole;
  }

  public CreateMembershipOrPartnershipInvitesBody businessRole(BusinessRoleEnum businessRole) {
    this.businessRole = businessRole;
    return this;
  }

 /**
   * Get inviteType
   * @return inviteType
  **/
  @JsonProperty("invite_type")
  @NotNull
  public InviteType getInviteType() {
    return inviteType;
  }

  public void setInviteType(InviteType inviteType) {
    this.inviteType = inviteType;
  }

  public CreateMembershipOrPartnershipInvitesBody inviteType(InviteType inviteType) {
    this.inviteType = inviteType;
    return this;
  }

 /**
   * A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
   * @return members
  **/
  @JsonProperty("members")
 @Size(min=1,max=50)  public List<String> getMembers() {
    return members;
  }

  public void setMembers(List<String> members) {
    this.members = members;
  }

  public CreateMembershipOrPartnershipInvitesBody members(List<String> members) {
    this.members = members;
    return this;
  }

  public CreateMembershipOrPartnershipInvitesBody addMembersItem(String membersItem) {
    this.members.add(membersItem);
    return this;
  }

 /**
   * A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
   * @return partners
  **/
  @JsonProperty("partners")
 @Size(min=1,max=50)  public List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> getPartners() {
    return partners;
  }

  public void setPartners(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners) {
    this.partners = partners;
  }

  public CreateMembershipOrPartnershipInvitesBody partners(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners) {
    this.partners = partners;
    return this;
  }

  public CreateMembershipOrPartnershipInvitesBody addPartnersItem(String partnersItem) {
    this.partners.add(partnersItem);
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
    CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody = (CreateMembershipOrPartnershipInvitesBody) o;
    return Objects.equals(this.businessRole, createMembershipOrPartnershipInvitesBody.businessRole) &&
        Objects.equals(this.inviteType, createMembershipOrPartnershipInvitesBody.inviteType) &&
        Objects.equals(this.members, createMembershipOrPartnershipInvitesBody.members) &&
        Objects.equals(this.partners, createMembershipOrPartnershipInvitesBody.partners);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

