package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.AdgroupTrackingFeatureType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * AdgroupTrackingFeatures
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdgroupTrackingFeatures   {
  @JsonProperty("enabled")
  
  private List<AdgroupTrackingFeatureType> enabled = null;

  public AdgroupTrackingFeatures enabled(List<AdgroupTrackingFeatureType> enabled) {
    this.enabled = enabled;
    return this;
  }

  public AdgroupTrackingFeatures addEnabledItem(AdgroupTrackingFeatureType enabledItem) {
    if (this.enabled == null) {
      this.enabled = new ArrayList<>();
    }
    this.enabled.add(enabledItem);
    return this;
  }

  /**
   * Tracking features. To clear this field, set to null.
   * @return enabled
   */
  @ApiModelProperty(value = "Tracking features. To clear this field, set to null.")
  public List<AdgroupTrackingFeatureType> getEnabled() {
    return enabled;
  }

  public void setEnabled(List<AdgroupTrackingFeatureType> enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdgroupTrackingFeatures adgroupTrackingFeatures = (AdgroupTrackingFeatures) o;
    return Objects.equals(this.enabled, adgroupTrackingFeatures.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdgroupTrackingFeatures {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

