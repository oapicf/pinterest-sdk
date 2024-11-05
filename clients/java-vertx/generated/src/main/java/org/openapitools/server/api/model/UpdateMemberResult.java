package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdateMemberResult   {
  
  private String businessRole;
  private String memberId;

  public UpdateMemberResult () {

  }

  public UpdateMemberResult (String businessRole, String memberId) {
    this.businessRole = businessRole;
    this.memberId = memberId;
  }

    
  @JsonProperty("business_role")
  public String getBusinessRole() {
    return businessRole;
  }
  public void setBusinessRole(String businessRole) {
    this.businessRole = businessRole;
  }

    
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
    UpdateMemberResult updateMemberResult = (UpdateMemberResult) o;
    return Objects.equals(businessRole, updateMemberResult.businessRole) &&
        Objects.equals(memberId, updateMemberResult.memberId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessRole, memberId);
  }

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
