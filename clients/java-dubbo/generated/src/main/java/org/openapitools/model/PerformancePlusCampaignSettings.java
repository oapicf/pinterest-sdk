package org.openapitools.model;

import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Pinterest Performance+ campaign settings.
 */
public class PerformancePlusCampaignSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Whether to boost prospecting ad group bid.
   */
  @JsonProperty("boost_prospecting_ad_group_bid")
  private Boolean boostProspectingAdGroupBid;

  /**
   * List of campaign-level exclusion pinner list IDs.
   */
  @JsonProperty("pinner_list_exclusions")
  private List<String> pinnerListExclusions = new ArrayList<>();

  /**
   * Whether to boost prospecting ad group bid.
   * @return boostProspectingAdGroupBid
   */
  public Boolean getBoostProspectingAdGroupBid() {
    return boostProspectingAdGroupBid;
  }

  public void setBoostProspectingAdGroupBid(Boolean boostProspectingAdGroupBid) {
    this.boostProspectingAdGroupBid = boostProspectingAdGroupBid;
  }

  /**
   * List of campaign-level exclusion pinner list IDs.
   * @return pinnerListExclusions
   */
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
