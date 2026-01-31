package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.CampaignAudienceMultipliers;
import org.openapitools.model.PlacementMultipliers;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object describing an update to the campaign level bid multipliers.
 */
@ApiModel(description="Object describing an update to the campaign level bid multipliers.")

public class CampaignBidOptionsUpdate  {
  
  @ApiModelProperty(value = "")

  private AppTypeMultipliers appTypeMultipliers;

  @ApiModelProperty(value = "")

  private CampaignAudienceMultipliers audienceMultipliers;

  @ApiModelProperty(value = "")

  private PlacementMultipliers placementMultipliers;

public enum UpdateMaskEnum {

AUDIENCE(String.valueOf("AUDIENCE")), APP_TYPE(String.valueOf("APP_TYPE")), PLACEMENT(String.valueOf("PLACEMENT")), GENDER(String.valueOf("GENDER")), AGE_BUCKET(String.valueOf("AGE_BUCKET"));


    private String value;

    UpdateMaskEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static UpdateMaskEnum fromValue(String value) {
        for (UpdateMaskEnum b : UpdateMaskEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * List of fields to update, only the fields in the list will be updated.
  */
  @ApiModelProperty(required = true, value = "List of fields to update, only the fields in the list will be updated.")

  private List<UpdateMaskEnum> updateMask = new ArrayList<>();
 /**
   * Get appTypeMultipliers
   * @return appTypeMultipliers
  **/
  @JsonProperty("app_type_multipliers")
  public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  public CampaignBidOptionsUpdate appTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

 /**
   * Get audienceMultipliers
   * @return audienceMultipliers
  **/
  @JsonProperty("audience_multipliers")
  public CampaignAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }

  public void setAudienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  public CampaignBidOptionsUpdate audienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

 /**
   * Get placementMultipliers
   * @return placementMultipliers
  **/
  @JsonProperty("placement_multipliers")
  public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }

  public CampaignBidOptionsUpdate placementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

 /**
   * List of fields to update, only the fields in the list will be updated.
   * @return updateMask
  **/
  @JsonProperty("update_mask")
  public List<UpdateMaskEnum> getUpdateMask() {
    return updateMask;
  }

  public void setUpdateMask(List<UpdateMaskEnum> updateMask) {
    this.updateMask = updateMask;
  }

  public CampaignBidOptionsUpdate updateMask(List<UpdateMaskEnum> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  public CampaignBidOptionsUpdate addUpdateMaskItem(UpdateMaskEnum updateMaskItem) {
    this.updateMask.add(updateMaskItem);
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
    CampaignBidOptionsUpdate campaignBidOptionsUpdate = (CampaignBidOptionsUpdate) o;
    return Objects.equals(this.appTypeMultipliers, campaignBidOptionsUpdate.appTypeMultipliers) &&
        Objects.equals(this.audienceMultipliers, campaignBidOptionsUpdate.audienceMultipliers) &&
        Objects.equals(this.placementMultipliers, campaignBidOptionsUpdate.placementMultipliers) &&
        Objects.equals(this.updateMask, campaignBidOptionsUpdate.updateMask);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

