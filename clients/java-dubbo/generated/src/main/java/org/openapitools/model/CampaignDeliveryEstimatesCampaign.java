package org.openapitools.model;

import org.openapitools.model.AdGroupDeliveryEstimates;
import org.openapitools.model.BudgetDurationType;
import org.openapitools.model.DeliveryEstimateObjectiveType;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Campaign configuration for delivery estimates.
 */
public class CampaignDeliveryEstimatesCampaign implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("ad_groups")
  private List<AdGroupDeliveryEstimates> adGroups = new ArrayList<>();

  /**
   * Duration type of the budget
   */
  @JsonProperty("budget_duration_type")
  private BudgetDurationType budgetDurationType;

  /**
   * Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
   */
  @JsonProperty("daily_spend_cap")
  private Integer dailySpendCap;

  /**
   * End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
   */
  @JsonProperty("end_date")
  private String endDate;

  /**
   * Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
   */
  @JsonProperty("lifetime_spend_cap")
  private Integer lifetimeSpendCap;

  @JsonProperty("objective_type")
  private DeliveryEstimateObjectiveType objectiveType;

  /**
   * Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
   */
  @JsonProperty("start_date")
  private String startDate;

  /**
   * 
   * @return adGroups
   */
  public List<AdGroupDeliveryEstimates> getAdGroups() {
    return adGroups;
  }

  public void setAdGroups(List<AdGroupDeliveryEstimates> adGroups) {
    this.adGroups = adGroups;
  }

  /**
   * Duration type of the budget
   * @return budgetDurationType
   */
  public BudgetDurationType getBudgetDurationType() {
    return budgetDurationType;
  }

  public void setBudgetDurationType(BudgetDurationType budgetDurationType) {
    this.budgetDurationType = budgetDurationType;
  }

  /**
   * Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
   * @return dailySpendCap
   */
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  /**
   * End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
   * @return endDate
   */
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  /**
   * Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
   * @return lifetimeSpendCap
   */
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  /**
   * 
   * @return objectiveType
   */
  public DeliveryEstimateObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(DeliveryEstimateObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  /**
   * Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
   * @return startDate
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
