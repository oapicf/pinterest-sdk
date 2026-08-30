package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AttributionModel;
import com.prokarma.pkmst.model.AttributionScope;
import com.prokarma.pkmst.model.Currency;
import com.prokarma.pkmst.model.MsotEventName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Resource create operation model.
 */
@ApiModel(description = "Resource create operation model.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-08-30T09:52:55.641133752Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionMSOTEventsCreate   {
  @JsonProperty("action_timestamps")
  
  private List<Long> actionTimestamps = null;

  @JsonProperty("ad_group_id")
  private String adGroupId;

  @JsonProperty("attribution_model")
  private AttributionModel attributionModel;

  @JsonProperty("attribution_scope")
  private AttributionScope attributionScope;

  @JsonProperty("attribution_score")
  private Double attributionScore;

  @JsonProperty("campaign_id")
  private String campaignId;

  @JsonProperty("click_window")
  private String clickWindow;

  @JsonProperty("currency")
  private Currency currency;

  @JsonProperty("event_id")
  private String eventId;

  @JsonProperty("event_name")
  private MsotEventName eventName;

  @JsonProperty("event_timestamp")
  private Long eventTimestamp;

  @JsonProperty("total_event_touchpoints")
  private Integer totalEventTouchpoints;

  @JsonProperty("total_events")
  private Integer totalEvents;

  @JsonProperty("total_events_fractional")
  private Double totalEventsFractional;

  @JsonProperty("value")
  private Double value;

  @JsonProperty("view_window")
  private String viewWindow;

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
  @ApiModelProperty(example = "[1451410040]", value = "Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.")
  public List<Long> getActionTimestamps() {
    return actionTimestamps;
  }

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
  @ApiModelProperty(example = "2680060704746", required = true, value = "The ID of the ad group that was attributed to the conversion event.")
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ConversionMSOTEventsCreate attributionModel(AttributionModel attributionModel) {
    this.attributionModel = attributionModel;
    return this;
  }

  /**
   * The attribution model used to attribute the conversion event.
   * @return attributionModel
   */
  @ApiModelProperty(example = "multi_touch", value = "The attribution model used to attribute the conversion event.")
  public AttributionModel getAttributionModel() {
    return attributionModel;
  }

  public void setAttributionModel(AttributionModel attributionModel) {
    this.attributionModel = attributionModel;
  }

  public ConversionMSOTEventsCreate attributionScope(AttributionScope attributionScope) {
    this.attributionScope = attributionScope;
    return this;
  }

  /**
   * Ad event type.
   * @return attributionScope
   */
  @ApiModelProperty(example = "click", value = "Ad event type.")
  public AttributionScope getAttributionScope() {
    return attributionScope;
  }

  public void setAttributionScope(AttributionScope attributionScope) {
    this.attributionScope = attributionScope;
  }

  public ConversionMSOTEventsCreate attributionScore(Double attributionScore) {
    this.attributionScore = attributionScore;
    return this;
  }

  /**
   * Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
   * minimum: 0
   * maximum: 1
   * @return attributionScore
   */
  @ApiModelProperty(example = "0.5", value = "Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.")
  public Double getAttributionScore() {
    return attributionScore;
  }

  public void setAttributionScore(Double attributionScore) {
    this.attributionScore = attributionScore;
  }

  public ConversionMSOTEventsCreate campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * The ID of the campaign that was attributed to the conversion event.
   * @return campaignId
   */
  @ApiModelProperty(example = "626736533506", value = "The ID of the campaign that was attributed to the conversion event.")
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public ConversionMSOTEventsCreate clickWindow(String clickWindow) {
    this.clickWindow = clickWindow;
    return this;
  }

  /**
   * Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
   * @return clickWindow
   */
  @ApiModelProperty(value = "Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).")
  public String getClickWindow() {
    return clickWindow;
  }

  public void setClickWindow(String clickWindow) {
    this.clickWindow = clickWindow;
  }

  public ConversionMSOTEventsCreate currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
   * @return currency
   */
  @ApiModelProperty(value = "Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
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
  @ApiModelProperty(example = "eventId0001", required = true, value = "A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.")
  public String getEventId() {
    return eventId;
  }

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
  @ApiModelProperty(example = "add_to_cart", required = true, value = "Type of user event.")
  public MsotEventName getEventName() {
    return eventName;
  }

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
  @ApiModelProperty(example = "1451431341", required = true, value = "The time when the event occurred. Unix timestamp in seconds.")
  public Long getEventTimestamp() {
    return eventTimestamp;
  }

  public void setEventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  public ConversionMSOTEventsCreate totalEventTouchpoints(Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
    return this;
  }

  /**
   * Total number of ad events including other non-Pinterest ad platforms.
   * minimum: 1
   * @return totalEventTouchpoints
   */
  @ApiModelProperty(example = "2", value = "Total number of ad events including other non-Pinterest ad platforms.")
  public Integer getTotalEventTouchpoints() {
    return totalEventTouchpoints;
  }

  public void setTotalEventTouchpoints(Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
  }

  public ConversionMSOTEventsCreate totalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
    return this;
  }

  /**
   * Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
   * minimum: 1
   * @return totalEvents
   */
  @ApiModelProperty(example = "2", value = "Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.")
  public Integer getTotalEvents() {
    return totalEvents;
  }

  public void setTotalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
  }

  public ConversionMSOTEventsCreate totalEventsFractional(Double totalEventsFractional) {
    this.totalEventsFractional = totalEventsFractional;
    return this;
  }

  /**
   * Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
   * minimum: 0
   * @return totalEventsFractional
   */
  @ApiModelProperty(value = "Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).")
  public Double getTotalEventsFractional() {
    return totalEventsFractional;
  }

  public void setTotalEventsFractional(Double totalEventsFractional) {
    this.totalEventsFractional = totalEventsFractional;
  }

  public ConversionMSOTEventsCreate value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
   * @return value
   */
  @ApiModelProperty(example = "123.45", value = "Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  public ConversionMSOTEventsCreate viewWindow(String viewWindow) {
    this.viewWindow = viewWindow;
    return this;
  }

  /**
   * View window used for attribution (for example, `1d`, `7d`, `30d`).
   * @return viewWindow
   */
  @ApiModelProperty(value = "View window used for attribution (for example, `1d`, `7d`, `30d`).")
  public String getViewWindow() {
    return viewWindow;
  }

  public void setViewWindow(String viewWindow) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

