package org.openapitools.model;

import org.openapitools.jackson.nullable.JsonNullable;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Ads credit redemption
 */
public class AdsCreditRedeem implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Error code type if error occurs
   */
  @JsonProperty("errorCode")
  private Integer errorCode;

  /**
   * Reason for failure
   */
  @JsonProperty("errorMessage")
  private String errorMessage;

  /**
   * Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).
   */
  @JsonProperty("success")
  private Boolean success;

  /**
   * Error code type if error occurs
   * @return errorCode
   */
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  /**
   * Reason for failure
   * @return errorMessage
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  /**
   * Returns true if the offer code was successfully applied(validateOnly&#x3D;false) or can be applied(validateOnly&#x3D;true).
   * @return success
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
