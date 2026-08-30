package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Pinterest Performance+ campaign settings.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PerformancePlusCampaignSettings   {
  
  private Boolean boostProspectingAdGroupBid;
  private List<String> pinnerListExclusions = new ArrayList<>();

  public PerformancePlusCampaignSettings () {

  }

  public PerformancePlusCampaignSettings (Boolean boostProspectingAdGroupBid, List<String> pinnerListExclusions) {
    this.boostProspectingAdGroupBid = boostProspectingAdGroupBid;
    this.pinnerListExclusions = pinnerListExclusions;
  }

    
  @JsonProperty("boost_prospecting_ad_group_bid")
  public Boolean getBoostProspectingAdGroupBid() {
    return boostProspectingAdGroupBid;
  }
  public void setBoostProspectingAdGroupBid(Boolean boostProspectingAdGroupBid) {
    this.boostProspectingAdGroupBid = boostProspectingAdGroupBid;
  }

    
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
    return Objects.equals(boostProspectingAdGroupBid, performancePlusCampaignSettings.boostProspectingAdGroupBid) &&
        Objects.equals(pinnerListExclusions, performancePlusCampaignSettings.pinnerListExclusions);
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
