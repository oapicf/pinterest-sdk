package org.openapitools.model;

import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class TargetingSpecShoppingRetargeting implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Number of days ago to stop lookback timeframe for dynamic retargeting
   */
  @JsonProperty("exclusion_window")
  private Integer exclusionWindow;

  /**
   * Number of days ago to start lookback timeframe for dynamic retargeting
   */
  @JsonProperty("lookback_window")
  private Integer lookbackWindow;

  /**
   * Event types to target for dynamic retargeting
   */
  @JsonProperty("tag_types")
  private List<Integer> tagTypes = new ArrayList<>();

  /**
   * Number of days ago to stop lookback timeframe for dynamic retargeting
   * @return exclusionWindow
   */
  public Integer getExclusionWindow() {
    return exclusionWindow;
  }

  public void setExclusionWindow(Integer exclusionWindow) {
    this.exclusionWindow = exclusionWindow;
  }

  /**
   * Number of days ago to start lookback timeframe for dynamic retargeting
   * @return lookbackWindow
   */
  public Integer getLookbackWindow() {
    return lookbackWindow;
  }

  public void setLookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
  }

  /**
   * Event types to target for dynamic retargeting
   * @return tagTypes
   */
  public List<Integer> getTagTypes() {
    return tagTypes;
  }

  public void setTagTypes(List<Integer> tagTypes) {
    this.tagTypes = tagTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetingSpecShoppingRetargeting targetingSpecShoppingRetargeting = (TargetingSpecShoppingRetargeting) o;
    return Objects.equals(this.exclusionWindow, targetingSpecShoppingRetargeting.exclusionWindow) &&
        Objects.equals(this.lookbackWindow, targetingSpecShoppingRetargeting.lookbackWindow) &&
        Objects.equals(this.tagTypes, targetingSpecShoppingRetargeting.tagTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusionWindow, lookbackWindow, tagTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetingSpecShoppingRetargeting {\n");
    
    sb.append("    exclusionWindow: ").append(toIndentedString(exclusionWindow)).append("\n");
    sb.append("    lookbackWindow: ").append(toIndentedString(lookbackWindow)).append("\n");
    sb.append("    tagTypes: ").append(toIndentedString(tagTypes)).append("\n");
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
