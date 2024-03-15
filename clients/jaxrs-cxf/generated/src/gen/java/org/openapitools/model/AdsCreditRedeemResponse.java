package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdsCreditRedeemResponse  {
  
  @ApiModelProperty(example = "false", value = "Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).")
 /**
   * Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
  **/
  private Boolean success;

  @ApiModelProperty(example = "2708", value = "Error code type if error occurs")
 /**
   * Error code type if error occurs
  **/
  private Integer errorCode;

  @ApiModelProperty(example = "The offer has already been redeemed by this advertiser", value = "Reason for failure")
 /**
   * Reason for failure
  **/
  private String errorMessage;
 /**
   * Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).
   * @return success
  **/
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }

  public void setSuccess(Boolean success) {
    this.success = success;
  }

  public AdsCreditRedeemResponse success(Boolean success) {
    this.success = success;
    return this;
  }

 /**
   * Error code type if error occurs
   * @return errorCode
  **/
  @JsonProperty("errorCode")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public AdsCreditRedeemResponse errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
   * Reason for failure
   * @return errorMessage
  **/
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public AdsCreditRedeemResponse errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
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
    AdsCreditRedeemResponse adsCreditRedeemResponse = (AdsCreditRedeemResponse) o;
    return Objects.equals(this.success, adsCreditRedeemResponse.success) &&
        Objects.equals(this.errorCode, adsCreditRedeemResponse.errorCode) &&
        Objects.equals(this.errorMessage, adsCreditRedeemResponse.errorMessage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(success, errorCode, errorMessage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsCreditRedeemResponse {\n");
    
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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

