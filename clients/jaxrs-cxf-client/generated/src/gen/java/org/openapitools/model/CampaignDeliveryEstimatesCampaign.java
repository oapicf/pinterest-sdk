package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdGroupDeliveryEstimates;
import org.openapitools.model.BudgetDurationType;
import org.openapitools.model.DeliveryEstimateObjectiveType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Campaign configuration for delivery estimates.
 */
@ApiModel(description="Campaign configuration for delivery estimates.")

public class CampaignDeliveryEstimatesCampaign  {
  
  @ApiModelProperty(required = true, value = "")

  private List<AdGroupDeliveryEstimates> adGroups = new ArrayList<>();

 /**
  * Duration type of the budget
  */
  @ApiModelProperty(example = "FIXED_DAILY", required = true, value = "Duration type of the budget")

  private BudgetDurationType budgetDurationType;

 /**
  * Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
  */
  @ApiModelProperty(example = "50000000", value = "Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.")

  private Integer dailySpendCap;

 /**
  * End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
  */
  @ApiModelProperty(value = "End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.")

  private String endDate;

 /**
  * Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
  */
  @ApiModelProperty(example = "500000000", value = "Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.")

  private Integer lifetimeSpendCap;

  @ApiModelProperty(required = true, value = "")

  private DeliveryEstimateObjectiveType objectiveType;

 /**
  * Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
  */
  @ApiModelProperty(required = true, value = "Start date of the date range for an ad campaign, pattern YYYY-MM-DD.")

  private String startDate;
 /**
   * Get adGroups
   * @return adGroups
  **/
  @JsonProperty("ad_groups")
  public List<AdGroupDeliveryEstimates> getAdGroups() {
    return adGroups;
  }

  public void setAdGroups(List<AdGroupDeliveryEstimates> adGroups) {
    this.adGroups = adGroups;
  }

  public CampaignDeliveryEstimatesCampaign adGroups(List<AdGroupDeliveryEstimates> adGroups) {
    this.adGroups = adGroups;
    return this;
  }

  public CampaignDeliveryEstimatesCampaign addAdGroupsItem(AdGroupDeliveryEstimates adGroupsItem) {
    this.adGroups.add(adGroupsItem);
    return this;
  }

 /**
   * Duration type of the budget
   * @return budgetDurationType
  **/
  @JsonProperty("budget_duration_type")
  public BudgetDurationType getBudgetDurationType() {
    return budgetDurationType;
  }

  public void setBudgetDurationType(BudgetDurationType budgetDurationType) {
    this.budgetDurationType = budgetDurationType;
  }

  public CampaignDeliveryEstimatesCampaign budgetDurationType(BudgetDurationType budgetDurationType) {
    this.budgetDurationType = budgetDurationType;
    return this;
  }

 /**
   * Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
   * @return dailySpendCap
  **/
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignDeliveryEstimatesCampaign dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

 /**
   * End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
   * @return endDate
  **/
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public CampaignDeliveryEstimatesCampaign endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

 /**
   * Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
   * @return lifetimeSpendCap
  **/
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignDeliveryEstimatesCampaign lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

 /**
   * Get objectiveType
   * @return objectiveType
  **/
  @JsonProperty("objective_type")
  public DeliveryEstimateObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(DeliveryEstimateObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignDeliveryEstimatesCampaign objectiveType(DeliveryEstimateObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

 /**
   * Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
   * @return startDate
  **/
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public CampaignDeliveryEstimatesCampaign startDate(String startDate) {
    this.startDate = startDate;
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
    CampaignDeliveryEstimatesCampaign campaignDeliveryEstimatesCampaign = (CampaignDeliveryEstimatesCampaign) o;
    return Objects.equals(this.adGroups, campaignDeliveryEstimatesCampaign.adGroups) &&
        Objects.equals(this.budgetDurationType, campaignDeliveryEstimatesCampaign.budgetDurationType) &&
        Objects.equals(this.dailySpendCap, campaignDeliveryEstimatesCampaign.dailySpendCap) &&
        Objects.equals(this.endDate, campaignDeliveryEstimatesCampaign.endDate) &&
        Objects.equals(this.lifetimeSpendCap, campaignDeliveryEstimatesCampaign.lifetimeSpendCap) &&
        Objects.equals(this.objectiveType, campaignDeliveryEstimatesCampaign.objectiveType) &&
        Objects.equals(this.startDate, campaignDeliveryEstimatesCampaign.startDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adGroups, budgetDurationType, dailySpendCap, endDate, lifetimeSpendCap, objectiveType, startDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignDeliveryEstimatesCampaign {\n");
    
    sb.append("    adGroups: ").append(toIndentedString(adGroups)).append("\n");
    sb.append("    budgetDurationType: ").append(toIndentedString(budgetDurationType)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
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

