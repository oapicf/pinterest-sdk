package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdgroupTrackingFeatureType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("AdgroupTrackingFeatures")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class AdgroupTrackingFeatures   {
  private @Valid List<AdgroupTrackingFeatureType> enabled = new ArrayList<>();

  public AdgroupTrackingFeatures() {
  }

  /**
   * Tracking features. To clear this field, set to null.
   **/
  public AdgroupTrackingFeatures enabled(List<AdgroupTrackingFeatureType> enabled) {
    this.enabled = enabled;
    return this;
  }

  
  @ApiModelProperty(value = "Tracking features. To clear this field, set to null.")
  @JsonProperty("enabled")
  public List<AdgroupTrackingFeatureType> getEnabled() {
    return enabled;
  }

  @JsonProperty("enabled")
  public void setEnabled(List<AdgroupTrackingFeatureType> enabled) {
    this.enabled = enabled;
  }

  public AdgroupTrackingFeatures addEnabledItem(AdgroupTrackingFeatureType enabledItem) {
    if (this.enabled == null) {
      this.enabled = new ArrayList<>();
    }

    this.enabled.add(enabledItem);
    return this;
  }

  public AdgroupTrackingFeatures removeEnabledItem(AdgroupTrackingFeatureType enabledItem) {
    if (enabledItem != null && this.enabled != null) {
      this.enabled.remove(enabledItem);
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
