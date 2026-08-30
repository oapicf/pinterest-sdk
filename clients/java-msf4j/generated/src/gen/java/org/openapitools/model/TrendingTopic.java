package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.model.TrendingPin;

/**
 * Individual trending topic within an interest category
 */
@ApiModel(description = "Individual trending topic within an interest category")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-08-30T09:52:46.198627651Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class TrendingTopic   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("id")
  private String id;

  @JsonProperty("percent_growth_mom")
  private Integer percentGrowthMom;

  @JsonProperty("pins")
  private List<@Valid TrendingPin> pins = new ArrayList<>();

  @JsonProperty("related_interests")
  private List<String> relatedInterests = new ArrayList<>();

  @JsonProperty("related_searches")
  private List<String> relatedSearches = new ArrayList<>();

  @JsonProperty("time_series")
  private Map<String, BigDecimal> timeSeries = new HashMap<>();

  @JsonProperty("title")
  private String title;

  public TrendingTopic description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the trending topic
   * @return description
  **/
  @ApiModelProperty(required = true, value = "Description of the trending topic")
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
  @ApiModelProperty(required = true, value = "Unique identifier for the trending topic")
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
  @ApiModelProperty(value = "Month-over-month growth percentage")
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
    this.pins.add(pinsItem);
    return this;
  }

   /**
   * Array of pin images related to this trend (up to 6)
   * @return pins
  **/
  @ApiModelProperty(required = true, value = "Array of pin images related to this trend (up to 6)")
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
    this.relatedInterests.add(relatedInterestsItem);
    return this;
  }

   /**
   * List of related interest categories
   * @return relatedInterests
  **/
  @ApiModelProperty(required = true, value = "List of related interest categories")
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
    this.relatedSearches.add(relatedSearchesItem);
    return this;
  }

   /**
   * List of related search terms
   * @return relatedSearches
  **/
  @ApiModelProperty(required = true, value = "List of related search terms")
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
    this.timeSeries.put(key, timeSeriesItem);
    return this;
  }

   /**
   * Time series data showing trend values over time, with dates as keys and values as numeric
   * @return timeSeries
  **/
  @ApiModelProperty(required = true, value = "Time series data showing trend values over time, with dates as keys and values as numeric")
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
  @ApiModelProperty(required = true, value = "Title of the trending topic")
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
        Objects.equals(this.id, trendingTopic.id) &&
        Objects.equals(this.percentGrowthMom, trendingTopic.percentGrowthMom) &&
        Objects.equals(this.pins, trendingTopic.pins) &&
        Objects.equals(this.relatedInterests, trendingTopic.relatedInterests) &&
        Objects.equals(this.relatedSearches, trendingTopic.relatedSearches) &&
        Objects.equals(this.timeSeries, trendingTopic.timeSeries) &&
        Objects.equals(this.title, trendingTopic.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, id, percentGrowthMom, pins, relatedInterests, relatedSearches, timeSeries, title);
  }

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

