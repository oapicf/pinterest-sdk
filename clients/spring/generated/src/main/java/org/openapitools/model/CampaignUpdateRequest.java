package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CampaignBidOptionsUpdate;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.IntendedPromotionType;
import org.openapitools.model.ObjectiveType;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * CampaignUpdateRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class CampaignUpdateRequest {

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<CampaignBidOptionsUpdate> bidOptions = JsonNullable.<CampaignBidOptionsUpdate>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable IntendedPromotionType intendedPromotionType;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isLtvOptimized;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isPerformancePlus;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Boolean isTopOfSearch;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<ObjectiveType> objectiveType = JsonNullable.<ObjectiveType>undefined();

  private String adAccountId;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> dailySpendCap = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> defaultAdGroupBudgetInMicroCurrency = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> endTime = JsonNullable.<Integer>undefined();

  private String id;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isAutomatedCampaign = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isCampaignBudgetOptimization = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Boolean> isFlexibleDailyBudgets = JsonNullable.<Boolean>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> lifetimeSpendCap = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String name;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<@Pattern(regexp = "^\\d+$") String> orderLineId = JsonNullable.<String>undefined();

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Integer> startTime = JsonNullable.<Integer>undefined();

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable EntityStatus status;

  @JsonInclude(JsonInclude.Include.NON_ABSENT)
  private JsonNullable<Object> trackingUrls = JsonNullable.<Object>undefined();

  public CampaignUpdateRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public CampaignUpdateRequest(String adAccountId, String id) {
    this.adAccountId = adAccountId;
    this.id = id;
  }

  public CampaignUpdateRequest bidOptions(CampaignBidOptionsUpdate bidOptions) {
    this.bidOptions = JsonNullable.of(bidOptions);
    return this;
  }

  /**
   * Get bidOptions
   * @return bidOptions
   */
  @Valid 
  @Schema(name = "bid_options", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("bid_options")
  public JsonNullable<CampaignBidOptionsUpdate> getBidOptions() {
    return bidOptions;
  }

  public void setBidOptions(JsonNullable<CampaignBidOptionsUpdate> bidOptions) {
    this.bidOptions = bidOptions;
  }

  public CampaignUpdateRequest intendedPromotionType(@Nullable IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
    return this;
  }

  /**
   * Get intendedPromotionType
   * @return intendedPromotionType
   */
  @Valid 
  @Schema(name = "intended_promotion_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("intended_promotion_type")
  public @Nullable IntendedPromotionType getIntendedPromotionType() {
    return intendedPromotionType;
  }

  @JsonProperty("intended_promotion_type")
  public void setIntendedPromotionType(@Nullable IntendedPromotionType intendedPromotionType) {
    this.intendedPromotionType = intendedPromotionType;
  }

  public CampaignUpdateRequest isLtvOptimized(@Nullable Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
    return this;
  }

  /**
   * Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.
   * @return isLtvOptimized
   */
  
  @Schema(name = "is_ltv_optimized", description = "Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_ltv_optimized")
  public @Nullable Boolean getIsLtvOptimized() {
    return isLtvOptimized;
  }

  @JsonProperty("is_ltv_optimized")
  public void setIsLtvOptimized(@Nullable Boolean isLtvOptimized) {
    this.isLtvOptimized = isLtvOptimized;
  }

  public CampaignUpdateRequest isPerformancePlus(@Nullable Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
    return this;
  }

  /**
   * Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.
   * @return isPerformancePlus
   */
  
  @Schema(name = "is_performance_plus", description = "Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_performance_plus")
  public @Nullable Boolean getIsPerformancePlus() {
    return isPerformancePlus;
  }

  @JsonProperty("is_performance_plus")
  public void setIsPerformancePlus(@Nullable Boolean isPerformancePlus) {
    this.isPerformancePlus = isPerformancePlus;
  }

  public CampaignUpdateRequest isTopOfSearch(@Nullable Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
    return this;
  }

  /**
   * Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.
   * @return isTopOfSearch
   */
  
  @Schema(name = "is_top_of_search", description = "Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_top_of_search")
  public @Nullable Boolean getIsTopOfSearch() {
    return isTopOfSearch;
  }

  @JsonProperty("is_top_of_search")
  public void setIsTopOfSearch(@Nullable Boolean isTopOfSearch) {
    this.isTopOfSearch = isTopOfSearch;
  }

  public CampaignUpdateRequest objectiveType(ObjectiveType objectiveType) {
    this.objectiveType = JsonNullable.of(objectiveType);
    return this;
  }

  /**
   * Get objectiveType
   * @return objectiveType
   */
  @Valid 
  @Schema(name = "objective_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("objective_type")
  public JsonNullable<ObjectiveType> getObjectiveType() {
    return objectiveType;
  }

  public void setObjectiveType(JsonNullable<ObjectiveType> objectiveType) {
    this.objectiveType = objectiveType;
  }

  public CampaignUpdateRequest adAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
    return this;
  }

  /**
   * Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
   * @return adAccountId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_account_id", example = "549755885175", description = "Campaign's Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_account_id")
  public String getAdAccountId() {
    return adAccountId;
  }

  @JsonProperty("ad_account_id")
  public void setAdAccountId(String adAccountId) {
    this.adAccountId = adAccountId;
  }

  public CampaignUpdateRequest dailySpendCap(Integer dailySpendCap) {
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

  public CampaignUpdateRequest defaultAdGroupBudgetInMicroCurrency(Integer defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = JsonNullable.of(defaultAdGroupBudgetInMicroCurrency);
    return this;
  }

  /**
   * When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.
   * @return defaultAdGroupBudgetInMicroCurrency
   */
  
  @Schema(name = "default_ad_group_budget_in_micro_currency", description = "When transitioning from campaign budget optimization to non-campaign budget optimization, the default_ad_group_budget_in_micro_currency will propagate to each child ad groups daily budget. Unit is micro currency of the associated advertiser account.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("default_ad_group_budget_in_micro_currency")
  public JsonNullable<Integer> getDefaultAdGroupBudgetInMicroCurrency() {
    return defaultAdGroupBudgetInMicroCurrency;
  }

  public void setDefaultAdGroupBudgetInMicroCurrency(JsonNullable<Integer> defaultAdGroupBudgetInMicroCurrency) {
    this.defaultAdGroupBudgetInMicroCurrency = defaultAdGroupBudgetInMicroCurrency;
  }

  public CampaignUpdateRequest endTime(Integer endTime) {
    this.endTime = JsonNullable.of(endTime);
    return this;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return endTime
   */
  
  @Schema(name = "end_time", example = "1644023526", description = "Timestamp in Unix format for scheduling when ads in the campaign stop appearing. Must occur after any end times for child ad groups. If `end_time` is not specified for the campaign, ads run indefinitely unless you update the campaign, changing their status to `paused`. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different end times can be set for the campaign's child ad groups, but they cannot occur after an `end_time` specified for the campaign. - If your campaign has a child ad group with an end time specified, and if you update that campaign with an `end_time` that is earlier than that of the ad group, the campaign `end_time` will supersede the ad group `end_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("end_time")
  public JsonNullable<Integer> getEndTime() {
    return endTime;
  }

  public void setEndTime(JsonNullable<Integer> endTime) {
    this.endTime = endTime;
  }

  public CampaignUpdateRequest id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Campaign ID.
   * @return id
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "id", example = "549755885175", description = "Campaign ID.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  public CampaignUpdateRequest isAutomatedCampaign(Boolean isAutomatedCampaign) {
    this.isAutomatedCampaign = JsonNullable.of(isAutomatedCampaign);
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES
   * @return isAutomatedCampaign
   */
  
  @Schema(name = "is_automated_campaign", description = "Note: This field is immutable unless the campaign is in draft status. Specifies whether the campaign was created in the automated campaign flow. When using Automated Campaigns, a daily spend cap must be set, and Pinterest Performance+ may not be used. The following objective types are supported: - CONSIDERATION - WEB\\_CONVERSION - SALES - CATALOG\\_SALES", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_automated_campaign")
  public JsonNullable<Boolean> getIsAutomatedCampaign() {
    return isAutomatedCampaign;
  }

  public void setIsAutomatedCampaign(JsonNullable<Boolean> isAutomatedCampaign) {
    this.isAutomatedCampaign = isAutomatedCampaign;
  }

  public CampaignUpdateRequest isCampaignBudgetOptimization(Boolean isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = JsonNullable.of(isCampaignBudgetOptimization);
    return this;
  }

  /**
   * Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.
   * @return isCampaignBudgetOptimization
   */
  
  @Schema(name = "is_campaign_budget_optimization", description = "Note: This field is immutable unless the campaign is in draft status. Determines if a campaign automatically generates ad-group level budgets given a campaign budget to maximize campaign outcome. When using campaign budgets with a lifetime spend cap, the end time must be provided.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_campaign_budget_optimization")
  public JsonNullable<Boolean> getIsCampaignBudgetOptimization() {
    return isCampaignBudgetOptimization;
  }

  public void setIsCampaignBudgetOptimization(JsonNullable<Boolean> isCampaignBudgetOptimization) {
    this.isCampaignBudgetOptimization = isCampaignBudgetOptimization;
  }

  public CampaignUpdateRequest isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = JsonNullable.of(isFlexibleDailyBudgets);
    return this;
  }

  /**
   * Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.
   * @return isFlexibleDailyBudgets
   */
  
  @Schema(name = "is_flexible_daily_budgets", description = "Determine if a campaign has setup for flexible daily budgets, also known as \"Pinterest Performance+ budgets\". Flexible daily budgets are only supported for campaign budget optimization with a daily spend cap, and not a lifetime spend cap.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("is_flexible_daily_budgets")
  public JsonNullable<Boolean> getIsFlexibleDailyBudgets() {
    return isFlexibleDailyBudgets;
  }

  public void setIsFlexibleDailyBudgets(JsonNullable<Boolean> isFlexibleDailyBudgets) {
    this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
  }

  public CampaignUpdateRequest lifetimeSpendCap(Integer lifetimeSpendCap) {
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

  public CampaignUpdateRequest name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Campaign name.
   * @return name
   */
  
  @Schema(name = "name", example = "ACME Tools", description = "Campaign name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public CampaignUpdateRequest orderLineId(String orderLineId) {
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

  public CampaignUpdateRequest startTime(Integer startTime) {
    this.startTime = JsonNullable.of(startTime);
    return this;
  }

  /**
   * Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.
   * @return startTime
   */
  
  @Schema(name = "start_time", example = "1580865126", description = "Timestamp in Unix format for scheduling when ads in the campaign start to appear. Must precede any start times set for child ad groups. Defaults to current time if no time is specified. Learn about <a href=\"/docs/api-features/managing-campaigns/#campaign-scheduling\" target=\"blank\">scheduling campaigns</a>. Different start times can be set for the campaign's child ad groups, but they cannot occur before a `start_time` specified for the campaign. - If your campaign has a child ad group with a start time specified, and if you update that campaign with a `start_time` that is later than that of the ad group, the campaign `start_time` will supersede the ad group `start_time`, and the request will not return an error. - In this scenario, if you call <a href=\"/docs/api/v5/campaigns-list\" target=\"blank\">List campaigns</a> or <a href=\"/docs/api/v5/ad_groups-list\" target=\"blank\">List ad groups</a>, the returned campaigns or ad groups are listed with the start and end times that you assigned them, regardless of supersedence.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("start_time")
  public JsonNullable<Integer> getStartTime() {
    return startTime;
  }

  public void setStartTime(JsonNullable<Integer> startTime) {
    this.startTime = startTime;
  }

  public CampaignUpdateRequest status(@Nullable EntityStatus status) {
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
  public @Nullable EntityStatus getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(@Nullable EntityStatus status) {
    this.status = status;
  }

  public CampaignUpdateRequest trackingUrls(Object trackingUrls) {
    this.trackingUrls = JsonNullable.of(trackingUrls);
    return this;
  }

  /**
   * Get trackingUrls
   * @return trackingUrls
   */
  
  @Schema(name = "tracking_urls", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("tracking_urls")
  public JsonNullable<Object> getTrackingUrls() {
    return trackingUrls;
  }

  public void setTrackingUrls(JsonNullable<Object> trackingUrls) {
    this.trackingUrls = trackingUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignUpdateRequest campaignUpdateRequest = (CampaignUpdateRequest) o;
    return equalsNullable(this.bidOptions, campaignUpdateRequest.bidOptions) &&
        Objects.equals(this.intendedPromotionType, campaignUpdateRequest.intendedPromotionType) &&
        Objects.equals(this.isLtvOptimized, campaignUpdateRequest.isLtvOptimized) &&
        Objects.equals(this.isPerformancePlus, campaignUpdateRequest.isPerformancePlus) &&
        Objects.equals(this.isTopOfSearch, campaignUpdateRequest.isTopOfSearch) &&
        equalsNullable(this.objectiveType, campaignUpdateRequest.objectiveType) &&
        Objects.equals(this.adAccountId, campaignUpdateRequest.adAccountId) &&
        equalsNullable(this.dailySpendCap, campaignUpdateRequest.dailySpendCap) &&
        equalsNullable(this.defaultAdGroupBudgetInMicroCurrency, campaignUpdateRequest.defaultAdGroupBudgetInMicroCurrency) &&
        equalsNullable(this.endTime, campaignUpdateRequest.endTime) &&
        Objects.equals(this.id, campaignUpdateRequest.id) &&
        equalsNullable(this.isAutomatedCampaign, campaignUpdateRequest.isAutomatedCampaign) &&
        equalsNullable(this.isCampaignBudgetOptimization, campaignUpdateRequest.isCampaignBudgetOptimization) &&
        equalsNullable(this.isFlexibleDailyBudgets, campaignUpdateRequest.isFlexibleDailyBudgets) &&
        equalsNullable(this.lifetimeSpendCap, campaignUpdateRequest.lifetimeSpendCap) &&
        Objects.equals(this.name, campaignUpdateRequest.name) &&
        equalsNullable(this.orderLineId, campaignUpdateRequest.orderLineId) &&
        equalsNullable(this.startTime, campaignUpdateRequest.startTime) &&
        Objects.equals(this.status, campaignUpdateRequest.status) &&
        equalsNullable(this.trackingUrls, campaignUpdateRequest.trackingUrls);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(bidOptions), intendedPromotionType, isLtvOptimized, isPerformancePlus, isTopOfSearch, hashCodeNullable(objectiveType), adAccountId, hashCodeNullable(dailySpendCap), hashCodeNullable(defaultAdGroupBudgetInMicroCurrency), hashCodeNullable(endTime), id, hashCodeNullable(isAutomatedCampaign), hashCodeNullable(isCampaignBudgetOptimization), hashCodeNullable(isFlexibleDailyBudgets), hashCodeNullable(lifetimeSpendCap), name, hashCodeNullable(orderLineId), hashCodeNullable(startTime), status, hashCodeNullable(trackingUrls));
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
    sb.append("class CampaignUpdateRequest {\n");
    sb.append("    bidOptions: ").append(toIndentedString(bidOptions)).append("\n");
    sb.append("    intendedPromotionType: ").append(toIndentedString(intendedPromotionType)).append("\n");
    sb.append("    isLtvOptimized: ").append(toIndentedString(isLtvOptimized)).append("\n");
    sb.append("    isPerformancePlus: ").append(toIndentedString(isPerformancePlus)).append("\n");
    sb.append("    isTopOfSearch: ").append(toIndentedString(isTopOfSearch)).append("\n");
    sb.append("    objectiveType: ").append(toIndentedString(objectiveType)).append("\n");
    sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
    sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
    sb.append("    defaultAdGroupBudgetInMicroCurrency: ").append(toIndentedString(defaultAdGroupBudgetInMicroCurrency)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAutomatedCampaign: ").append(toIndentedString(isAutomatedCampaign)).append("\n");
    sb.append("    isCampaignBudgetOptimization: ").append(toIndentedString(isCampaignBudgetOptimization)).append("\n");
    sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
    sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
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

