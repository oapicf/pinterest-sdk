package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdsCreditRedeemResponse   {
  
  private Boolean success;
  private Integer errorCode;
  private String errorMessage;

  public AdsCreditRedeemResponse () {

  }

  public AdsCreditRedeemResponse (Boolean success, Integer errorCode, String errorMessage) {
    this.success = success;
    this.errorCode = errorCode;
    this.errorMessage = errorMessage;
  }

    
  @JsonProperty("success")
  public Boolean getSuccess() {
    return success;
  }
  public void setSuccess(Boolean success) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdsCreditRedeemResponse adsCreditRedeemResponse = (AdsCreditRedeemResponse) o;
    return Objects.equals(success, adsCreditRedeemResponse.success) &&
        Objects.equals(errorCode, adsCreditRedeemResponse.errorCode) &&
        Objects.equals(errorMessage, adsCreditRedeemResponse.errorMessage);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
