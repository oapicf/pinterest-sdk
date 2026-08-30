package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignPlanningPointEstimate   {
  
  private Integer budget;
  private Double doubleY;
  private Integer maxY;
  private Integer minY;
  private Integer y;

  public CampaignPlanningPointEstimate () {

  }

  public CampaignPlanningPointEstimate (Integer budget, Double doubleY, Integer maxY, Integer minY, Integer y) {
    this.budget = budget;
    this.doubleY = doubleY;
    this.maxY = maxY;
    this.minY = minY;
    this.y = y;
  }

    
  @JsonProperty("budget")
  public Integer getBudget() {
    return budget;
  }
  public void setBudget(Integer budget) {
    this.budget = budget;
  }

    
  @JsonProperty("double_y")
  public Double getDoubleY() {
    return doubleY;
  }
  public void setDoubleY(Double doubleY) {
    this.doubleY = doubleY;
  }

    
  @JsonProperty("max_y")
  public Integer getMaxY() {
    return maxY;
  }
  public void setMaxY(Integer maxY) {
    this.maxY = maxY;
  }

    
  @JsonProperty("min_y")
  public Integer getMinY() {
    return minY;
  }
  public void setMinY(Integer minY) {
    this.minY = minY;
  }

    
  @JsonProperty("y")
  public Integer getY() {
    return y;
  }
  public void setY(Integer y) {
    this.y = y;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignPlanningPointEstimate campaignPlanningPointEstimate = (CampaignPlanningPointEstimate) o;
    return Objects.equals(budget, campaignPlanningPointEstimate.budget) &&
        Objects.equals(doubleY, campaignPlanningPointEstimate.doubleY) &&
        Objects.equals(maxY, campaignPlanningPointEstimate.maxY) &&
        Objects.equals(minY, campaignPlanningPointEstimate.minY) &&
        Objects.equals(y, campaignPlanningPointEstimate.y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, doubleY, maxY, minY, y);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignPlanningPointEstimate {\n");
    
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    doubleY: ").append(toIndentedString(doubleY)).append("\n");
    sb.append("    maxY: ").append(toIndentedString(maxY)).append("\n");
    sb.append("    minY: ").append(toIndentedString(minY)).append("\n");
    sb.append("    y: ").append(toIndentedString(y)).append("\n");
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
