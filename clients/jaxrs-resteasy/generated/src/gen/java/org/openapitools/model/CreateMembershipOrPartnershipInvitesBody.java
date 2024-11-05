package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.InviteType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Body to be used on path to send Members or Partners Invite or Request")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-11-05T02:20:31.447227872Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class CreateMembershipOrPartnershipInvitesBody   {
  

  /**
   * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
   */
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
      return String.valueOf(value);
    }
  }

  private BusinessRoleEnum businessRole;
  private InviteType inviteType;
  private List<String> members = new ArrayList<>();
  private List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> partners = new ArrayList<>();

  /**
   * The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.
   **/
  
  @ApiModelProperty(example = "BIZ_ADMIN", required = true, value = "The business access level to grant member/partner. Note, values are case-sensitive. - EMPLOYEE: Can only view and access assets you assign them to. They cannot see details about other employees, partners, or other assets. - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. - PARTNER: Can only view and access assets you assign them to/or they assign to you.")
  @JsonProperty("business_role")
  @NotNull
  public BusinessRoleEnum getBusinessRole() {
    return businessRole;
  }
  public void setBusinessRole(BusinessRoleEnum businessRole) {
    this.businessRole = businessRole;
  }

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("invite_type")
  @NotNull
  @Valid
  public InviteType getInviteType() {
    return inviteType;
  }
  public void setInviteType(InviteType inviteType) {
    this.inviteType = inviteType;
  }

  /**
   * A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE
   **/
  
  @ApiModelProperty(example = "[\"business0101\",\"user@business.com\"]", value = "A list of usernames, emails, or a mix of them. Should be used if invite_type is MEMBER_INVITE")
  @JsonProperty("members")
 @Size(min=1,max=50)  public List<String> getMembers() {
    return members;
  }
  public void setMembers(List<String> members) {
    this.members = members;
  }

  /**
   * A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST
   **/
  
  @ApiModelProperty(example = "[\"809944451643622187\",\"766456567741825556\"]", value = "A list of partner_id. Should be used if invite_type is PARTNER_INVITE or PARTNER_REQUEST")
  @JsonProperty("partners")
 @Size(min=1,max=50)  public List<@Pattern(regexp = "^\\d+$")@Size(max = 25)String> getPartners() {
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

