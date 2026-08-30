package apimodels;

import apimodels.AdGroupDeliveryEstimates;
import apimodels.BudgetDurationType;
import apimodels.DeliveryEstimateObjectiveType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Campaign configuration for delivery estimates.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class CampaignDeliveryEstimatesCampaign   {
  @JsonProperty("ad_groups")
  @NotNull
@Size(min=1,max=10)
@Valid

  private List<@Valid AdGroupDeliveryEstimates> adGroups = new ArrayList<>();

  @JsonProperty("budget_duration_type")
  @NotNull
@Valid

  private BudgetDurationType budgetDurationType;

  @JsonProperty("daily_spend_cap")
  
  private Integer dailySpendCap;

  @JsonProperty("end_date")
  @Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String endDate;

  @JsonProperty("lifetime_spend_cap")
  
  private Integer lifetimeSpendCap;

  @JsonProperty("objective_type")
  @NotNull
@Valid

  private DeliveryEstimateObjectiveType objectiveType;

  @JsonProperty("start_date")
  @NotNull
@Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")

  private String startDate;

  public CampaignDeliveryEstimatesCampaign adGroups(List<@Valid AdGroupDeliveryEstimates> adGroups) {
    this.adGroups = adGroups;
    return this;
  }

  public CampaignDeliveryEstimatesCampaign addAdGroupsItem(AdGroupDeliveryEstimates adGroupsItem) {
    if (this.adGroups == null) {
      this.adGroups = new ArrayList<>();
    }
    this.adGroups.add(adGroupsItem);
    return this;
  }

   /**
   * Get adGroups
   * @return adGroups
  **/
  public List<@Valid AdGroupDeliveryEstimates> getAdGroups() {
    return adGroups;
  }

  public void setAdGroups(List<@Valid AdGroupDeliveryEstimates> adGroups) {
    this.adGroups = adGroups;
  }

  public CampaignDeliveryEstimatesCampaign budgetDurationType(BudgetDurationType budgetDurationType) {
    this.budgetDurationType = budgetDurationType;
    return this;
  }

   /**
   * Duration type of the budget
   * @return budgetDurationType
  **/
  public BudgetDurationType getBudgetDurationType() {
    return budgetDurationType;
  }

  public void setBudgetDurationType(BudgetDurationType budgetDurationType) {
    this.budgetDurationType = budgetDurationType;
  }

  public CampaignDeliveryEstimatesCampaign dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

   /**
   * Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
   * @return dailySpendCap
  **/
  public Integer getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignDeliveryEstimatesCampaign endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
   * @return endDate
  **/
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  public CampaignDeliveryEstimatesCampaign lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

   /**
   * Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
   * @return lifetimeSpendCap
  **/
  public Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignDeliveryEstimatesCampaign objectiveType(DeliveryEstimateObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

   /**
   * Get objectiveType
   * @return objectiveType
  **/
  public DeliveryEstimateObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(DeliveryEstimateObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignDeliveryEstimatesCampaign startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start date of the date range for an ad campaign, pattern YYYY-MM-DD.
   * @return startDate
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

