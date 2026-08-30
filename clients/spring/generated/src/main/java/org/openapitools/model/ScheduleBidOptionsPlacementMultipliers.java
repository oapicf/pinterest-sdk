package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.springframework.lang.Nullable;
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

@Schema(name = "ScheduleBidOptions_placement_multipliers", description = "This represents a mapping from placement to a bid price change value. Values represent the change in bid price and can be positive or negative. For percentage changes, a value of 500.0 means a 5% change. For value changes, the amount represents the direct bid adjustment. All placement multipliers must be set at the same time. If a multiplier is not provided it is assumed to be 0 (no bid adjustment). The change must still remain between the range of 0 and 10.")
@JsonTypeName("ScheduleBidOptions_placement_multipliers")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ScheduleBidOptionsPlacementMultipliers {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Double browse;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Double relatedPins;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Double search;

  public ScheduleBidOptionsPlacementMultipliers browse(@Nullable Double browse) {
    this.browse = browse;
    return this;
  }

  /**
   * Browse (home-feed and related surfaces)
   * @return browse
   */
  
  @Schema(name = "browse", description = "Browse (home-feed and related surfaces)", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("browse")
  public @Nullable Double getBrowse() {
    return browse;
  }

  @JsonProperty("browse")
  public void setBrowse(@Nullable Double browse) {
    this.browse = browse;
  }

  public ScheduleBidOptionsPlacementMultipliers relatedPins(@Nullable Double relatedPins) {
    this.relatedPins = relatedPins;
    return this;
  }

  /**
   * Related-Pins placement
   * @return relatedPins
   */
  
  @Schema(name = "related_pins", description = "Related-Pins placement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("related_pins")
  public @Nullable Double getRelatedPins() {
    return relatedPins;
  }

  @JsonProperty("related_pins")
  public void setRelatedPins(@Nullable Double relatedPins) {
    this.relatedPins = relatedPins;
  }

  public ScheduleBidOptionsPlacementMultipliers search(@Nullable Double search) {
    this.search = search;
    return this;
  }

  /**
   * Search placement
   * @return search
   */
  
  @Schema(name = "search", description = "Search placement", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("search")
  public @Nullable Double getSearch() {
    return search;
  }

  @JsonProperty("search")
  public void setSearch(@Nullable Double search) {
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
    ScheduleBidOptionsPlacementMultipliers scheduleBidOptionsPlacementMultipliers = (ScheduleBidOptionsPlacementMultipliers) o;
    return Objects.equals(this.browse, scheduleBidOptionsPlacementMultipliers.browse) &&
        Objects.equals(this.relatedPins, scheduleBidOptionsPlacementMultipliers.relatedPins) &&
        Objects.equals(this.search, scheduleBidOptionsPlacementMultipliers.search);
  }

  @Override
  public int hashCode() {
    return Objects.hash(browse, relatedPins, search);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScheduleBidOptionsPlacementMultipliers {\n");
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

