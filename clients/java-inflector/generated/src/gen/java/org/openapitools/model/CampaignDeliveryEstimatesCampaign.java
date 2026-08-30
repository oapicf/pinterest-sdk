package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdGroupDeliveryEstimates;
import org.openapitools.model.BudgetDurationType;
import org.openapitools.model.DeliveryEstimateObjectiveType;



/**
 * Campaign configuration for delivery estimates.
 **/

@ApiModel(description = "Campaign configuration for delivery estimates.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignDeliveryEstimatesCampaign   {
  @JsonProperty("ad_groups")
  private List<AdGroupDeliveryEstimates> adGroups = new ArrayList<>();

  @JsonProperty("budget_duration_type")
  private BudgetDurationType budgetDurationType;

  @JsonProperty("daily_spend_cap")
  private Integer dailySpendCap;

  @JsonProperty("end_date")
  private String endDate;

  @JsonProperty("lifetime_spend_cap")
  private Integer lifetimeSpendCap;

  @JsonProperty("objective_type")
  private DeliveryEstimateObjectiveType objectiveType;

  @JsonProperty("start_date")
  private String startDate;

  /**
   **/
  public CampaignDeliveryEstimatesCampaign adGroups(List<AdGroupDeliveryEstimates> adGroups) {
    this.adGroups = adGroups;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("ad_groups")
  public List<AdGroupDeliveryEstimates> getAdGroups() {
    return adGroups;
  }
  public void setAdGroups(List<AdGroupDeliveryEstimates> adGroups) {
    this.adGroups = adGroups;
  }

  /**
   * Duration type of the budget
   **/
  public CampaignDeliveryEstimatesCampaign budgetDurationType(BudgetDurationType budgetDurationType) {
    this.budgetDurationType = budgetDurationType;
    return this;
  }

  
  @ApiModelProperty(example = "FIXED_DAILY", required = true, value = "Duration type of the budget")
  @JsonProperty("budget_duration_type")
  public BudgetDurationType getBudgetDurationType() {
    return budgetDurationType;
  }
  public void setBudgetDurationType(BudgetDurationType budgetDurationType) {
    this.budgetDurationType = budgetDurationType;
  }

  /**
   * Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
   **/
  public CampaignDeliveryEstimatesCampaign dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

  
  @ApiModelProperty(example = "50000000", value = "Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.")
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }
  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  /**
   * End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
   **/
  public CampaignDeliveryEstimatesCampaign endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

  
  @ApiModelProperty(value = "End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.")
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
   **/
  public CampaignDeliveryEstimatesCampaign lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

  
  @ApiModelProperty(example = "500000000", value = "Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.")
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }
  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  /**
   **/
  public CampaignDeliveryEstimatesCampaign objectiveType(DeliveryEstimateObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("objective_type")
  public DeliveryEstimateObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(DeliveryEstimateObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
   **/
  public CampaignDeliveryEstimatesCampaign startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Start date of the date range for an ad campaign, pattern YYYY-MM-DD.")
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }
  public void setStartDate(String startDate) {
    this.startDate = startDate;
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
    return Objects.equals(adGroups, campaignDeliveryEstimatesCampaign.adGroups) &&
        Objects.equals(budgetDurationType, campaignDeliveryEstimatesCampaign.budgetDurationType) &&
        Objects.equals(dailySpendCap, campaignDeliveryEstimatesCampaign.dailySpendCap) &&
        Objects.equals(endDate, campaignDeliveryEstimatesCampaign.endDate) &&
        Objects.equals(lifetimeSpendCap, campaignDeliveryEstimatesCampaign.lifetimeSpendCap) &&
        Objects.equals(objectiveType, campaignDeliveryEstimatesCampaign.objectiveType) &&
        Objects.equals(startDate, campaignDeliveryEstimatesCampaign.startDate);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

