package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;



/**
 * Ads credit redemption
 **/

@ApiModel(description = "Ads credit redemption")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdsCreditRedeem   {
  @JsonProperty("errorCode")
  private Integer errorCode;

  @JsonProperty("errorMessage")
  private String errorMessage;

  @JsonProperty("success")
  private Boolean success;

  /**
   * Error code type if error occurs
   **/
  public AdsCreditRedeem errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  
  @ApiModelProperty(example = "2708", value = "Error code type if error occurs")
  @JsonProperty("errorCode")
  public Integer getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Reason for failure
   **/
  public AdsCreditRedeem errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  
  @ApiModelProperty(example = "The offer has already been redeemed by this advertiser", value = "Reason for failure")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
   **/
  public AdsCreditRedeem success(Boolean success) {
    this.success = success;
    return this;
  }

  
  @ApiModelProperty(example = "false", value = "Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).")
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
    this.success = success;
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
    return Objects.equals(errorCode, adsCreditRedeem.errorCode) &&
        Objects.equals(errorMessage, adsCreditRedeem.errorMessage) &&
        Objects.equals(success, adsCreditRedeem.success);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

