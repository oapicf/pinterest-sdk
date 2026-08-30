package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Ads credit redemption
 */
@ApiModel(description="Ads credit redemption")

public class AdsCreditRedeem  {
  
 /**
  * Error code type if error occurs
  */
  @ApiModelProperty(example = "2708", value = "Error code type if error occurs")
  private Integer errorCode;

 /**
  * Reason for failure
  */
  @ApiModelProperty(example = "The offer has already been redeemed by this advertiser", value = "Reason for failure")
  private String errorMessage;

 /**
  * Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
  */
  @ApiModelProperty(example = "false", value = "Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).")
  private Boolean success;
 /**
  * Error code type if error occurs
  * @return errorCode
  */
  @JsonProperty("errorCode")
  public Integer getErrorCode() {
    return errorCode;
  }

  /**
   * Sets the <code>errorCode</code> property.
   * <br><em>N.B. <code>errorCode</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Sets the <code>errorCode</code> property.
   * <br><em>N.B. <code>errorCode</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AdsCreditRedeem errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

 /**
  * Reason for failure
  * @return errorMessage
  */
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  /**
   * Sets the <code>errorMessage</code> property.
   * <br><em>N.B. <code>errorMessage</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Sets the <code>errorMessage</code> property.
   * <br><em>N.B. <code>errorMessage</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AdsCreditRedeem errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

 /**
  * Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).
  * @return success
  */
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }

  /**
   * Sets the <code>success</code> property.
   * <br><em>N.B. <code>success</code> is <b>read only</b>; client code should not call this method</em>.
   */
 public void setSuccess(Boolean success) {
    this.success = success;
  }

  /**
   * Sets the <code>success</code> property.
   * <br><em>N.B. <code>success</code> is <b>read only</b>; client code should not call this method</em>.
   */
  public AdsCreditRedeem success(Boolean success) {
    this.success = success;
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
    AdsCreditRedeem adsCreditRedeem = (AdsCreditRedeem) o;
    return Objects.equals(this.errorCode, adsCreditRedeem.errorCode) &&
        Objects.equals(this.errorMessage, adsCreditRedeem.errorMessage) &&
        Objects.equals(this.success, adsCreditRedeem.success);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, errorMessage, success);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdsCreditRedeem {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    success: ").append(toIndentedString(success)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

