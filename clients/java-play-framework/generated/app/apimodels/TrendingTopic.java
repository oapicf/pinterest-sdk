package apimodels;

import apimodels.TrendingPin;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Individual trending topic within an interest category
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class TrendingTopic   {
  @JsonProperty("description")
  @NotNull

  private String description;

  @JsonProperty("id")
  @NotNull

  private String id;

  @JsonProperty("percent_growth_mom")
  
  private Integer percentGrowthMom;

  @JsonProperty("pins")
  @NotNull
@Size(max=6)
@Valid

  private List<@Valid TrendingPin> pins = new ArrayList<>();

  @JsonProperty("related_interests")
  @NotNull

  private List<String> relatedInterests = new ArrayList<>();

  @JsonProperty("related_searches")
  @NotNull

  private List<String> relatedSearches = new ArrayList<>();

  @JsonProperty("time_series")
  @NotNull
@Valid

  private Map<String, BigDecimal> timeSeries = new HashMap<>();

  @JsonProperty("title")
  @NotNull

  private String title;

  public TrendingTopic description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the trending topic
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TrendingTopic id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the trending topic
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public TrendingTopic percentGrowthMom(Integer percentGrowthMom) {
    this.percentGrowthMom = percentGrowthMom;
    return this;
  }

   /**
   * Month-over-month growth percentage
   * @return percentGrowthMom
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
    return Objects.equals(description, trendingTopic.description) &&
        Objects.equals(id, trendingTopic.id) &&
        Objects.equals(percentGrowthMom, trendingTopic.percentGrowthMom) &&
        Objects.equals(pins, trendingTopic.pins) &&
        Objects.equals(relatedInterests, trendingTopic.relatedInterests) &&
        Objects.equals(relatedSearches, trendingTopic.relatedSearches) &&
        Objects.equals(timeSeries, trendingTopic.timeSeries) &&
        Objects.equals(title, trendingTopic.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, percentGrowthMom, pins, relatedInterests, relatedSearches, timeSeries, title);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrendingTopic {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

