package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 */

@Schema(name = "CampaignPlanningPointEstimate", description = "A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignPlanningPointEstimate {

  private Integer budget;

  private JsonNullable<Double> doubleY = JsonNullable.<Double>undefined();

  private JsonNullable<Integer> maxY = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> minY = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> y = JsonNullable.<Integer>undefined();

  public CampaignPlanningPointEstimate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignPlanningPointEstimate(Integer budget, Double doubleY, Integer maxY, Integer minY, Integer y) {
    this.budget = budget;
    this.doubleY = JsonNullable.of(doubleY);
    this.maxY = JsonNullable.of(maxY);
    this.minY = JsonNullable.of(minY);
    this.y = JsonNullable.of(y);
  }

  public CampaignPlanningPointEstimate budget(Integer budget) {
    this.budget = budget;
    return this;
  }

  /**
   * The budget value of the point.
   * @return budget
   */
  @NotNull 
  @Schema(name = "budget", example = "5000000", description = "The budget value of the point.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("budget")
  public Integer getBudget() {
    return budget;
  }

  @JsonProperty("budget")
  public void setBudget(Integer budget) {
    this.budget = budget;
  }

  public CampaignPlanningPointEstimate doubleY(Double doubleY) {
    this.doubleY = JsonNullable.of(doubleY);
    return this;
  }

  /**
   * Y value as a decimal.
   * @return doubleY
   */
  @NotNull 
  @Schema(name = "double_y", example = "10.68", description = "Y value as a decimal.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("double_y")
  public JsonNullable<Double> getDoubleY() {
    return doubleY;
  }

  @JsonProperty("double_y")
  public void setDoubleY(JsonNullable<Double> doubleY) {
    this.doubleY = doubleY;
  }

  public CampaignPlanningPointEstimate maxY(Integer maxY) {
    this.maxY = JsonNullable.of(maxY);
    return this;
  }

  /**
   * The maximum Y value of the point.
   * @return maxY
   */
  @NotNull 
  @Schema(name = "max_y", example = "2000", description = "The maximum Y value of the point.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("max_y")
  public JsonNullable<Integer> getMaxY() {
    return maxY;
  }

  @JsonProperty("max_y")
  public void setMaxY(JsonNullable<Integer> maxY) {
    this.maxY = maxY;
  }

  public CampaignPlanningPointEstimate minY(Integer minY) {
    this.minY = JsonNullable.of(minY);
    return this;
  }

  /**
   * The minimum Y value of the point.
   * @return minY
   */
  @NotNull 
  @Schema(name = "min_y", example = "1000", description = "The minimum Y value of the point.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("min_y")
  public JsonNullable<Integer> getMinY() {
    return minY;
  }

  @JsonProperty("min_y")
  public void setMinY(JsonNullable<Integer> minY) {
    this.minY = minY;
  }

  public CampaignPlanningPointEstimate y(Integer y) {
    this.y = JsonNullable.of(y);
    return this;
  }

  /**
   * The expected Y value of the point.
   * @return y
   */
  @NotNull 
  @Schema(name = "y", example = "1500", description = "The expected Y value of the point.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("y")
  public JsonNullable<Integer> getY() {
    return y;
  }

  @JsonProperty("y")
  public void setY(JsonNullable<Integer> y) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

