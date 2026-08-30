package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AdGroupDeliveryEstimates;
import org.openapitools.vertxweb.server.model.BudgetDurationType;
import org.openapitools.vertxweb.server.model.DeliveryEstimateObjectiveType;

/**
 * Campaign configuration for delivery estimates.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CampaignDeliveryEstimatesCampaign   {
  
  private List<AdGroupDeliveryEstimates> adGroups = new ArrayList<>();
  private BudgetDurationType budgetDurationType;
  private Integer dailySpendCap;
  private String endDate;
  private Integer lifetimeSpendCap;
  private DeliveryEstimateObjectiveType objectiveType;
  private String startDate;

  public CampaignDeliveryEstimatesCampaign () {

  }

  public CampaignDeliveryEstimatesCampaign (List<AdGroupDeliveryEstimates> adGroups, BudgetDurationType budgetDurationType, Integer dailySpendCap, String endDate, Integer lifetimeSpendCap, DeliveryEstimateObjectiveType objectiveType, String startDate) {
    this.adGroups = adGroups;
    this.budgetDurationType = budgetDurationType;
    this.dailySpendCap = dailySpendCap;
    this.endDate = endDate;
    this.lifetimeSpendCap = lifetimeSpendCap;
    this.objectiveType = objectiveType;
    this.startDate = startDate;
  }

    
  @JsonProperty("ad_groups")
  public List<AdGroupDeliveryEstimates> getAdGroups() {
    return adGroups;
  }
  public void setAdGroups(List<AdGroupDeliveryEstimates> adGroups) {
    this.adGroups = adGroups;
  }

    
  @JsonProperty("budget_duration_type")
  public BudgetDurationType getBudgetDurationType() {
    return budgetDurationType;
  }
  public void setBudgetDurationType(BudgetDurationType budgetDurationType) {
    this.budgetDurationType = budgetDurationType;
  }

    
  @JsonProperty("daily_spend_cap")
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }
  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

    
  @JsonProperty("end_date")
  public String getEndDate() {
    return endDate;
  }
  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

    
  @JsonProperty("lifetime_spend_cap")
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }
  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

    
  @JsonProperty("objective_type")
  public DeliveryEstimateObjectiveType getObjectiveType() {
    return objectiveType;
  }
  public void setObjectiveType(DeliveryEstimateObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

    
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
