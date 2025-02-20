/*
 * Pinterest REST API
 * Pinterest's REST API
 *
 * The version of the OpenAPI document: 5.14.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EntityStatus;
import org.openapitools.model.TrackingUrls;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Campaign Data
 */
@JsonPropertyOrder({
  CampaignCommon.JSON_PROPERTY_AD_ACCOUNT_ID,
  CampaignCommon.JSON_PROPERTY_NAME,
  CampaignCommon.JSON_PROPERTY_STATUS,
  CampaignCommon.JSON_PROPERTY_LIFETIME_SPEND_CAP,
  CampaignCommon.JSON_PROPERTY_DAILY_SPEND_CAP,
  CampaignCommon.JSON_PROPERTY_ORDER_LINE_ID,
  CampaignCommon.JSON_PROPERTY_TRACKING_URLS,
  CampaignCommon.JSON_PROPERTY_START_TIME,
  CampaignCommon.JSON_PROPERTY_END_TIME,
  CampaignCommon.JSON_PROPERTY_IS_FLEXIBLE_DAILY_BUDGETS
})
@JsonTypeName("CampaignCommon")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-05T02:02:57.601423453Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CampaignCommon {
    public static final String JSON_PROPERTY_AD_ACCOUNT_ID = "ad_account_id";
    private String adAccountId;

    public static final String JSON_PROPERTY_NAME = "name";
    private String name;

    public static final String JSON_PROPERTY_STATUS = "status";
    private EntityStatus status;

    public static final String JSON_PROPERTY_LIFETIME_SPEND_CAP = "lifetime_spend_cap";
    private Integer lifetimeSpendCap;

    public static final String JSON_PROPERTY_DAILY_SPEND_CAP = "daily_spend_cap";
    private Integer dailySpendCap;

    public static final String JSON_PROPERTY_ORDER_LINE_ID = "order_line_id";
    private String orderLineId;

    public static final String JSON_PROPERTY_TRACKING_URLS = "tracking_urls";
    private TrackingUrls trackingUrls;

    public static final String JSON_PROPERTY_START_TIME = "start_time";
    private Integer startTime;

    public static final String JSON_PROPERTY_END_TIME = "end_time";
    private Integer endTime;

    public static final String JSON_PROPERTY_IS_FLEXIBLE_DAILY_BUDGETS = "is_flexible_daily_budgets";
    private Boolean isFlexibleDailyBudgets;

    public CampaignCommon() {
    }

    public CampaignCommon adAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
        return this;
    }

    /**
     * Campaign&#39;s Advertiser ID. If you want to create a campaign in a Business Account shared account you need to specify the Business Access advertiser ID in both the query path param as well as the request body schema.
     * @return adAccountId
     */
    @Nullable
    @Pattern(regexp="^\\d+$")
    @JsonProperty(JSON_PROPERTY_AD_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getAdAccountId() {
        return adAccountId;
    }

    @JsonProperty(JSON_PROPERTY_AD_ACCOUNT_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAdAccountId(String adAccountId) {
        this.adAccountId = adAccountId;
    }

    public CampaignCommon name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Campaign name.
     * @return name
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getName() {
        return name;
    }

    @JsonProperty(JSON_PROPERTY_NAME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setName(String name) {
        this.name = name;
    }

    public CampaignCommon status(EntityStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public EntityStatus getStatus() {
        return status;
    }

    @JsonProperty(JSON_PROPERTY_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStatus(EntityStatus status) {
        this.status = status;
    }

    public CampaignCommon lifetimeSpendCap(Integer lifetimeSpendCap) {
        this.lifetimeSpendCap = lifetimeSpendCap;
        return this;
    }

    /**
     * Campaign total spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;daily_spend_cap\&quot; cannot be set at the same time.
     * @return lifetimeSpendCap
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_LIFETIME_SPEND_CAP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getLifetimeSpendCap() {
        return lifetimeSpendCap;
    }

    @JsonProperty(JSON_PROPERTY_LIFETIME_SPEND_CAP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setLifetimeSpendCap(Integer lifetimeSpendCap) {
        this.lifetimeSpendCap = lifetimeSpendCap;
    }

    public CampaignCommon dailySpendCap(Integer dailySpendCap) {
        this.dailySpendCap = dailySpendCap;
        return this;
    }

    /**
     * Campaign daily spending cap. Required for Campaign Budget Optimization (CBO) campaigns. This and \&quot;lifetime_spend_cap\&quot; cannot be set at the same time.
     * @return dailySpendCap
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_DAILY_SPEND_CAP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getDailySpendCap() {
        return dailySpendCap;
    }

    @JsonProperty(JSON_PROPERTY_DAILY_SPEND_CAP)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setDailySpendCap(Integer dailySpendCap) {
        this.dailySpendCap = dailySpendCap;
    }

    public CampaignCommon orderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
        return this;
    }

    /**
     * Order line ID that appears on the invoice.
     * @return orderLineId
     */
    @Nullable
    @Pattern(regexp="^\\d+$")
    @JsonProperty(JSON_PROPERTY_ORDER_LINE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getOrderLineId() {
        return orderLineId;
    }

    @JsonProperty(JSON_PROPERTY_ORDER_LINE_ID)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setOrderLineId(String orderLineId) {
        this.orderLineId = orderLineId;
    }

    public CampaignCommon trackingUrls(TrackingUrls trackingUrls) {
        this.trackingUrls = trackingUrls;
        return this;
    }

    /**
     * Get trackingUrls
     * @return trackingUrls
     */
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_TRACKING_URLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public TrackingUrls getTrackingUrls() {
        return trackingUrls;
    }

    @JsonProperty(JSON_PROPERTY_TRACKING_URLS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setTrackingUrls(TrackingUrls trackingUrls) {
        this.trackingUrls = trackingUrls;
    }

    public CampaignCommon startTime(Integer startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Campaign start time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     * @return startTime
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getStartTime() {
        return startTime;
    }

    @JsonProperty(JSON_PROPERTY_START_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setStartTime(Integer startTime) {
        this.startTime = startTime;
    }

    public CampaignCommon endTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Campaign end time. Unix timestamp in seconds. Only used for Campaign Budget Optimization (CBO) campaigns.
     * @return endTime
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_END_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getEndTime() {
        return endTime;
    }

    @JsonProperty(JSON_PROPERTY_END_TIME)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public CampaignCommon isFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
        this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
        return this;
    }

    /**
     * Determine if a campaign has flexible daily budgets setup.
     * @return isFlexibleDailyBudgets
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_IS_FLEXIBLE_DAILY_BUDGETS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getIsFlexibleDailyBudgets() {
        return isFlexibleDailyBudgets;
    }

    @JsonProperty(JSON_PROPERTY_IS_FLEXIBLE_DAILY_BUDGETS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setIsFlexibleDailyBudgets(Boolean isFlexibleDailyBudgets) {
        this.isFlexibleDailyBudgets = isFlexibleDailyBudgets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CampaignCommon campaignCommon = (CampaignCommon) o;
        return Objects.equals(this.adAccountId, campaignCommon.adAccountId) &&
            Objects.equals(this.name, campaignCommon.name) &&
            Objects.equals(this.status, campaignCommon.status) &&
            Objects.equals(this.lifetimeSpendCap, campaignCommon.lifetimeSpendCap) &&
            Objects.equals(this.dailySpendCap, campaignCommon.dailySpendCap) &&
            Objects.equals(this.orderLineId, campaignCommon.orderLineId) &&
            Objects.equals(this.trackingUrls, campaignCommon.trackingUrls) &&
            Objects.equals(this.startTime, campaignCommon.startTime) &&
            Objects.equals(this.endTime, campaignCommon.endTime) &&
            Objects.equals(this.isFlexibleDailyBudgets, campaignCommon.isFlexibleDailyBudgets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adAccountId, name, status, lifetimeSpendCap, dailySpendCap, orderLineId, trackingUrls, startTime, endTime, isFlexibleDailyBudgets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignCommon {\n");
        sb.append("    adAccountId: ").append(toIndentedString(adAccountId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lifetimeSpendCap: ").append(toIndentedString(lifetimeSpendCap)).append("\n");
        sb.append("    dailySpendCap: ").append(toIndentedString(dailySpendCap)).append("\n");
        sb.append("    orderLineId: ").append(toIndentedString(orderLineId)).append("\n");
        sb.append("    trackingUrls: ").append(toIndentedString(trackingUrls)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    isFlexibleDailyBudgets: ").append(toIndentedString(isFlexibleDailyBudgets)).append("\n");
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

