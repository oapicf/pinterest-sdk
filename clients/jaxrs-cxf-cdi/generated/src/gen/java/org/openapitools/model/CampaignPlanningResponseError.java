package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CampaignPlanningResponseErrorCode;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Error encountered while estimating delivery for a campaign.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Error encountered while estimating delivery for a campaign.")
public class CampaignPlanningResponseError   {
  
  private CampaignPlanningResponseErrorCode code;

  private String message;

  /**
   **/
  public CampaignPlanningResponseError code(CampaignPlanningResponseErrorCode code) {
    this.code = code;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("code")
  public CampaignPlanningResponseErrorCode getCode() {
    return code;
  }
  public void setCode(CampaignPlanningResponseErrorCode code) {
    this.code = code;
  }


  /**
   * Human-readable error message.
   **/
  public CampaignPlanningResponseError message(String message) {
    this.message = message;
    return this;
  }

  
  @ApiModelProperty(value = "Human-readable error message.")
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

