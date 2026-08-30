package org.openapitools.model;

import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 */
@ApiModel(description="A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.")

public class CampaignPlanningPointEstimate  {
  
 /**
  * The budget value of the point.
  */
  @ApiModelProperty(example = "5000000", required = true, value = "The budget value of the point.")
  private Integer budget;

 /**
  * Y value as a decimal.
  */
  @ApiModelProperty(example = "10.68", required = true, value = "Y value as a decimal.")
  private Double doubleY;

 /**
  * The maximum Y value of the point.
  */
  @ApiModelProperty(example = "2000", required = true, value = "The maximum Y value of the point.")
  private Integer maxY;

 /**
  * The minimum Y value of the point.
  */
  @ApiModelProperty(example = "1000", required = true, value = "The minimum Y value of the point.")
  private Integer minY;

 /**
  * The expected Y value of the point.
  */
  @ApiModelProperty(example = "1500", required = true, value = "The expected Y value of the point.")
  private Integer y;
 /**
  * The budget value of the point.
  * @return budget
  */
  @JsonProperty("budget")
  @NotNull
  public Integer getBudget() {
    return budget;
  }

  /**
   * Sets the <code>budget</code> property.
   */
 public void setBudget(Integer budget) {
    this.budget = budget;
  }

  /**
   * Sets the <code>budget</code> property.
   */
  public CampaignPlanningPointEstimate budget(Integer budget) {
    this.budget = budget;
    return this;
  }

 /**
  * Y value as a decimal.
  * @return doubleY
  */
  @JsonProperty("double_y")
  @NotNull
  public Double getDoubleY() {
    return doubleY;
  }

  /**
   * Sets the <code>doubleY</code> property.
   */
 public void setDoubleY(Double doubleY) {
    this.doubleY = doubleY;
  }

  /**
   * Sets the <code>doubleY</code> property.
   */
  public CampaignPlanningPointEstimate doubleY(Double doubleY) {
    this.doubleY = doubleY;
    return this;
  }

 /**
  * The maximum Y value of the point.
  * @return maxY
  */
  @JsonProperty("max_y")
  @NotNull
  public Integer getMaxY() {
    return maxY;
  }

  /**
   * Sets the <code>maxY</code> property.
   */
 public void setMaxY(Integer maxY) {
    this.maxY = maxY;
  }

  /**
   * Sets the <code>maxY</code> property.
   */
  public CampaignPlanningPointEstimate maxY(Integer maxY) {
    this.maxY = maxY;
    return this;
  }

 /**
  * The minimum Y value of the point.
  * @return minY
  */
  @JsonProperty("min_y")
  @NotNull
  public Integer getMinY() {
    return minY;
  }

  /**
   * Sets the <code>minY</code> property.
   */
 public void setMinY(Integer minY) {
    this.minY = minY;
  }

  /**
   * Sets the <code>minY</code> property.
   */
  public CampaignPlanningPointEstimate minY(Integer minY) {
    this.minY = minY;
    return this;
  }

 /**
  * The expected Y value of the point.
  * @return y
  */
  @JsonProperty("y")
  @NotNull
  public Integer getY() {
    return y;
  }

  /**
   * Sets the <code>y</code> property.
   */
 public void setY(Integer y) {
    this.y = y;
  }

  /**
   * Sets the <code>y</code> property.
   */
  public CampaignPlanningPointEstimate y(Integer y) {
    this.y = y;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

