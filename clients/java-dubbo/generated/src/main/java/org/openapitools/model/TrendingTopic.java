package org.openapitools.model;

import java.math.BigDecimal;
import org.openapitools.model.TrendingPin;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Individual trending topic within an interest category
 */
public class TrendingTopic implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Description of the trending topic
   */
  @JsonProperty("description")
  private String description;

  /**
   * Unique identifier for the trending topic
   */
  @JsonProperty("id")
  private String id;

  /**
   * Month-over-month growth percentage
   */
  @JsonProperty("percent_growth_mom")
  private Integer percentGrowthMom;

  /**
   * Array of pin images related to this trend (up to 6)
   */
  @JsonProperty("pins")
  private List<TrendingPin> pins = new ArrayList<>();

  /**
   * List of related interest categories
   */
  @JsonProperty("related_interests")
  private List<String> relatedInterests = new ArrayList<>();

  /**
   * List of related search terms
   */
  @JsonProperty("related_searches")
  private List<String> relatedSearches = new ArrayList<>();

  /**
   * Time series data showing trend values over time, with dates as keys and values as numeric
   */
  @JsonProperty("time_series")
  private Map<String, BigDecimal> timeSeries = new HashMap<>();

  /**
   * Title of the trending topic
   */
  @JsonProperty("title")
  private String title;

  /**
   * Description of the trending topic
   * @return description
   */
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Unique identifier for the trending topic
   * @return id
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Month-over-month growth percentage
   * @return percentGrowthMom
   */
  public Integer getPercentGrowthMom() {
    return percentGrowthMom;
  }

  public void setPercentGrowthMom(Integer percentGrowthMom) {
    this.percentGrowthMom = percentGrowthMom;
  }

  /**
   * Array of pin images related to this trend (up to 6)
   * @return pins
   */
  public List<TrendingPin> getPins() {
    return pins;
  }

  public void setPins(List<TrendingPin> pins) {
    this.pins = pins;
  }

  /**
   * List of related interest categories
   * @return relatedInterests
   */
  public List<String> getRelatedInterests() {
    return relatedInterests;
  }

  public void setRelatedInterests(List<String> relatedInterests) {
    this.relatedInterests = relatedInterests;
  }

  /**
   * List of related search terms
   * @return relatedSearches
   */
  public List<String> getRelatedSearches() {
    return relatedSearches;
  }

  public void setRelatedSearches(List<String> relatedSearches) {
    this.relatedSearches = relatedSearches;
  }

  /**
   * Time series data showing trend values over time, with dates as keys and values as numeric
   * @return timeSeries
   */
  public Map<String, BigDecimal> getTimeSeries() {
    return timeSeries;
  }

  public void setTimeSeries(Map<String, BigDecimal> timeSeries) {
    this.timeSeries = timeSeries;
  }

  /**
   * Title of the trending topic
   * @return title
   */
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
