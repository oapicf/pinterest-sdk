package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.CampaignPlanningResponseErrorCode;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Error encountered while estimating delivery for a campaign.
 */

@Schema(name = "CampaignPlanningResponseError", description = "Error encountered while estimating delivery for a campaign.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningResponseError {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable CampaignPlanningResponseErrorCode code;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String message;

  public CampaignPlanningResponseError code(@Nullable CampaignPlanningResponseErrorCode code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
   */
  @Valid 
  @Schema(name = "code", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("code")
  public @Nullable CampaignPlanningResponseErrorCode getCode() {
    return code;
  }

  @JsonProperty("code")
  public void setCode(@Nullable CampaignPlanningResponseErrorCode code) {
    this.code = code;
  }

  public CampaignPlanningResponseError message(@Nullable String message) {
    this.message = message;
    return this;
  }

  /**
   * Human-readable error message.
   * @return message
   */
  
  @Schema(name = "message", description = "Human-readable error message.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("message")
  public @Nullable String getMessage() {
    return message;
  }

  @JsonProperty("message")
  public void setMessage(@Nullable String message) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

