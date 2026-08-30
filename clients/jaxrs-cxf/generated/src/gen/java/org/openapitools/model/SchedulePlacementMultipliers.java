package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
@ApiModel(description="This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")

public class SchedulePlacementMultipliers  {
  
 /**
  * Browse (home-feed and related surfaces)
  */
  @ApiModelProperty(value = "Browse (home-feed and related surfaces)")

  private Double browse;

 /**
  * Related-Pins placement
  */
  @ApiModelProperty(value = "Related-Pins placement")

  private Double relatedPins;

 /**
  * Search placement
  */
  @ApiModelProperty(value = "Search placement")

  private Double search;
 /**
   * Browse (home-feed and related surfaces)
   * @return browse
  **/
  @JsonProperty("browse")
  public Double getBrowse() {
    return browse;
  }

  public void setBrowse(Double browse) {
    this.browse = browse;
  }

  public SchedulePlacementMultipliers browse(Double browse) {
    this.browse = browse;
    return this;
  }

 /**
   * Related-Pins placement
   * @return relatedPins
  **/
  @JsonProperty("related_pins")
  public Double getRelatedPins() {
    return relatedPins;
  }

  public void setRelatedPins(Double relatedPins) {
    this.relatedPins = relatedPins;
  }

  public SchedulePlacementMultipliers relatedPins(Double relatedPins) {
    this.relatedPins = relatedPins;
    return this;
  }

 /**
   * Search placement
   * @return search
  **/
  @JsonProperty("search")
  public Double getSearch() {
    return search;
  }

  public void setSearch(Double search) {
    this.search = search;
  }

  public SchedulePlacementMultipliers search(Double search) {
    this.search = search;
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
    SchedulePlacementMultipliers schedulePlacementMultipliers = (SchedulePlacementMultipliers) o;
    return Objects.equals(this.browse, schedulePlacementMultipliers.browse) &&
        Objects.equals(this.relatedPins, schedulePlacementMultipliers.relatedPins) &&
        Objects.equals(this.search, schedulePlacementMultipliers.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browse, relatedPins, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SchedulePlacementMultipliers {\n");
    
    sb.append("    browse: ").append(toIndentedString(browse)).append("\n");
    sb.append("    relatedPins: ").append(toIndentedString(relatedPins)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
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

