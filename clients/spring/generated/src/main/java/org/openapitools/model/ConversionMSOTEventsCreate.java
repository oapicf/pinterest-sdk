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
import org.openapitools.model.AttributionModel;
import org.openapitools.model.AttributionScope;
import org.openapitools.model.Currency;
import org.openapitools.model.MsotEventName;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Resource create operation model.
 */

@Schema(name = "ConversionMSOTEventsCreate", description = "Resource create operation model.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-08-30T10:18:23.383461959Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionMSOTEventsCreate {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<Long> actionTimestamps = new ArrayList<>();

  private String adGroupId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AttributionModel attributionModel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable AttributionScope attributionScope;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Double attributionScore;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String campaignId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String clickWindow;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Currency currency;

  private String eventId;

  private MsotEventName eventName;

  private Long eventTimestamp;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Integer totalEventTouchpoints;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  @Deprecated
  private @Nullable Integer totalEvents;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Double totalEventsFractional;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable Double value;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable String viewWindow;

  public ConversionMSOTEventsCreate() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionMSOTEventsCreate(String adGroupId, String eventId, MsotEventName eventName, Long eventTimestamp) {
    this.adGroupId = adGroupId;
    this.eventId = eventId;
    this.eventName = eventName;
    this.eventTimestamp = eventTimestamp;
  }

  public ConversionMSOTEventsCreate actionTimestamps(List<Long> actionTimestamps) {
    this.actionTimestamps = actionTimestamps;
    return this;
  }

  public ConversionMSOTEventsCreate addActionTimestampsItem(Long actionTimestampsItem) {
    if (this.actionTimestamps == null) {
      this.actionTimestamps = new ArrayList<>();
    }
    this.actionTimestamps.add(actionTimestampsItem);
    return this;
  }

  /**
   * Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
   * @return actionTimestamps
   */
  
  @Schema(name = "action_timestamps", example = "[1451410040]", description = "Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("action_timestamps")
  public List<Long> getActionTimestamps() {
    return actionTimestamps;
  }

  @JsonProperty("action_timestamps")
  public void setActionTimestamps(List<Long> actionTimestamps) {
    this.actionTimestamps = actionTimestamps;
  }

  public ConversionMSOTEventsCreate adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  /**
   * The ID of the ad group that was attributed to the conversion event.
   * @return adGroupId
   */
  @NotNull @Pattern(regexp = "^\\d+$") 
  @Schema(name = "ad_group_id", example = "2680060704746", description = "The ID of the ad group that was attributed to the conversion event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }

  @JsonProperty("ad_group_id")
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ConversionMSOTEventsCreate attributionModel(@Nullable AttributionModel attributionModel) {
    this.attributionModel = attributionModel;
    return this;
  }

  /**
   * The attribution model used to attribute the conversion event.
   * @return attributionModel
   */
  @Valid 
  @Schema(name = "attribution_model", example = "multi_touch", description = "The attribution model used to attribute the conversion event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribution_model")
  public @Nullable AttributionModel getAttributionModel() {
    return attributionModel;
  }

  @JsonProperty("attribution_model")
  public void setAttributionModel(@Nullable AttributionModel attributionModel) {
    this.attributionModel = attributionModel;
  }

  public ConversionMSOTEventsCreate attributionScope(@Nullable AttributionScope attributionScope) {
    this.attributionScope = attributionScope;
    return this;
  }

  /**
   * Ad event type.
   * @return attributionScope
   */
  @Valid 
  @Schema(name = "attribution_scope", example = "click", description = "Ad event type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribution_scope")
  public @Nullable AttributionScope getAttributionScope() {
    return attributionScope;
  }

  @JsonProperty("attribution_scope")
  public void setAttributionScope(@Nullable AttributionScope attributionScope) {
    this.attributionScope = attributionScope;
  }

  public ConversionMSOTEventsCreate attributionScore(@Nullable Double attributionScore) {
    this.attributionScore = attributionScore;
    return this;
  }

  /**
   * Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
   * minimum: 0
   * maximum: 1
   * @return attributionScore
   */
  @DecimalMin(value = "0", inclusive = false) @DecimalMax(value = "1") 
  @Schema(name = "attribution_score", example = "0.5", description = "Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribution_score")
  public @Nullable Double getAttributionScore() {
    return attributionScore;
  }

  @JsonProperty("attribution_score")
  public void setAttributionScore(@Nullable Double attributionScore) {
    this.attributionScore = attributionScore;
  }

  public ConversionMSOTEventsCreate campaignId(@Nullable String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * The ID of the campaign that was attributed to the conversion event.
   * @return campaignId
   */
  @Pattern(regexp = "^\\d+$") 
  @Schema(name = "campaign_id", example = "626736533506", description = "The ID of the campaign that was attributed to the conversion event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("campaign_id")
  public @Nullable String getCampaignId() {
    return campaignId;
  }

  @JsonProperty("campaign_id")
  public void setCampaignId(@Nullable String campaignId) {
    this.campaignId = campaignId;
  }

  public ConversionMSOTEventsCreate clickWindow(@Nullable String clickWindow) {
    this.clickWindow = clickWindow;
    return this;
  }

  /**
   * Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
   * @return clickWindow
   */
  
  @Schema(name = "click_window", description = "Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("click_window")
  public @Nullable String getClickWindow() {
    return clickWindow;
  }

  @JsonProperty("click_window")
  public void setClickWindow(@Nullable String clickWindow) {
    this.clickWindow = clickWindow;
  }

  public ConversionMSOTEventsCreate currency(@Nullable Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
   * @return currency
   */
  @Valid 
  @Schema(name = "currency", description = "Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public @Nullable Currency getCurrency() {
    return currency;
  }

  @JsonProperty("currency")
  public void setCurrency(@Nullable Currency currency) {
    this.currency = currency;
  }

  public ConversionMSOTEventsCreate eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
   * @return eventId
   */
  @NotNull @Size(max = 256) 
  @Schema(name = "event_id", example = "eventId0001", description = "A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }

  @JsonProperty("event_id")
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ConversionMSOTEventsCreate eventName(MsotEventName eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Type of user event.
   * @return eventName
   */
  @NotNull @Valid 
  @Schema(name = "event_name", example = "add_to_cart", description = "Type of user event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_name")
  public MsotEventName getEventName() {
    return eventName;
  }

  @JsonProperty("event_name")
  public void setEventName(MsotEventName eventName) {
    this.eventName = eventName;
  }

  public ConversionMSOTEventsCreate eventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
    return this;
  }

  /**
   * The time when the event occurred. Unix timestamp in seconds.
   * @return eventTimestamp
   */
  @NotNull 
  @Schema(name = "event_timestamp", example = "1451431341", description = "The time when the event occurred. Unix timestamp in seconds.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_timestamp")
  public Long getEventTimestamp() {
    return eventTimestamp;
  }

  @JsonProperty("event_timestamp")
  public void setEventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  public ConversionMSOTEventsCreate totalEventTouchpoints(@Nullable Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
    return this;
  }

  /**
   * Total number of ad events including other non-Pinterest ad platforms.
   * minimum: 1
   * @return totalEventTouchpoints
   */
  @Min(value = 1) 
  @Schema(name = "total_event_touchpoints", example = "2", description = "Total number of ad events including other non-Pinterest ad platforms.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_event_touchpoints")
  public @Nullable Integer getTotalEventTouchpoints() {
    return totalEventTouchpoints;
  }

  @JsonProperty("total_event_touchpoints")
  public void setTotalEventTouchpoints(@Nullable Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
  }

  public ConversionMSOTEventsCreate totalEvents(@Nullable Integer totalEvents) {
    this.totalEvents = totalEvents;
    return this;
  }

  /**
   * Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
   * minimum: 1
   * @return totalEvents
   * @deprecated
   */
  @Min(value = 1) 
  @Schema(name = "total_events", example = "2", description = "Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.", deprecated = true, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @Deprecated
  @JsonProperty("total_events")
  public @Nullable Integer getTotalEvents() {
    return totalEvents;
  }

  /**
   * @deprecated
   */
  @Deprecated
  @JsonProperty("total_events")
  public void setTotalEvents(@Nullable Integer totalEvents) {
    this.totalEvents = totalEvents;
  }

  public ConversionMSOTEventsCreate totalEventsFractional(@Nullable Double totalEventsFractional) {
    this.totalEventsFractional = totalEventsFractional;
    return this;
  }

  /**
   * Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
   * minimum: 0
   * @return totalEventsFractional
   */
  @DecimalMin(value = "0", inclusive = false) 
  @Schema(name = "total_events_fractional", description = "Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_events_fractional")
  public @Nullable Double getTotalEventsFractional() {
    return totalEventsFractional;
  }

  @JsonProperty("total_events_fractional")
  public void setTotalEventsFractional(@Nullable Double totalEventsFractional) {
    this.totalEventsFractional = totalEventsFractional;
  }

  public ConversionMSOTEventsCreate value(@Nullable Double value) {
    this.value = value;
    return this;
  }

  /**
   * Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
   * @return value
   */
  
  @Schema(name = "value", example = "123.45", description = "Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("value")
  public @Nullable Double getValue() {
    return value;
  }

  @JsonProperty("value")
  public void setValue(@Nullable Double value) {
    this.value = value;
  }

  public ConversionMSOTEventsCreate viewWindow(@Nullable String viewWindow) {
    this.viewWindow = viewWindow;
    return this;
  }

  /**
   * View window used for attribution (for example, `1d`, `7d`, `30d`).
   * @return viewWindow
   */
  
  @Schema(name = "view_window", description = "View window used for attribution (for example, `1d`, `7d`, `30d`).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("view_window")
  public @Nullable String getViewWindow() {
    return viewWindow;
  }

  @JsonProperty("view_window")
  public void setViewWindow(@Nullable String viewWindow) {
    this.viewWindow = viewWindow;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionMSOTEventsCreate conversionMSOTEventsCreate = (ConversionMSOTEventsCreate) o;
    return Objects.equals(this.actionTimestamps, conversionMSOTEventsCreate.actionTimestamps) &&
        Objects.equals(this.adGroupId, conversionMSOTEventsCreate.adGroupId) &&
        Objects.equals(this.attributionModel, conversionMSOTEventsCreate.attributionModel) &&
        Objects.equals(this.attributionScope, conversionMSOTEventsCreate.attributionScope) &&
        Objects.equals(this.attributionScore, conversionMSOTEventsCreate.attributionScore) &&
        Objects.equals(this.campaignId, conversionMSOTEventsCreate.campaignId) &&
        Objects.equals(this.clickWindow, conversionMSOTEventsCreate.clickWindow) &&
        Objects.equals(this.currency, conversionMSOTEventsCreate.currency) &&
        Objects.equals(this.eventId, conversionMSOTEventsCreate.eventId) &&
        Objects.equals(this.eventName, conversionMSOTEventsCreate.eventName) &&
        Objects.equals(this.eventTimestamp, conversionMSOTEventsCreate.eventTimestamp) &&
        Objects.equals(this.totalEventTouchpoints, conversionMSOTEventsCreate.totalEventTouchpoints) &&
        Objects.equals(this.totalEvents, conversionMSOTEventsCreate.totalEvents) &&
        Objects.equals(this.totalEventsFractional, conversionMSOTEventsCreate.totalEventsFractional) &&
        Objects.equals(this.value, conversionMSOTEventsCreate.value) &&
        Objects.equals(this.viewWindow, conversionMSOTEventsCreate.viewWindow);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTimestamps, adGroupId, attributionModel, attributionScope, attributionScore, campaignId, clickWindow, currency, eventId, eventName, eventTimestamp, totalEventTouchpoints, totalEvents, totalEventsFractional, value, viewWindow);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionMSOTEventsCreate {\n");
    sb.append("    actionTimestamps: ").append(toIndentedString(actionTimestamps)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    attributionModel: ").append(toIndentedString(attributionModel)).append("\n");
    sb.append("    attributionScope: ").append(toIndentedString(attributionScope)).append("\n");
    sb.append("    attributionScore: ").append(toIndentedString(attributionScore)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    clickWindow: ").append(toIndentedString(clickWindow)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
    sb.append("    totalEventTouchpoints: ").append(toIndentedString(totalEventTouchpoints)).append("\n");
    sb.append("    totalEvents: ").append(toIndentedString(totalEvents)).append("\n");
    sb.append("    totalEventsFractional: ").append(toIndentedString(totalEventsFractional)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    viewWindow: ").append(toIndentedString(viewWindow)).append("\n");
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

