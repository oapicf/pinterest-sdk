package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.api.model.BusinessAccessError;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class UpdatePartnerResultsResponseArrayItemsInner   {
  
  private BusinessAccessError exception;
  private String memberOrPartnerId;

  public UpdatePartnerResultsResponseArrayItemsInner () {

  }

  public UpdatePartnerResultsResponseArrayItemsInner (BusinessAccessError exception, String memberOrPartnerId) {
    this.exception = exception;
    this.memberOrPartnerId = memberOrPartnerId;
  }

    
  @JsonProperty("exception")
  public BusinessAccessError getException() {
    return exception;
  }
  public void setException(BusinessAccessError exception) {
    this.exception = exception;
  }

    
  @JsonProperty("member_or_partner_id")
  public String getMemberOrPartnerId() {
    return memberOrPartnerId;
  }
  public void setMemberOrPartnerId(String memberOrPartnerId) {
    this.memberOrPartnerId = memberOrPartnerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatePartnerResultsResponseArrayItemsInner updatePartnerResultsResponseArrayItemsInner = (UpdatePartnerResultsResponseArrayItemsInner) o;
    return Objects.equals(exception, updatePartnerResultsResponseArrayItemsInner.exception) &&
        Objects.equals(memberOrPartnerId, updatePartnerResultsResponseArrayItemsInner.memberOrPartnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exception, memberOrPartnerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatePartnerResultsResponseArrayItemsInner {\n");
    
    sb.append("    exception: ").append(toIndentedString(exception)).append("\n");
    sb.append("    memberOrPartnerId: ").append(toIndentedString(memberOrPartnerId)).append("\n");
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
