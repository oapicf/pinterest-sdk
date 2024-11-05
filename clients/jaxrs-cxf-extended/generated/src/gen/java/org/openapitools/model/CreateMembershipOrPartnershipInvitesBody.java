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
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Body to be used on path to send Members or Partners Invite or Request
 */
@ApiModel(description="Body to be used on path to send Members or Partners Invite or Request")

public class CreateMembershipOrPartnershipInvitesBody  {
  
public enum BusinessRoleEnum {

    @JsonProperty("EMPLOYEE") EMPLOYEE(String.valueOf("EMPLOYEE")),
    @JsonProperty("BIZ_ADMIN") BIZ_ADMIN(String.valueOf("BIZ_ADMIN")),
    @JsonProperty("PARTNER") PARTNER(String.valueOf("PARTNER"));

    private String value;

    BusinessRoleEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static BusinessRoleEnum fromValue(String value) {
        for (BusinessRoleEnum b : BusinessRoleEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  */
  @ApiModelProperty(example = "BIZ_ADMIN", required = true, value = "The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.")
  private BusinessRoleEnum businessRole;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private InviteType inviteType;

 /**
  * A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
  */
  @ApiModelProperty(example = "[\"business0101\",\"user@business.com\"]", value = "A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE")
  private List<String> members = new ArrayList<>();

 /**
  * A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
  */
  @ApiModelProperty(example = "[\"809944451643622187\",\"766456567741825556\"]", value = "A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST")
  private List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners = new ArrayList<>();
 /**
  * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
  * @return businessRole
  */
  @JsonProperty("business_role")
  @NotNull
  public String getBusinessRole() {
    return businessRole == null ? null : businessRole.value();
  }

  /**
   * Sets the <code>businessRole</code> property.
   */
 public void setBusinessRole(BusinessRoleEnum businessRole) {
    this.businessRole = businessRole;
  }

  /**
   * Sets the <code>businessRole</code> property.
   */
  public CreateMembershipOrPartnershipInvitesBody businessRole(BusinessRoleEnum businessRole) {
    this.businessRole = businessRole;
    return this;
  }

 /**
  * Get inviteType
  * @return inviteType
  */
  @JsonProperty("invite_type")
  @NotNull
  public InviteType getInviteType() {
    return inviteType;
  }

  /**
   * Sets the <code>inviteType</code> property.
   */
 public void setInviteType(InviteType inviteType) {
    this.inviteType = inviteType;
  }

  /**
   * Sets the <code>inviteType</code> property.
   */
  public CreateMembershipOrPartnershipInvitesBody inviteType(InviteType inviteType) {
    this.inviteType = inviteType;
    return this;
  }

 /**
  * A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
  * @return members
  */
  @JsonProperty("members")
 @Size(min=1,max=50)  public List<String> getMembers() {
    return members;
  }

  /**
   * Sets the <code>members</code> property.
   */
 public void setMembers(List<String> members) {
    this.members = members;
  }

  /**
   * Sets the <code>members</code> property.
   */
  public CreateMembershipOrPartnershipInvitesBody members(List<String> members) {
    this.members = members;
    return this;
  }

  /**
   * Adds a new item to the <code>members</code> list.
   */
  public CreateMembershipOrPartnershipInvitesBody addMembersItem(String membersItem) {
    this.members.add(membersItem);
    return this;
  }

 /**
  * A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
  * @return partners
  */
  @JsonProperty("partners")
 @Size(min=1,max=50)  public List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> getPartners() {
    return partners;
  }

  /**
   * Sets the <code>partners</code> property.
   */
 public void setPartners(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners) {
    this.partners = partners;
  }

  /**
   * Sets the <code>partners</code> property.
   */
  public CreateMembershipOrPartnershipInvitesBody partners(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners) {
    this.partners = partners;
    return this;
  }

  /**
   * Adds a new item to the <code>partners</code> list.
   */
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

