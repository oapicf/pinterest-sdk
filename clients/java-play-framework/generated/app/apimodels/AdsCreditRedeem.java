package apimodels;

import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Ads credit redemption
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdsCreditRedeem   {
  @JsonProperty("errorCode")
  
  private Integer errorCode;

  @JsonProperty("errorMessage")
  
  private String errorMessage;

  @JsonProperty("success")
  
  private Boolean success;

  public AdsCreditRedeem errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error code type if error occurs
   * @return errorCode
  **/
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public AdsCreditRedeem errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * Reason for failure
   * @return errorMessage
  **/
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public AdsCreditRedeem success(Boolean success) {
    this.success = success;
    return this;
  }

   /**
   * Returns true if the offer code was successfully applied(validateOnly=false) or can be applied(validateOnly=true).
   * @return success
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

