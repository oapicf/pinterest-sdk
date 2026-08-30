package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.AdGroupDeliveryEstimates;
import org.openapitools.model.BudgetDurationType;
import org.openapitools.model.DeliveryEstimateObjectiveType;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Campaign configuration for delivery estimates.
 */

@Schema(name = "CampaignDeliveryEstimatesCampaign", description = "Campaign configuration for delivery estimates.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignDeliveryEstimatesCampaign {

  private List<@Valid AdGroupDeliveryEstimates> adGroups = new ArrayList<>();

  private BudgetDurationType budgetDurationType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer dailySpendCap;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String endDate;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer lifetimeSpendCap;

  private DeliveryEstimateObjectiveType objectiveType;

  private String startDate;

  public CampaignDeliveryEstimatesCampaign() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignDeliveryEstimatesCampaign(List<@Valid AdGroupDeliveryEstimates> adGroups, BudgetDurationType budgetDurationType, DeliveryEstimateObjectiveType objectiveType, String startDate) {
    this.adGroups = adGroups;
    this.budgetDurationType = budgetDurationType;
    this.objectiveType = objectiveType;
    this.startDate = startDate;
  }

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
   */
  @NotNull @Valid @Size(min = 1, max = 10) 
  @Schema(name = "ad_groups", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_groups")
  public List<@Valid AdGroupDeliveryEstimates> getAdGroups() {
    return adGroups;
  }

  @JsonProperty("ad_groups")
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
   */
  @NotNull @Valid 
  @Schema(name = "budget_duration_type", example = "FIXED_DAILY", description = "Duration type of the budget", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("budget_duration_type")
  public BudgetDurationType getBudgetDurationType() {
    return budgetDurationType;
  }

  @JsonProperty("budget_duration_type")
  public void setBudgetDurationType(BudgetDurationType budgetDurationType) {
    this.budgetDurationType = budgetDurationType;
  }

  public CampaignDeliveryEstimatesCampaign dailySpendCap(@Nullable Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
    return this;
  }

  /**
   * Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.
   * @return dailySpendCap
   */
  
  @Schema(name = "daily_spend_cap", example = "50000000", description = "Campaign daily spend cap. When the budget_duration_type is FIXED_DAILY or FLEXIBLE_DAILY, this field is required.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("daily_spend_cap")
  public @Nullable Integer getDailySpendCap() {
    return dailySpendCap;
  }

  @JsonProperty("daily_spend_cap")
  public void setDailySpendCap(@Nullable Integer dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignDeliveryEstimatesCampaign endDate(@Nullable String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.
   * @return endDate
   */
  @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "end_date", description = "End date of the date range for an ad campaign, pattern YYYY-MM-DD. Required when budget_duration_type is LIFETIME.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_date")
  public @Nullable String getEndDate() {
    return endDate;
  }

  @JsonProperty("end_date")
  public void setEndDate(@Nullable String endDate) {
    this.endDate = endDate;
  }

  public CampaignDeliveryEstimatesCampaign lifetimeSpendCap(@Nullable Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
    return this;
  }

  /**
   * Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.
   * @return lifetimeSpendCap
   */
  
  @Schema(name = "lifetime_spend_cap", example = "500000000", description = "Campaign total spending cap. When the budget_duration_type is LIFETIME, this field is required. The end date field is also required for lifetime spending.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_spend_cap")
  public @Nullable Integer getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  @JsonProperty("lifetime_spend_cap")
  public void setLifetimeSpendCap(@Nullable Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignDeliveryEstimatesCampaign objectiveType(DeliveryEstimateObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  /**
   * Get objectiveType
   * @return objectiveType
   */
  @NotNull @Valid 
  @Schema(name = "objective_type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("objective_type")
  public DeliveryEstimateObjectiveType getObjectiveType() {
    return objectiveType;
  }

  @JsonProperty("objective_type")
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
   */
  @NotNull @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$") 
  @Schema(name = "start_date", description = "Start date of the date range for an ad campaign, pattern YYYY-MM-DD.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("start_date")
  public String getStartDate() {
    return startDate;
  }

  @JsonProperty("start_date")
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

