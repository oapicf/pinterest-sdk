package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Pinterest Performance+ campaign settings.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Pinterest Performance+ campaign settings.")
public class PerformancePlusCampaignSettings   {
  
  private Boolean boostProspectingAdGroupBid;

  private List<String> pinnerListExclusions = new ArrayList<>();

  /**
   * Whether to boost prospecting ad group bid.
   **/
  public PerformancePlusCampaignSettings boostProspectingAdGroupBid(Boolean boostProspectingAdGroupBid) {
    this.boostProspectingAdGroupBid = boostProspectingAdGroupBid;
    return this;
  }

  
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
  public PerformancePlusCampaignSettings pinnerListExclusions(List<String> pinnerListExclusions) {
    this.pinnerListExclusions = pinnerListExclusions;
    return this;
  }

  
  @ApiModelProperty(value = "List of campaign-level exclusion pinner list IDs.")
  @JsonProperty("pinner_list_exclusions")
  public List<String> getPinnerListExclusions() {
    return pinnerListExclusions;
  }
  public void setPinnerListExclusions(List<String> pinnerListExclusions) {
    this.pinnerListExclusions = pinnerListExclusions;
  }

  public PerformancePlusCampaignSettings addPinnerListExclusionsItem(String pinnerListExclusionsItem) {
    if (this.pinnerListExclusions == null) {
      this.pinnerListExclusions = new ArrayList<>();
    }
    this.pinnerListExclusions.add(pinnerListExclusionsItem);
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

