package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 **/
@ApiModel(description = "A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.")
@JsonTypeName("CampaignPlanningPointEstimate")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-08-30T09:54:53.087121019Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningPointEstimate   {
  private Integer budget;
  private Double doubleY;
  private Integer maxY;
  private Integer minY;
  private Integer y;

  public CampaignPlanningPointEstimate() {
  }

  @JsonCreator
  public CampaignPlanningPointEstimate(
    @JsonProperty(required = true, value = "budget") Integer budget,
    @JsonProperty(required = true, value = "double_y") Double doubleY,
    @JsonProperty(required = true, value = "max_y") Integer maxY,
    @JsonProperty(required = true, value = "min_y") Integer minY,
    @JsonProperty(required = true, value = "y") Integer y
  ) {
    this.budget = budget;
    this.doubleY = doubleY;
    this.maxY = maxY;
    this.minY = minY;
    this.y = y;
  }

  /**
   * The budget value of the point.
   **/
  public CampaignPlanningPointEstimate budget(Integer budget) {
    this.budget = budget;
    return this;
  }

  
  @ApiModelProperty(example = "5000000", required = true, value = "The budget value of the point.")
  @JsonProperty(required = true, value = "budget")
  @NotNull public Integer getBudget() {
    return budget;
  }

  @JsonProperty(required = true, value = "budget")
  public void setBudget(Integer budget) {
    this.budget = budget;
  }

  /**
   * Y value as a decimal.
   **/
  public CampaignPlanningPointEstimate doubleY(Double doubleY) {
    this.doubleY = doubleY;
    return this;
  }

  
  @ApiModelProperty(example = "10.68", required = true, value = "Y value as a decimal.")
  @JsonProperty(required = true, value = "double_y")
  @NotNull public Double getDoubleY() {
    return doubleY;
  }

  @JsonProperty(required = true, value = "double_y")
  public void setDoubleY(Double doubleY) {
    this.doubleY = doubleY;
  }

  /**
   * The maximum Y value of the point.
   **/
  public CampaignPlanningPointEstimate maxY(Integer maxY) {
    this.maxY = maxY;
    return this;
  }

  
  @ApiModelProperty(example = "2000", required = true, value = "The maximum Y value of the point.")
  @JsonProperty(required = true, value = "max_y")
  @NotNull public Integer getMaxY() {
    return maxY;
  }

  @JsonProperty(required = true, value = "max_y")
  public void setMaxY(Integer maxY) {
    this.maxY = maxY;
  }

  /**
   * The minimum Y value of the point.
   **/
  public CampaignPlanningPointEstimate minY(Integer minY) {
    this.minY = minY;
    return this;
  }

  
  @ApiModelProperty(example = "1000", required = true, value = "The minimum Y value of the point.")
  @JsonProperty(required = true, value = "min_y")
  @NotNull public Integer getMinY() {
    return minY;
  }

  @JsonProperty(required = true, value = "min_y")
  public void setMinY(Integer minY) {
    this.minY = minY;
  }

  /**
   * The expected Y value of the point.
   **/
  public CampaignPlanningPointEstimate y(Integer y) {
    this.y = y;
    return this;
  }

  
  @ApiModelProperty(example = "1500", required = true, value = "The expected Y value of the point.")
  @JsonProperty(required = true, value = "y")
  @NotNull public Integer getY() {
    return y;
  }

  @JsonProperty(required = true, value = "y")
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
