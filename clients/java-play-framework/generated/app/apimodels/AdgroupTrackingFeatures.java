package apimodels;

import apimodels.AdgroupTrackingFeatureType;
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
 * AdgroupTrackingFeatures
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class AdgroupTrackingFeatures   {
  @JsonProperty("enabled")
  @Valid

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
  **/
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
    return Objects.equals(enabled, adgroupTrackingFeatures.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

