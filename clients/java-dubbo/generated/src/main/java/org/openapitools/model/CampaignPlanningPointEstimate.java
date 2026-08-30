package org.openapitools.model;

import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 */
public class CampaignPlanningPointEstimate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The budget value of the point.
   */
  @JsonProperty("budget")
  private Integer budget;

  /**
   * Y value as a decimal.
   */
  @JsonProperty("double_y")
  private Double doubleY;

  /**
   * The maximum Y value of the point.
   */
  @JsonProperty("max_y")
  private Integer maxY;

  /**
   * The minimum Y value of the point.
   */
  @JsonProperty("min_y")
  private Integer minY;

  /**
   * The expected Y value of the point.
   */
  @JsonProperty("y")
  private Integer y;

  /**
   * The budget value of the point.
   * @return budget
   */
  public Integer getBudget() {
    return budget;
  }

  public void setBudget(Integer budget) {
    this.budget = budget;
  }

  /**
   * Y value as a decimal.
   * @return doubleY
   */
  public Double getDoubleY() {
    return doubleY;
  }

  public void setDoubleY(Double doubleY) {
    this.doubleY = doubleY;
  }

  /**
   * The maximum Y value of the point.
   * @return maxY
   */
  public Integer getMaxY() {
    return maxY;
  }

  public void setMaxY(Integer maxY) {
    this.maxY = maxY;
  }

  /**
   * The minimum Y value of the point.
   * @return minY
   */
  public Integer getMinY() {
    return minY;
  }

  public void setMinY(Integer minY) {
    this.minY = minY;
  }

  /**
   * The expected Y value of the point.
   * @return y
   */
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
    return Objects.equals(this.budget, campaignPlanningPointEstimate.budget) &&
        Objects.equals(this.doubleY, campaignPlanningPointEstimate.doubleY) &&
        Objects.equals(this.maxY, campaignPlanningPointEstimate.maxY) &&
        Objects.equals(this.minY, campaignPlanningPointEstimate.minY) &&
        Objects.equals(this.y, campaignPlanningPointEstimate.y);
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
