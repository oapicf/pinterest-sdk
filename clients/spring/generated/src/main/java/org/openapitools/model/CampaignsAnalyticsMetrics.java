package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CampaignsAnalyticsMetrics
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignsAnalyticsMetrics {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String CAMPAIGN_ID;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate DATE;

  public CampaignsAnalyticsMetrics CAMPAIGN_ID(@Nullable String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
    return this;
  }

  /**
   * The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.
   * @return CAMPAIGN_ID
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "CAMPAIGN_ID", description = "The ID of the campaing that this metrics belongs to. Returned as long as aggregate_report_rows is not true.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("CAMPAIGN_ID")
  public @Nullable String getCAMPAIGNID() {
    return CAMPAIGN_ID;
  }

  @JsonProperty("CAMPAIGN_ID")
  public void setCAMPAIGNID(@Nullable String CAMPAIGN_ID) {
    this.CAMPAIGN_ID = CAMPAIGN_ID;
  }

  public CampaignsAnalyticsMetrics DATE(@Nullable LocalDate DATE) {
    this.DATE = DATE;
    return this;
  }

  /**
   * Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
   * @return DATE
   */
  @Valid 
  @Schema(name = "DATE", description = "Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("DATE")
  public @Nullable LocalDate getDATE() {
    return DATE;
  }

  @JsonProperty("DATE")
  public void setDATE(@Nullable LocalDate DATE) {
    this.DATE = DATE;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignsAnalyticsMetrics campaignsAnalyticsMetrics = (CampaignsAnalyticsMetrics) o;
    return Objects.equals(this.CAMPAIGN_ID, campaignsAnalyticsMetrics.CAMPAIGN_ID) &&
        Objects.equals(this.DATE, campaignsAnalyticsMetrics.DATE);
  }

  @Override
  public int hashCode() {
    return Objects.hash(CAMPAIGN_ID, DATE);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignsAnalyticsMetrics {\n");
    sb.append("    CAMPAIGN_ID: ").append(toIndentedString(CAMPAIGN_ID)).append("\n");
    sb.append("    DATE: ").append(toIndentedString(DATE)).append("\n");
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

