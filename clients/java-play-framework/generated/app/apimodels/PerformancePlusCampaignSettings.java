package apimodels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Pinterest Performance+ campaign settings.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PerformancePlusCampaignSettings   {
  @JsonProperty("boost_prospecting_ad_group_bid")
  
  private Boolean boostProspectingAdGroupBid;

  @JsonProperty("pinner_list_exclusions")
  
  private List<String> pinnerListExclusions = null;

  public PerformancePlusCampaignSettings boostProspectingAdGroupBid(Boolean boostProspectingAdGroupBid) {
    this.boostProspectingAdGroupBid = boostProspectingAdGroupBid;
    return this;
  }

   /**
   * Whether to boost prospecting ad group bid.
   * @return boostProspectingAdGroupBid
  **/
  public Boolean getBoostProspectingAdGroupBid() {
    return boostProspectingAdGroupBid;
  }

  public void setBoostProspectingAdGroupBid(Boolean boostProspectingAdGroupBid) {
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

