package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.BusinessRoleForMembers;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Single instance of a business member to have its role updated
 */

@Schema(name = "UpdateMemberBusinessRoleBody", description = "Single instance of a business member to have its role updated")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-11-05T02:06:27.403847795Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdateMemberBusinessRoleBody {

  private BusinessRoleForMembers businessRole;

  private String memberId;

  public UpdateMemberBusinessRoleBody() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public UpdateMemberBusinessRoleBody(BusinessRoleForMembers businessRole, String memberId) {
    this.businessRole = businessRole;
    this.memberId = memberId;
  }

  public UpdateMemberBusinessRoleBody businessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
    return this;
  }

  /**
   * Get businessRole
   * @return businessRole
   */
  @NotNull @Valid 
  @Schema(name = "business_role", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("business_role")
  public BusinessRoleForMembers getBusinessRole() {
    return businessRole;
  }

  public void setBusinessRole(BusinessRoleForMembers businessRole) {
    this.businessRole = businessRole;
  }

  public UpdateMemberBusinessRoleBody memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

  /**
   * Unique identifier of the member
   * @return memberId
   */
  @NotNull @Pattern(regexp = "^\\d+$") @Size(max = 25) 
  @Schema(name = "member_id", example = "140943737684417", description = "Unique identifier of the member", requiredMode = Schema.RequiredMode.REQUIRED)
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
    return Objects.equals(this.businessRole, updateMemberBusinessRoleBody.businessRole) &&
        Objects.equals(this.memberId, updateMemberBusinessRoleBody.memberId);
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

