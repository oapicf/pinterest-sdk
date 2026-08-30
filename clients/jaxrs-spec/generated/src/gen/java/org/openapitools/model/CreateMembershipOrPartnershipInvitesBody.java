package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessRoleForInvite;
import org.openapitools.model.InviteType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Body to be used on path to send Members or Partners Invite or Request
 **/
@ApiModel(description = "Body to be used on path to send Members or Partners Invite or Request")
@JsonTypeName("CreateMembershipOrPartnershipInvitesBody")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CreateMembershipOrPartnershipInvitesBody   {
  private BusinessRoleForInvite businessRole;
  private InviteType inviteType;
  private @Valid List<String> members = new ArrayList<>();
  private @Valid List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners = new ArrayList<>();

  public CreateMembershipOrPartnershipInvitesBody() {
  }

  @JsonCreator
  public CreateMembershipOrPartnershipInvitesBody(
    @JsonProperty(required = true, value = "business_role") BusinessRoleForInvite businessRole,
    @JsonProperty(required = true, value = "invite_type") InviteType inviteType
  ) {
    this.businessRole = businessRole;
    this.inviteType = inviteType;
  }

  /**
   **/
  public CreateMembershipOrPartnershipInvitesBody businessRole(BusinessRoleForInvite businessRole) {
    this.businessRole = businessRole;
    return this;
  }

  
  @ApiModelProperty(example = "BIZ_ADMIN", required = true, value = "")
  @JsonProperty(required = true, value = "business_role")
  @NotNull public BusinessRoleForInvite getBusinessRole() {
    return businessRole;
  }

  @JsonProperty(required = true, value = "business_role")
  public void setBusinessRole(BusinessRoleForInvite businessRole) {
    this.businessRole = businessRole;
  }

  /**
   **/
  public CreateMembershipOrPartnershipInvitesBody inviteType(InviteType inviteType) {
    this.inviteType = inviteType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(required = true, value = "invite_type")
  @NotNull public InviteType getInviteType() {
    return inviteType;
  }

  @JsonProperty(required = true, value = "invite_type")
  public void setInviteType(InviteType inviteType) {
    this.inviteType = inviteType;
  }

  /**
   * A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
   **/
  public CreateMembershipOrPartnershipInvitesBody members(List<String> members) {
    this.members = members;
    return this;
  }

  
  @ApiModelProperty(example = "[\"business0101\",\"user@business.com\"]", value = "A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE")
  @JsonProperty("members")
   @Size(min=1,max=50)public List<String> getMembers() {
    return members;
  }

  @JsonProperty("members")
  public void setMembers(List<String> members) {
    this.members = members;
  }

  public CreateMembershipOrPartnershipInvitesBody addMembersItem(String membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<>();
    }

    this.members.add(membersItem);
    return this;
  }

  public CreateMembershipOrPartnershipInvitesBody removeMembersItem(String membersItem) {
    if (membersItem != null && this.members != null) {
      this.members.remove(membersItem);
    }

    return this;
  }
  /**
   * A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
   **/
  public CreateMembershipOrPartnershipInvitesBody partners(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners) {
    this.partners = partners;
    return this;
  }

  
  @ApiModelProperty(example = "[\"809944451643622187\",\"766456567741825556\"]", value = "A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST")
  @JsonProperty("partners")
   @Size(min=1,max=50)public List< @Pattern(regexp="^\\d+$") @Size(max=25)String> getPartners() {
    return partners;
  }

  @JsonProperty("partners")
  public void setPartners(List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners) {
    this.partners = partners;
  }

  public CreateMembershipOrPartnershipInvitesBody addPartnersItem(String partnersItem) {
    if (this.partners == null) {
      this.partners = new ArrayList<>();
    }

    this.partners.add(partnersItem);
    return this;
  }

  public CreateMembershipOrPartnershipInvitesBody removePartnersItem(String partnersItem) {
    if (partnersItem != null && this.partners != null) {
      this.partners.remove(partnersItem);
    }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
