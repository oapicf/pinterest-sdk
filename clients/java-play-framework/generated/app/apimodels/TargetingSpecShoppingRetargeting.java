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
 * TargetingSpecShoppingRetargeting
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TargetingSpecShoppingRetargeting   {
  @JsonProperty("exclusion_window")
  
  private Integer exclusionWindow;

  @JsonProperty("lookback_window")
  
  private Integer lookbackWindow;

  @JsonProperty("tag_types")
  
  private List<Integer> tagTypes = null;

  public TargetingSpecShoppingRetargeting exclusionWindow(Integer exclusionWindow) {
    this.exclusionWindow = exclusionWindow;
    return this;
  }

   /**
   * Number of days ago to stop lookback timeframe for dynamic retargeting
   * @return exclusionWindow
  **/
  public Integer getExclusionWindow() {
    return exclusionWindow;
  }

  public void setExclusionWindow(Integer exclusionWindow) {
    this.exclusionWindow = exclusionWindow;
  }

  public TargetingSpecShoppingRetargeting lookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
    return this;
  }

   /**
   * Number of days ago to start lookback timeframe for dynamic retargeting
   * @return lookbackWindow
  **/
  public Integer getLookbackWindow() {
    return lookbackWindow;
  }

  public void setLookbackWindow(Integer lookbackWindow) {
    this.lookbackWindow = lookbackWindow;
  }

  public TargetingSpecShoppingRetargeting tagTypes(List<Integer> tagTypes) {
    this.tagTypes = tagTypes;
    return this;
  }

  public TargetingSpecShoppingRetargeting addTagTypesItem(Integer tagTypesItem) {
    if (this.tagTypes == null) {
      this.tagTypes = new ArrayList<>();
    }
    this.tagTypes.add(tagTypesItem);
    return this;
  }

   /**
   * Event types to target for dynamic retargeting
   * @return tagTypes
  **/
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
    return Objects.equals(exclusionWindow, targetingSpecShoppingRetargeting.exclusionWindow) &&
        Objects.equals(lookbackWindow, targetingSpecShoppingRetargeting.lookbackWindow) &&
        Objects.equals(tagTypes, targetingSpecShoppingRetargeting.tagTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exclusionWindow, lookbackWindow, tagTypes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

