package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.CampaignPlanningResponseErrorCode;

/**
 * Error encountered while estimating delivery for a campaign.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignPlanningResponseError   {
  
  private CampaignPlanningResponseErrorCode code;
  private String message;

  public CampaignPlanningResponseError () {

  }

  public CampaignPlanningResponseError (CampaignPlanningResponseErrorCode code, String message) {
    this.code = code;
    this.message = message;
  }

    
  @JsonProperty("code")
  public CampaignPlanningResponseErrorCode getCode() {
    return code;
  }
  public void setCode(CampaignPlanningResponseErrorCode code) {
    this.code = code;
  }

    
  @JsonProperty("message")
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
