package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */
@ApiModel(description = "This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SchedulePlacementMultipliers   {
  @JsonProperty("browse")
  private Double browse;

  @JsonProperty("related_pins")
  private Double relatedPins;

  @JsonProperty("search")
  private Double search;

  public SchedulePlacementMultipliers browse(Double browse) {
    this.browse = browse;
    return this;
  }

  /**
   * Browse (home-feed and related surfaces)
   * @return browse
   */
  @ApiModelProperty(value = "Browse (home-feed and related surfaces)")
  public Double getBrowse() {
    return browse;
  }

  public void setBrowse(Double browse) {
    this.browse = browse;
  }

  public SchedulePlacementMultipliers relatedPins(Double relatedPins) {
    this.relatedPins = relatedPins;
    return this;
  }

  /**
   * Related-Pins placement
   * @return relatedPins
   */
  @ApiModelProperty(value = "Related-Pins placement")
  public Double getRelatedPins() {
    return relatedPins;
  }

  public void setRelatedPins(Double relatedPins) {
    this.relatedPins = relatedPins;
  }

  public SchedulePlacementMultipliers search(Double search) {
    this.search = search;
    return this;
  }

  /**
   * Search placement
   * @return search
   */
  @ApiModelProperty(value = "Search placement")
  public Double getSearch() {
    return search;
  }

  public void setSearch(Double search) {
    this.search = search;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

