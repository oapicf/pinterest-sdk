package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.CampaignAdPreviewCreate200ResponseInnerData;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CampaignAdPreviewCreate200ResponseInner
 */

@JsonTypeName("campaign_ad_preview_create_200_response_inner")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignAdPreviewCreate200ResponseInner {

  private CampaignAdPreviewCreate200ResponseInnerData data;

  public CampaignAdPreviewCreate200ResponseInner() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignAdPreviewCreate200ResponseInner(CampaignAdPreviewCreate200ResponseInnerData data) {
    this.data = data;
  }

  public CampaignAdPreviewCreate200ResponseInner data(CampaignAdPreviewCreate200ResponseInnerData data) {
    this.data = data;
    return this;
  }

  /**
   * Get data
   * @return data
   */
  @NotNull @Valid 
  @Schema(name = "data", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("data")
  public CampaignAdPreviewCreate200ResponseInnerData getData() {
    return data;
  }

  @JsonProperty("data")
  public void setData(CampaignAdPreviewCreate200ResponseInnerData data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignAdPreviewCreate200ResponseInner campaignAdPreviewCreate200ResponseInner = (CampaignAdPreviewCreate200ResponseInner) o;
    return Objects.equals(this.data, campaignAdPreviewCreate200ResponseInner.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignAdPreviewCreate200ResponseInner {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

