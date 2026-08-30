package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.
 */

@Schema(name = "SchedulePlacementMultipliers", description = "This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-08-30T09:53:34.136978074Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class SchedulePlacementMultipliers {

  private Double browse;

  private Double relatedPins;

  private Double search;

  public SchedulePlacementMultipliers browse(Double browse) {
    this.browse = browse;
    return this;
  }

  /**
   * Browse (home-feed and related surfaces)
   * @return browse
   */
  
  @Schema(name = "browse", description = "Browse (home-feed and related surfaces)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("browse")
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
  
  @Schema(name = "related_pins", description = "Related-Pins placement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("related_pins")
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
  
  @Schema(name = "search", description = "Search placement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("search")
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

