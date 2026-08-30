package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.CampaignPlanningResponseErrorCode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Error encountered while estimating delivery for a campaign.
 */
@ApiModel(description = "Error encountered while estimating delivery for a campaign.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningResponseError   {
  @JsonProperty("code")
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
   */
  @ApiModelProperty(value = "")
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
   */
  @ApiModelProperty(value = "Human-readable error message.")
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

