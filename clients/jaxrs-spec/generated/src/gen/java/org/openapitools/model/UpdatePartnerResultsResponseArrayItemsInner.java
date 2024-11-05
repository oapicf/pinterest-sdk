package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BusinessAccessError;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("UpdatePartnerResultsResponseArray_items_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-11-05T02:21:14.931372798Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public class UpdatePartnerResultsResponseArrayItemsInner   {
  private BusinessAccessError exception;
  private String memberOrPartnerId;

  /**
   **/
  public UpdatePartnerResultsResponseArrayItemsInner exception(BusinessAccessError exception) {
    this.exception = exception;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("exception")
  @Valid public BusinessAccessError getException() {
    return exception;
  }

  @JsonProperty("exception")
  public void setException(BusinessAccessError exception) {
    this.exception = exception;
  }

  /**
   **/
  public UpdatePartnerResultsResponseArrayItemsInner memberOrPartnerId(String memberOrPartnerId) {
    this.memberOrPartnerId = memberOrPartnerId;
    return this;
  }

  
  @ApiModelProperty(example = "1234567890123", value = "")
  @JsonProperty("member_or_partner_id")
   @Pattern(regexp="^\\d+$") @Size(max=18)public String getMemberOrPartnerId() {
    return memberOrPartnerId;
  }

  @JsonProperty("member_or_partner_id")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

