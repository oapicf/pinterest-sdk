package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BusinessRoleForMembers;

/**
 * MembersToDeleteBodyMembersInner
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class MembersToDeleteBodyMembersInner   {
  @JsonProperty("member_id")
  private String memberId;

  @JsonProperty("business_role")
  private BusinessRoleForMembers businessRole;

  public MembersToDeleteBodyMembersInner memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Unique identifier of the member
   * @return memberId
  **/
  @ApiModelProperty(example = "140943737684417", required = true, value = "Unique identifier of the member")
  public String getMemberId() {
    return memberId;
  }

  public void setMemberId(String memberId) {
    this.memberId = memberId;
  }

  public MembersToDeleteBodyMembersInner businessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
    return this;
  }

   /**
   * Get businessRole
   * @return businessRole
  **/
  @ApiModelProperty(required = true, value = "")
  public BusinessRoleForMembers getBusinessRole() {
    return businessRole;
  }

  public void setBusinessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MembersToDeleteBodyMembersInner membersToDeleteBodyMembersInner = (MembersToDeleteBodyMembersInner) o;
    return Objects.equals(this.memberId, membersToDeleteBodyMembersInner.memberId) &&
        Objects.equals(this.businessRole, membersToDeleteBodyMembersInner.businessRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(memberId, businessRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MembersToDeleteBodyMembersInner {\n");
    
    sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
    sb.append("    businessRole: ").append(toIndentedString(businessRole)).append("\n");
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

