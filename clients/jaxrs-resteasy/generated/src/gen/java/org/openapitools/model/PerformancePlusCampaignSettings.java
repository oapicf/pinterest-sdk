package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Pinterest Performance+ campaign settings.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-08-30T09:54:34.006998108Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class PerformancePlusCampaignSettings   {
  
  private Boolean boostProspectingAdGroupBid;
  private List<String> pinnerListExclusions = new ArrayList<>();

  /**
   * Whether to boost prospecting ad group bid.
   **/
  
  @ApiModelProperty(value = "Whether to boost prospecting ad group bid.")
  @JsonProperty("boost_prospecting_ad_group_bid")
  public Boolean getBoostProspectingAdGroupBid() {
    return boostProspectingAdGroupBid;
  }
  public void setBoostProspectingAdGroupBid(Boolean boostProspectingAdGroupBid) {
    this.boostProspectingAdGroupBid = boostProspectingAdGroupBid;
  }

  /**
   * List of campaign-level exclusion pinner list IDs.
   **/
  
  @ApiModelProperty(value = "List of campaign-level exclusion pinner list IDs.")
  @JsonProperty("pinner_list_exclusions")
  public List<String> getPinnerListExclusions() {
    return pinnerListExclusions;
  }
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

