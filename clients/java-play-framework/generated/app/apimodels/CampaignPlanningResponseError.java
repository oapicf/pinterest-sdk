package apimodels;

import apimodels.CampaignPlanningResponseErrorCode;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Error encountered while estimating delivery for a campaign.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignPlanningResponseError   {
  @JsonProperty("code")
  @Valid

  private CampaignPlanningResponseErrorCode code;

  @JsonProperty("message")
  
  private String message;

  public CampaignPlanningResponseError code(CampaignPlanningResponseErrorCode code) {
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  public CampaignPlanningResponseErrorCode getCode() {
    return code;
  }

  public void setCode(CampaignPlanningResponseErrorCode code) {
    this.code = code;
  }

  public CampaignPlanningResponseError message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Human-readable error message.
   * @return message
  **/
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanningResponseError campaignPlanningResponseError = (CampaignPlanningResponseError) o;
    return Objects.equals(code, campaignPlanningResponseError.code) &&
        Objects.equals(message, campaignPlanningResponseError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningResponseError {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

