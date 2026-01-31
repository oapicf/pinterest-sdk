package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AppTypeMultipliers;
import org.openapitools.model.CampaignAudienceMultipliers;
import org.openapitools.model.PlacementMultipliers;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Object describing an update to the campaign level bid multipliers.
 **/
@ApiModel(description = "Object describing an update to the campaign level bid multipliers.")
@JsonTypeName("CampaignBidOptionsUpdate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-01-31T04:55:24.841422791Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class CampaignBidOptionsUpdate   {
  private AppTypeMultipliers appTypeMultipliers;
  private CampaignAudienceMultipliers audienceMultipliers;
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
    @JsonValue
    public String toString() {
        return String.valueOf(value);
    }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static UpdateMaskEnum fromString(String s) {
        for (UpdateMaskEnum b : UpdateMaskEnum.values()) {
            // using Objects.toString() to be safe if value type non-object type
            // because types like 'int' etc. will be auto-boxed
            if (java.util.Objects.toString(b.value).equals(s)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

    @JsonCreator
    public static UpdateMaskEnum fromValue(String value) {
        for (UpdateMaskEnum b : UpdateMaskEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

  private @Valid List<UpdateMaskEnum> updateMask = new ArrayList<>();

  public CampaignBidOptionsUpdate() {
  }

  @JsonCreator
  public CampaignBidOptionsUpdate(
    @JsonProperty(required = true, value = "update_mask") List<UpdateMaskEnum> updateMask
  ) {
    this.updateMask = updateMask;
  }

  /**
   **/
  public CampaignBidOptionsUpdate appTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("app_type_multipliers")
  @Valid public AppTypeMultipliers getAppTypeMultipliers() {
    return appTypeMultipliers;
  }

  @JsonProperty("app_type_multipliers")
  public void setAppTypeMultipliers(AppTypeMultipliers appTypeMultipliers) {
    this.appTypeMultipliers = appTypeMultipliers;
  }

  /**
   **/
  public CampaignBidOptionsUpdate audienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("audience_multipliers")
  @Valid public CampaignAudienceMultipliers getAudienceMultipliers() {
    return audienceMultipliers;
  }

  @JsonProperty("audience_multipliers")
  public void setAudienceMultipliers(CampaignAudienceMultipliers audienceMultipliers) {
    this.audienceMultipliers = audienceMultipliers;
  }

  /**
   **/
  public CampaignBidOptionsUpdate placementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("placement_multipliers")
  @Valid public PlacementMultipliers getPlacementMultipliers() {
    return placementMultipliers;
  }

  @JsonProperty("placement_multipliers")
  public void setPlacementMultipliers(PlacementMultipliers placementMultipliers) {
    this.placementMultipliers = placementMultipliers;
  }

  /**
   * List of fields to update, only the fields in the list will be updated.
   **/
  public CampaignBidOptionsUpdate updateMask(List<UpdateMaskEnum> updateMask) {
    this.updateMask = updateMask;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "List of fields to update, only the fields in the list will be updated.")
  @JsonProperty(required = true, value = "update_mask")
  @NotNull public List<UpdateMaskEnum> getUpdateMask() {
    return updateMask;
  }

  @JsonProperty(required = true, value = "update_mask")
  public void setUpdateMask(List<UpdateMaskEnum> updateMask) {
    this.updateMask = updateMask;
  }

  public CampaignBidOptionsUpdate addUpdateMaskItem(UpdateMaskEnum updateMaskItem) {
    if (this.updateMask == null) {
      this.updateMask = new ArrayList<>();
    }

    this.updateMask.add(updateMaskItem);
    return this;
  }

  public CampaignBidOptionsUpdate removeUpdateMaskItem(UpdateMaskEnum updateMaskItem) {
    if (updateMaskItem != null && this.updateMask != null) {
      this.updateMask.remove(updateMaskItem);
    }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

