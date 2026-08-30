package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.BusinessRoleForInvite;
import org.openapitools.model.InviteType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Body to be used on path to send Members or Partners Invite or Request
 */

@Schema(name = "CreateMembershipOrPartnershipInvitesBody", description = "Body to be used on path to send Members or Partners Invite or Request")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CreateMembershipOrPartnershipInvitesBody {

  private BusinessRoleForInvite businessRole;

  private InviteType inviteType;

  @Valid
  private List<String> members = new ArrayList<>();

  @Valid
  private List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners = new ArrayList<>();

  public CreateMembershipOrPartnershipInvitesBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CreateMembershipOrPartnershipInvitesBody(BusinessRoleForInvite businessRole, InviteType inviteType) {
    this.businessRole = businessRole;
    this.inviteType = inviteType;
  }

  public CreateMembershipOrPartnershipInvitesBody businessRole(BusinessRoleForInvite businessRole) {
    this.businessRole = businessRole;
    return this;
  }

  /**
   * Get businessRole
   * @return businessRole
   */
  @NotNull @Valid 
  @Schema(name = "business_role", example = "BIZ_ADMIN", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("business_role")
  public BusinessRoleForInvite getBusinessRole() {
    return businessRole;
  }

  public void setBusinessRole(BusinessRoleForInvite businessRole) {
    this.businessRole = businessRole;
  }

  public CreateMembershipOrPartnershipInvitesBody inviteType(InviteType inviteType) {
    this.inviteType = inviteType;
    return this;
  }

  /**
   * Get inviteType
   * @return inviteType
   */
  @NotNull @Valid 
  @Schema(name = "invite_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("invite_type")
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
   */
  @Size(min = 1, max = 50) 
  @Schema(name = "members", example = "[\"business0101\",\"user@business.com\"]", description = "A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("members")
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
   */
  @Size(min = 1, max = 50) 
  @Schema(name = "partners", example = "[\"809944451643622187\",\"766456567741825556\"]", description = "A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("partners")
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

