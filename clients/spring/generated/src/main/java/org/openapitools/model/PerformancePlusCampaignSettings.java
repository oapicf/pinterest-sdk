package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Pinterest Performance+ campaign settings.
 */

@Schema(name = "PerformancePlusCampaignSettings", description = "Pinterest Performance+ campaign settings.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PerformancePlusCampaignSettings {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean boostProspectingAdGroupBid;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<String> pinnerListExclusions = new ArrayList<>();

  public PerformancePlusCampaignSettings boostProspectingAdGroupBid(@Nullable Boolean boostProspectingAdGroupBid) {
    this.boostProspectingAdGroupBid = boostProspectingAdGroupBid;
    return this;
  }

  /**
   * Whether to boost prospecting ad group bid.
   * @return boostProspectingAdGroupBid
   */
  
  @Schema(name = "boost_prospecting_ad_group_bid", description = "Whether to boost prospecting ad group bid.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("boost_prospecting_ad_group_bid")
  public @Nullable Boolean getBoostProspectingAdGroupBid() {
    return boostProspectingAdGroupBid;
  }

  @JsonProperty("boost_prospecting_ad_group_bid")
  public void setBoostProspectingAdGroupBid(@Nullable Boolean boostProspectingAdGroupBid) {
    this.boostProspectingAdGroupBid = boostProspectingAdGroupBid;
  }

  public PerformancePlusCampaignSettings pinnerListExclusions(List<String> pinnerListExclusions) {
    this.pinnerListExclusions = pinnerListExclusions;
    return this;
  }

  public PerformancePlusCampaignSettings addPinnerListExclusionsItem(String pinnerListExclusionsItem) {
    if (this.pinnerListExclusions == null) {
      this.pinnerListExclusions = new ArrayList<>();
    }
    this.pinnerListExclusions.add(pinnerListExclusionsItem);
    return this;
  }

  /**
   * List of campaign-level exclusion pinner list IDs.
   * @return pinnerListExclusions
   */
  
  @Schema(name = "pinner_list_exclusions", description = "List of campaign-level exclusion pinner list IDs.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("pinner_list_exclusions")
  public List<String> getPinnerListExclusions() {
    return pinnerListExclusions;
  }

  @JsonProperty("pinner_list_exclusions")
  public void setPinnerListExclusions(List<String> pinnerListExclusions) {
    this.pinnerListExclusions = pinnerListExclusions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PerformancePlusCampaignSettings performancePlusCampaignSettings = (PerformancePlusCampaignSettings) o;
    return Objects.equals(this.boostProspectingAdGroupBid, performancePlusCampaignSettings.boostProspectingAdGroupBid) &&
        Objects.equals(this.pinnerListExclusions, performancePlusCampaignSettings.pinnerListExclusions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boostProspectingAdGroupBid, pinnerListExclusions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PerformancePlusCampaignSettings {\n");
    sb.append("    boostProspectingAdGroupBid: ").append(toIndentedString(boostProspectingAdGroupBid)).append("\n");
    sb.append("    pinnerListExclusions: ").append(toIndentedString(pinnerListExclusions)).append("\n");
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

