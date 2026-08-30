package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdgroupTrackingFeatureType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class AdgroupTrackingFeatures  {
  
 /**
  * Tracking features. To clear this field, set to null.
  */
  @ApiModelProperty(value = "Tracking features. To clear this field, set to null.")
  @Valid
  private List<AdgroupTrackingFeatureType> enabled = new ArrayList<>();
 /**
  * Tracking features. To clear this field, set to null.
  * @return enabled
  */
  @JsonProperty("enabled")
  public List<AdgroupTrackingFeatureType> getEnabled() {
    return enabled;
  }

  /**
   * Sets the <code>enabled</code> property.
   */
 public void setEnabled(List<AdgroupTrackingFeatureType> enabled) {
    this.enabled = enabled;
  }

  /**
   * Sets the <code>enabled</code> property.
   */
  public AdgroupTrackingFeatures enabled(List<AdgroupTrackingFeatureType> enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Adds a new item to the <code>enabled</code> list.
   */
  public AdgroupTrackingFeatures addEnabledItem(AdgroupTrackingFeatureType enabledItem) {
    this.enabled.add(enabledItem);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

