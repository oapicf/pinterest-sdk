package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BusinessAccessError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class UpdatePartnerResultsResponseArrayItemsInner  {
  
  @ApiModelProperty(value = "")
  @Valid
  private BusinessAccessError exception;

  @ApiModelProperty(example = "1234567890123", value = "")
  private String memberOrPartnerId;
 /**
   * Get exception
   * @return exception
  **/
  @JsonProperty("exception")
  public BusinessAccessError getException() {
    return exception;
  }

  public void setException(BusinessAccessError exception) {
    this.exception = exception;
  }

  public UpdatePartnerResultsResponseArrayItemsInner exception(BusinessAccessError exception) {
    this.exception = exception;
    return this;
  }

 /**
   * Get memberOrPartnerId
   * @return memberOrPartnerId
  **/
  @JsonProperty("member_or_partner_id")
 @Pattern(regexp="^\\d+$") @Size(max=18)  public String getMemberOrPartnerId() {
    return memberOrPartnerId;
  }

  public void setMemberOrPartnerId(String memberOrPartnerId) {
    this.memberOrPartnerId = memberOrPartnerId;
  }

  public UpdatePartnerResultsResponseArrayItemsInner memberOrPartnerId(String memberOrPartnerId) {
    this.memberOrPartnerId = memberOrPartnerId;
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
    UpdatePartnerResultsResponseArrayItemsInner updatePartnerResultsResponseArrayItemsInner = (UpdatePartnerResultsResponseArrayItemsInner) o;
    return Objects.equals(this.exception, updatePartnerResultsResponseArrayItemsInner.exception) &&
        Objects.equals(this.memberOrPartnerId, updatePartnerResultsResponseArrayItemsInner.memberOrPartnerId);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

