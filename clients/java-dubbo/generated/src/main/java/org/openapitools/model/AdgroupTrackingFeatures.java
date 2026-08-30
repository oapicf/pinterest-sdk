package org.openapitools.model;

import org.openapitools.model.AdgroupTrackingFeatureType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class AdgroupTrackingFeatures implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Tracking features. To clear this field, set to null.
   */
  @JsonProperty("enabled")
  private List<AdgroupTrackingFeatureType> enabled = new ArrayList<>();

  /**
   * Tracking features. To clear this field, set to null.
   * @return enabled
   */
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
