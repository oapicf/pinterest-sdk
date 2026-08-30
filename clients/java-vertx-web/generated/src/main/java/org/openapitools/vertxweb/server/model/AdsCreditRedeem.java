package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Ads credit redemption
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsCreditRedeem   {
  
  private Integer errorCode;
  private String errorMessage;
  private Boolean success;

  public AdsCreditRedeem () {

  }

  public AdsCreditRedeem (Integer errorCode, String errorMessage, Boolean success) {
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
    this.success = success;
  }

    
  @JsonProperty("errorCode")
  public Integer getErrorCode() {
    return errorCode;
  }
  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

    
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }
  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

    
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
