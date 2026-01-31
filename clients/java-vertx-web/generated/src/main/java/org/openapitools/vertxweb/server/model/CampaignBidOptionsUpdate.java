package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.AppTypeMultipliers;
import org.openapitools.vertxweb.server.model.CampaignAudienceMultipliers;
import org.openapitools.vertxweb.server.model.PlacementMultipliers;

/**
 * Object describing an update to the campaign level bid multipliers.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignBidOptionsUpdate   {
  
  private AppTypeMultipliers appTypeMultipliers;
  private CampaignAudienceMultipliers audienceMultipliers;
  private PlacementMultipliers placementMultipliers;


  public enum UpdateMaskEnum {
    AUDIENCE("AUDIENCE"),
    APP_TYPE("APP_TYPE"),
    PLACEMENT("PLACEMENT"),
    GENDER("GENDER"),
    AGE_BUCKET("AGE_BUCKET");

    private String value;

    UpdateMaskEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private List<UpdateMaskEnum> updateMask = new ArrayList<>();

  public CampaignBidOptionsUpdate () {

  }

  public CampaignBidOptionsUpdate (AppTypeMultipliers appTypeMultipliers, CampaignAudienceMultipliers audienceMultipliers, PlacementMultipliers placementMultipliers, List<UpdateMaskEnum> updateMask) {
    this.appTypeMultipliers = appTypeMultipliers;
    this.audienceMultipliers = audienceMultipliers;
    this.placementMultipliers = placementMultipliers;
    this.updateMask = updateMask;
  }

    
  @JsonProperty("app_type_multipliers")
  public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }
  public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

    
  @JsonProperty("audience_multipliers")
  public CampaignAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }
  public void setAudienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

    
  @JsonProperty("placement_multipliers")
  public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }
  public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }

    
  @JsonProperty("update_mask")
  public List<UpdateMaskEnum> getUpdateMask() {
    return updateMask;
  }
  public void setUpdateMask(List<UpdateMaskEnum> updateMask) {
    this.updateMask = updateMask;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignBidOptionsUpdate campaignBidOptionsUpdate = (CampaignBidOptionsUpdate) o;
    return Objects.equals(appTypeMultipliers, campaignBidOptionsUpdate.appTypeMultipliers) &&
        Objects.equals(audienceMultipliers, campaignBidOptionsUpdate.audienceMultipliers) &&
        Objects.equals(placementMultipliers, campaignBidOptionsUpdate.placementMultipliers) &&
        Objects.equals(updateMask, campaignBidOptionsUpdate.updateMask);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appTypeMultipliers, audienceMultipliers, placementMultipliers, updateMask);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignBidOptionsUpdate {\n");
    
    sb.append("    appTypeMultipliers: ").append(toIndentedString(appTypeMultipliers)).append("\n");
    sb.append("    audienceMultipliers: ").append(toIndentedString(audienceMultipliers)).append("\n");
    sb.append("    placementMultipliers: ").append(toIndentedString(placementMultipliers)).append("\n");
    sb.append("    updateMask: ").append(toIndentedString(updateMask)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
