package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.TrendingPin;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Individual trending topic within an interest category
 */

@Schema(name = "TrendingTopic", description = "Individual trending topic within an interest category")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class TrendingTopic {

  private String description;

  private Integer percentGrowthMom;

  @Valid
  private List<@Valid TrendingPin> pins = new ArrayList<>();

  @Valid
  private List<String> relatedInterests = new ArrayList<>();

  @Valid
  private List<String> relatedSearches = new ArrayList<>();

  @Valid
  private Map<String, BigDecimal> timeSeries = new HashMap<>();

  private String title;

  public TrendingTopic() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public TrendingTopic(String description, Integer percentGrowthMom, List<@Valid TrendingPin> pins, List<String> relatedInterests, List<String> relatedSearches, Map<String, BigDecimal> timeSeries, String title) {
    this.description = description;
    this.percentGrowthMom = percentGrowthMom;
    this.pins = pins;
    this.relatedInterests = relatedInterests;
    this.relatedSearches = relatedSearches;
    this.timeSeries = timeSeries;
    this.title = title;
  }

  public TrendingTopic description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the trending topic
   * @return description
   */
  @NotNull 
  @Schema(name = "description", description = "Description of the trending topic", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TrendingTopic percentGrowthMom(Integer percentGrowthMom) {
    this.percentGrowthMom = percentGrowthMom;
    return this;
  }

  /**
   * Month-over-month growth percentage
   * @return percentGrowthMom
   */
  @NotNull 
  @Schema(name = "percent_growth_mom", description = "Month-over-month growth percentage", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("percent_growth_mom")
  public Integer getPercentGrowthMom() {
    return percentGrowthMom;
  }

  public void setPercentGrowthMom(Integer percentGrowthMom) {
    this.percentGrowthMom = percentGrowthMom;
  }

  public TrendingTopic pins(List<@Valid TrendingPin> pins) {
    this.pins = pins;
    return this;
  }

  public TrendingTopic addPinsItem(TrendingPin pinsItem) {
    if (this.pins == null) {
      this.pins = new ArrayList<>();
    }
    this.pins.add(pinsItem);
    return this;
  }

  /**
   * Array of pin images related to this trend (up to 6)
   * @return pins
   */
  @NotNull @Valid @Size(max = 6) 
  @Schema(name = "pins", description = "Array of pin images related to this trend (up to 6)", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("pins")
  public List<@Valid TrendingPin> getPins() {
    return pins;
  }

  public void setPins(List<@Valid TrendingPin> pins) {
    this.pins = pins;
  }

  public TrendingTopic relatedInterests(List<String> relatedInterests) {
    this.relatedInterests = relatedInterests;
    return this;
  }

  public TrendingTopic addRelatedInterestsItem(String relatedInterestsItem) {
    if (this.relatedInterests == null) {
      this.relatedInterests = new ArrayList<>();
    }
    this.relatedInterests.add(relatedInterestsItem);
    return this;
  }

  /**
   * List of related interest categories
   * @return relatedInterests
   */
  @NotNull 
  @Schema(name = "related_interests", description = "List of related interest categories", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("related_interests")
  public List<String> getRelatedInterests() {
    return relatedInterests;
  }

  public void setRelatedInterests(List<String> relatedInterests) {
    this.relatedInterests = relatedInterests;
  }

  public TrendingTopic relatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
    return this;
  }

  public TrendingTopic addRelatedSearchesItem(String relatedSearchesItem) {
    if (this.relatedSearches == null) {
      this.relatedSearches = new ArrayList<>();
    }
    this.relatedSearches.add(relatedSearchesItem);
    return this;
  }

  /**
   * List of related search terms
   * @return relatedSearches
   */
  @NotNull 
  @Schema(name = "related_searches", description = "List of related search terms", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("related_searches")
  public List<String> getRelatedSearches() {
    return relatedSearches;
  }

  public void setRelatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
  }

  public TrendingTopic timeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
    return this;
  }

  public TrendingTopic putTimeSeriesItem(String key, BigDecimal timeSeriesItem) {
    if (this.timeSeries == null) {
      this.timeSeries = new HashMap<>();
    }
    this.timeSeries.put(key, timeSeriesItem);
    return this;
  }

  /**
   * Time series data showing trend values over time, with dates as keys and values as numeric
   * @return timeSeries
   */
  @NotNull @Valid 
  @Schema(name = "time_series", description = "Time series data showing trend values over time, with dates as keys and values as numeric", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("time_series")
  public Map<String, BigDecimal> getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
  }

  public TrendingTopic title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the trending topic
   * @return title
   */
  @NotNull 
  @Schema(name = "title", description = "Title of the trending topic", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrendingTopic trendingTopic = (TrendingTopic) o;
    return Objects.equals(this.description, trendingTopic.description) &&
        Objects.equals(this.percentGrowthMom, trendingTopic.percentGrowthMom) &&
        Objects.equals(this.pins, trendingTopic.pins) &&
        Objects.equals(this.relatedInterests, trendingTopic.relatedInterests) &&
        Objects.equals(this.relatedSearches, trendingTopic.relatedSearches) &&
        Objects.equals(this.timeSeries, trendingTopic.timeSeries) &&
        Objects.equals(this.title, trendingTopic.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, percentGrowthMom, pins, relatedInterests, relatedSearches, timeSeries, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingTopic {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    percentGrowthMom: ").append(toIndentedString(percentGrowthMom)).append("\n");
    sb.append("    pins: ").append(toIndentedString(pins)).append("\n");
    sb.append("    relatedInterests: ").append(toIndentedString(relatedInterests)).append("\n");
    sb.append("    relatedSearches: ").append(toIndentedString(relatedSearches)).append("\n");
    sb.append("    timeSeries: ").append(toIndentedString(timeSeries)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

