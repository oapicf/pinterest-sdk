package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CampaignPlanningResponseErrorCode;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error encountered while estimating delivery for a campaign.
 */
@ApiModel(description="Error encountered while estimating delivery for a campaign.")

public class CampaignPlanningResponseError  {
  
  @ApiModelProperty(value = "")

  @Valid

  private CampaignPlanningResponseErrorCode code;

 /**
  * Human-readable error message.
  */
  @ApiModelProperty(value = "Human-readable error message.")

  private String message;
 /**
   * Get code
   * @return code
  **/
  @JsonProperty("code")
  public CampaignPlanningResponseErrorCode getCode() {
    return code;
  }

  public void setCode(CampaignPlanningResponseErrorCode code) {
    this.code = code;
  }

  public CampaignPlanningResponseError code(CampaignPlanningResponseErrorCode code) {
    this.code = code;
    return this;
  }

 /**
   * Human-readable error message.
   * @return message
  **/
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CampaignPlanningResponseError message(String message) {
    this.message = message;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

