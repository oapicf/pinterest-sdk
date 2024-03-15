package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AdCommonTrackingUrls;
import org.openapitools.model.CampaignSummaryStatus;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.ObjectiveType;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * CampaignCreateResponseData
 */

@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-03-14T23:03:40.689435566Z[Etc/UTC]", comments = "Generator version: 7.4.0")
public class CampaignCreateResponseData {

  private String adAccountId;

  private String name;

  private EntityStatus status;

  private JsonNullable<Integer> lifetimeSpendCap = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> dailySpendCap = JsonNullable.<Integer>undefined();

  private JsonNullable<@Pattern(regexp = "^\\d+$") String> orderLineId = JsonNullable.<String>undefined();

  private JsonNullable<AdCommonTrackingUrls> trackingUrls = JsonNullable.<AdCommonTrackingUrls>undefined();

  private JsonNullable<Integer> startTime = JsonNullable.<Integer>undefined();

  private JsonNullable<Integer> endTime = JsonNullable.<Integer>undefined();

  private CampaignSummaryStatus summaryStatus;

  private JsonNullable<Boolean> isFlexibleDailyBudgets = JsonNullable.<Boolean>undefined();

  private JsonNullable<Integer> defaultAdGroupBudgetInMicroCurrency = JsonNullable.<Integer>undefined();

  private Boolean isAutomatedCampaign = false;

  private String id;

  private ObjectiveType objectiveType;

  private Integer createdTime;

  private Integer updatedTime;

  private String type;

  private JsonNullable<Boolean> isCampaignBudgetOptimization = JsonNullable.<Boolean>undefined();

  public CampaignCreateResponseData adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
   * @return adAccountId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CampaignCreateResponseData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Campaign name.
   * @return name
  */
  
  @Schema(name = "name", example = "ACME Tools", description = "Campaign name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CampaignCreateResponseData status(EntityStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public EntityStatus getStatus() {
    return status;
  }

  public void setStatus(EntityStatus status) {
    this.status = status;
  }

  public CampaignCreateResponseData lifetimeSpendCap(Integer lifetimeSpendCap) {
    this.lifetimeSpendCap = JsonNullable.of(lifetimeSpendCap);
    return this;
  }

  /**
   * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.
   * @return lifetimeSpendCap
  */
  
  @Schema(name = "lifetime_spend_cap", example = "1432744744", description = "Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"daily_spend_cap\" cannot be set at the same time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("lifetime_spend_cap")
  public JsonNullable<Integer> getLifetimeSpendCap() {
    return lifetimeSpendCap;
  }

  public void setLifetimeSpendCap(JsonNullable<Integer> lifetimeSpendCap) {
    this.lifetimeSpendCap = lifetimeSpendCap;
  }

  public CampaignCreateResponseData dailySpendCap(Integer dailySpendCap) {
    this.dailySpendCap = JsonNullable.of(dailySpendCap);
    return this;
  }

  /**
   * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.
   * @return dailySpendCap
  */
  
  @Schema(name = "daily_spend_cap", example = "1432744744", description = "Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \"lifetime_spend_cap\" cannot be set at the same time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("daily_spend_cap")
  public JsonNullable<Integer> getDailySpendCap() {
    return dailySpendCap;
  }

  public void setDailySpendCap(JsonNullable<Integer> dailySpendCap) {
    this.dailySpendCap = dailySpendCap;
  }

  public CampaignCreateResponseData orderLineId(String orderLineId) {
    this.orderLineId = JsonNullable.of(orderLineId);
    return this;
  }

  /**
   * Order line ID that appears on the invoice.
   * @return orderLineId
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "order_line_id", example = "549755885175", description = "Order line ID that appears on the invoice.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("order_line_id")
  public JsonNullable<@Pattern(regexp = "^\\d+$") String> getOrderLineId() {
    return orderLineId;
  }

  public void setOrderLineId(JsonNullable<String> orderLineId) {
    this.orderLineId = orderLineId;
  }

  public CampaignCreateResponseData trackingUrls(AdCommonTrackingUrls trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
  */
  @Valid 
  @Schema(name = "tracking_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking_urls")
  public JsonNullable<AdCommonTrackingUrls> getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(JsonNullable<AdCommonTrackingUrls> trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  public CampaignCreateResponseData startTime(Integer startTime) {
    this.startTime = JsonNullable.of(startTime);
    return this;
  }

  /**
   * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   * @return startTime
  */
  
  @Schema(name = "start_time", example = "1580865126", description = "Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public JsonNullable<Integer> getStartTime() {
    return startTime;
  }

  public void setStartTime(JsonNullable<Integer> startTime) {
    this.startTime = startTime;
  }

  public CampaignCreateResponseData endTime(Integer endTime) {
    this.endTime = JsonNullable.of(endTime);
    return this;
  }

  /**
   * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
   * @return endTime
  */
  
  @Schema(name = "end_time", example = "1644023526", description = "Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public JsonNullable<Integer> getEndTime() {
    return endTime;
  }

  public void setEndTime(JsonNullable<Integer> endTime) {
    this.endTime = endTime;
  }

  public CampaignCreateResponseData summaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
    return this;
  }

  /**
   * Get summaryStatus
   * @return summaryStatus
  */
  @Valid 
  @Schema(name = "summary_status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("summary_status")
  public CampaignSummaryStatus getSummaryStatus() {
    return summaryStatus;
  }

  public void setSummaryStatus(CampaignSummaryStatus summaryStatus) {
    this.summaryStatus = summaryStatus;
  }

  public CampaignCreateResponseData isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = JsonNullable.of(isFlexibleDailyBudgets);
    return this;
  }

  /**
   * Determines if a campaign has flexible daily budgets setup.
   * @return isFlexibleDailyBudgets
  */
  
  @Schema(name = "is_flexible_daily_budgets", example = "true", description = "Determines if a campaign has flexible daily budgets setup.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_flexible_daily_budgets")
  public JsonNullable<Boolean> getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  public void setIsFlexibleDailyBudgets(JsonNullable<Boolean> isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  public CampaignCreateResponseData defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = JsonNullable.of(defaultAdGroupBudgetInMicroCurrency);
    return this;
  }

  /**
   * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
   * @return defaultAdGroupBudgetInMicroCurrency
  */
  
  @Schema(name = "default_ad_group_budget_in_micro_currency", example = "0", description = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public JsonNullable<Integer> getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  public void setDefaultAdGroupBudgetInMicroCurrency(JsonNullable<Integer> defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  public CampaignCreateResponseData isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
    return this;
  }

  /**
   * Specifies whether the campaign was created in the automated campaign flow
   * @return isAutomatedCampaign
  */
  
  @Schema(name = "is_automated_campaign", example = "true", description = "Specifies whether the campaign was created in the automated campaign flow", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_automated_campaign")
  public Boolean getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  public void setIsAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  public CampaignCreateResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Campaign ID.
   * @return id
  */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "549755885175", description = "Campaign ID.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CampaignCreateResponseData objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
    return this;
  }

  /**
   * Get objectiveType
   * @return objectiveType
  */
  @Valid 
  @Schema(name = "objective_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objective_type")
  public ObjectiveType getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(ObjectiveType objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignCreateResponseData createdTime(Integer createdTime) {
    this.createdTime = createdTime;
    return this;
  }

  /**
   * Campaign creation time. Unix timestamp in seconds.
   * @return createdTime
  */
  
  @Schema(name = "created_time", example = "1432744744", description = "Campaign creation time. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("created_time")
  public Integer getCreatedTime() {
    return createdTime;
  }

  public void setCreatedTime(Integer createdTime) {
    this.createdTime = createdTime;
  }

  public CampaignCreateResponseData updatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
    return this;
  }

  /**
   * UTC timestamp. Last update time.
   * @return updatedTime
  */
  
  @Schema(name = "updated_time", example = "1432744744", description = "UTC timestamp. Last update time.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updated_time")
  public Integer getUpdatedTime() {
    return updatedTime;
  }

  public void setUpdatedTime(Integer updatedTime) {
    this.updatedTime = updatedTime;
  }

  public CampaignCreateResponseData type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Always \"campaign\".
   * @return type
  */
  
  @Schema(name = "type", example = "campaign", description = "Always \"campaign\".", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public CampaignCreateResponseData isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = JsonNullable.of(isCampaignBudgetOptimization);
    return this;
  }

  /**
   * Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.
   * @return isCampaignBudgetOptimization
  */
  
  @Schema(name = "is_campaign_budget_optimization", example = "true", description = "Determines if a campaign automatically generate ad-group level budgets given a campaign budget to maximize campaign outcome. When transitioning from non-cbo to cbo, all previous child ad group budget will be cleared.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_campaign_budget_optimization")
  public JsonNullable<Boolean> getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }

  public void setIsCampaignBudgetOptimization(JsonNullable<Boolean> isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignCreateResponseData campaignCreateResponseData = (CampaignCreateResponseData) o;
    return Objects.equals(this.adAccountId, campaignCreateResponseData.adAccountId) &&
        Objects.equals(this.name, campaignCreateResponseData.name) &&
        Objects.equals(this.status, campaignCreateResponseData.status) &&
        equalsNullable(this.lifetimeSpendCap, campaignCreateResponseData.lifetimeSpendCap) &&
        equalsNullable(this.dailySpendCap, campaignCreateResponseData.dailySpendCap) &&
        equalsNullable(this.orderLineId, campaignCreateResponseData.orderLineId) &&
        equalsNullable(this.trackingUrls, campaignCreateResponseData.trackingUrls) &&
        equalsNullable(this.startTime, campaignCreateResponseData.startTime) &&
        equalsNullable(this.endTime, campaignCreateResponseData.endTime) &&
        Objects.equals(this.summaryStatus, campaignCreateResponseData.summaryStatus) &&
        equalsNullable(this.isFlexibleDailyBudgets, campaignCreateResponseData.isFlexibleDailyBudgets) &&
        equalsNullable(this.defaultAdGroupBudgetInMicroCurrency, campaignCreateResponseData.defaultAdGroupBudgetInMicroCurrency) &&
        Objects.equals(this.isAutomatedCampaign, campaignCreateResponseData.isAutomatedCampaign) &&
        Objects.equals(this.id, campaignCreateResponseData.id) &&
        Objects.equals(this.objectiveType, campaignCreateResponseData.objectiveType) &&
        Objects.equals(this.createdTime, campaignCreateResponseData.createdTime) &&
        Objects.equals(this.updatedTime, campaignCreateResponseData.updatedTime) &&
        Objects.equals(this.type, campaignCreateResponseData.type) &&
        equalsNullable(this.isCampaignBudgetOptimization, campaignCreateResponseData.isCampaignBudgetOptimization);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adAccountId, name, status, hashCodeNullable(lifetimeSpendCap), hashCodeNullable(dailySpendCap), hashCodeNullable(orderLineId), hashCodeNullable(trackingUrls), hashCodeNullable(startTime), hashCodeNullable(endTime), summaryStatus, hashCodeNullable(isFlexibleDailyBudgets), hashCodeNullable(defaultAdGroupBudgetInMicroCurrency), isAutomatedCampaign, id, objectiveType, createdTime, updatedTime, type, hashCodeNullable(isCampaignBudgetOptimization));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignCreateResponseData {\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    summaryStatus: ").append(toIndentedString(summaryStatus)).append("\n");
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
    sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

