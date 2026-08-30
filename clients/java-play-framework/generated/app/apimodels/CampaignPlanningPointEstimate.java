package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignPlanningPointEstimate   {
  @JsonProperty("budget")
  @NotNull

  private Integer budget;

  @JsonProperty("double_y")
  @NotNull

  private Double doubleY;

  @JsonProperty("max_y")
  @NotNull

  private Integer maxY;

  @JsonProperty("min_y")
  @NotNull

  private Integer minY;

  @JsonProperty("y")
  @NotNull

  private Integer y;

  public CampaignPlanningPointEstimate budget(Integer budget) {
    this.budget = budget;
    return this;
  }

   /**
   * The budget value of the point.
   * @return budget
  **/
  public Integer getBudget() {
    return budget;
  }

  public void setBudget(Integer budget) {
    this.budget = budget;
  }

  public CampaignPlanningPointEstimate doubleY(Double doubleY) {
    this.doubleY = doubleY;
    return this;
  }

   /**
   * Y value as a decimal.
   * @return doubleY
  **/
  public Double getDoubleY() {
    return doubleY;
  }

  public void setDoubleY(Double doubleY) {
    this.doubleY = doubleY;
  }

  public CampaignPlanningPointEstimate maxY(Integer maxY) {
    this.maxY = maxY;
    return this;
  }

   /**
   * The maximum Y value of the point.
   * @return maxY
  **/
  public Integer getMaxY() {
    return maxY;
  }

  public void setMaxY(Integer maxY) {
    this.maxY = maxY;
  }

  public CampaignPlanningPointEstimate minY(Integer minY) {
    this.minY = minY;
    return this;
  }

   /**
   * The minimum Y value of the point.
   * @return minY
  **/
  public Integer getMinY() {
    return minY;
  }

  public void setMinY(Integer minY) {
    this.minY = minY;
  }

  public CampaignPlanningPointEstimate y(Integer y) {
    this.y = y;
    return this;
  }

   /**
   * The expected Y value of the point.
   * @return y
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

