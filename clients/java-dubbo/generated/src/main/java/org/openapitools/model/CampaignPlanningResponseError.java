package org.openapitools.model;

import org.openapitools.model.CampaignPlanningResponseErrorCode;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Error encountered while estimating delivery for a campaign.
 */
public class CampaignPlanningResponseError implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("code")
  private CampaignPlanningResponseErrorCode code;

  /**
   * Human-readable error message.
   */
  @JsonProperty("message")
  private String message;

  /**
   * 
   * @return code
   */
  public CampaignPlanningResponseErrorCode getCode() {
    return code;
  }

  public void setCode(CampaignPlanningResponseErrorCode code) {
    this.code = code;
  }

  /**
   * Human-readable error message.
   * @return message
   */
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
    return Objects.equals(this.code, campaignPlanningResponseError.code) &&
        Objects.equals(this.message, campaignPlanningResponseError.message);
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
