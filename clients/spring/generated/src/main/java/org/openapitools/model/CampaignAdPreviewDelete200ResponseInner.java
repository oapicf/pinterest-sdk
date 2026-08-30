package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CampaignAdPreviewDelete200ResponseInnerStatus;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CampaignAdPreviewDelete200ResponseInner
 */

@JsonTypeName("campaign_ad_preview_delete_200_response_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignAdPreviewDelete200ResponseInner {

  private CampaignAdPreviewDelete200ResponseInnerStatus status;

  public CampaignAdPreviewDelete200ResponseInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignAdPreviewDelete200ResponseInner(CampaignAdPreviewDelete200ResponseInnerStatus status) {
    this.status = status;
  }

  public CampaignAdPreviewDelete200ResponseInner status(CampaignAdPreviewDelete200ResponseInnerStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @NotNull @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("status")
  public CampaignAdPreviewDelete200ResponseInnerStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(CampaignAdPreviewDelete200ResponseInnerStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignAdPreviewDelete200ResponseInner campaignAdPreviewDelete200ResponseInner = (CampaignAdPreviewDelete200ResponseInner) o;
    return Objects.equals(this.status, campaignAdPreviewDelete200ResponseInner.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreviewDelete200ResponseInner {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

