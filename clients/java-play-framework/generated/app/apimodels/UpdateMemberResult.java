package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * UpdateMemberResult
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-11-05T02:05:01.869958855Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class UpdateMemberResult   {
  @JsonProperty("business_role")
  
  private String businessRole;

  @JsonProperty("member_id")
  @Pattern(regexp="^\\d+$")

  private String memberId;

  public UpdateMemberResult businessRole(String businessRole) {
    this.businessRole = businessRole;
    return this;
  }

   /**
   * The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access.
   * @return businessRole
  **/
  public String getBusinessRole() {
    return businessRole;
  }

  public void setBusinessRole(String businessRole) {
    this.businessRole = businessRole;
  }

  public UpdateMemberResult memberId(String memberId) {
    this.memberId = memberId;
    return this;
  }

   /**
   * Unique identifier of the business member.
   * @return memberId
  **/
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
    UpdateMemberResult updateMemberResult = (UpdateMemberResult) o;
    return Objects.equals(businessRole, updateMemberResult.businessRole) &&
        Objects.equals(memberId, updateMemberResult.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessRole, memberId);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMemberResult {\n");
    
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

