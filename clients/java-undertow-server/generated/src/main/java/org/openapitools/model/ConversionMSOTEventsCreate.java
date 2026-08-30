/*
 * Pinterest REST API
 *
 * Pinterest's REST API
 *
 * OpenAPI document version: 5.28.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
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
import org.openapitools.model.AttributionModel;
import org.openapitools.model.AttributionScope;
import org.openapitools.model.Currency;
import org.openapitools.model.MsotEventName;



/**
 * Resource create operation model.
 */

@ApiModel(description = "Resource create operation model.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2026-08-30T09:53:14.631547469Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ConversionMSOTEventsCreate   {
  
  private List<Long> actionTimestamps = new ArrayList<>();
  private String adGroupId;
  private AttributionModel attributionModel;
  private AttributionScope attributionScope;
  private Double attributionScore;
  private String campaignId;
  private String clickWindow;
  private Currency currency;
  private String eventId;
  private MsotEventName eventName;
  private Long eventTimestamp;
  private Integer totalEventTouchpoints;
  private Integer totalEvents;
  private Double totalEventsFractional;
  private Double value;
  private String viewWindow;

  /**
   * Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
   */
  public ConversionMSOTEventsCreate actionTimestamps(List<Long> actionTimestamps) {
    this.actionTimestamps = actionTimestamps;
    return this;
  }

  
  @ApiModelProperty(example = "[1451410040]", value = "Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.")
  @JsonProperty("action_timestamps")
  public List<Long> getActionTimestamps() {
    return actionTimestamps;
  }
  public void setActionTimestamps(List<Long> actionTimestamps) {
    this.actionTimestamps = actionTimestamps;
  }

  /**
   * The ID of the ad group that was attributed to the conversion event.
   */
  public ConversionMSOTEventsCreate adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

  
  @ApiModelProperty(example = "2680060704746", required = true, value = "The ID of the ad group that was attributed to the conversion event.")
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * The attribution model used to attribute the conversion event.
   */
  public ConversionMSOTEventsCreate attributionModel(AttributionModel attributionModel) {
    this.attributionModel = attributionModel;
    return this;
  }

  
  @ApiModelProperty(example = "multi_touch", value = "The attribution model used to attribute the conversion event.")
  @JsonProperty("attribution_model")
  public AttributionModel getAttributionModel() {
    return attributionModel;
  }
  public void setAttributionModel(AttributionModel attributionModel) {
    this.attributionModel = attributionModel;
  }

  /**
   * Ad event type.
   */
  public ConversionMSOTEventsCreate attributionScope(AttributionScope attributionScope) {
    this.attributionScope = attributionScope;
    return this;
  }

  
  @ApiModelProperty(example = "click", value = "Ad event type.")
  @JsonProperty("attribution_scope")
  public AttributionScope getAttributionScope() {
    return attributionScope;
  }
  public void setAttributionScope(AttributionScope attributionScope) {
    this.attributionScope = attributionScope;
  }

  /**
   * Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
   * minimum: 0
   * maximum: 1
   */
  public ConversionMSOTEventsCreate attributionScore(Double attributionScore) {
    this.attributionScore = attributionScore;
    return this;
  }

  
  @ApiModelProperty(example = "0.5", value = "Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.")
  @JsonProperty("attribution_score")
  public Double getAttributionScore() {
    return attributionScore;
  }
  public void setAttributionScore(Double attributionScore) {
    this.attributionScore = attributionScore;
  }

  /**
   * The ID of the campaign that was attributed to the conversion event.
   */
  public ConversionMSOTEventsCreate campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  
  @ApiModelProperty(example = "626736533506", value = "The ID of the campaign that was attributed to the conversion event.")
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
   */
  public ConversionMSOTEventsCreate clickWindow(String clickWindow) {
    this.clickWindow = clickWindow;
    return this;
  }

  
  @ApiModelProperty(value = "Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).")
  @JsonProperty("click_window")
  public String getClickWindow() {
    return clickWindow;
  }
  public void setClickWindow(String clickWindow) {
    this.clickWindow = clickWindow;
  }

  /**
   * Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
   */
  public ConversionMSOTEventsCreate currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  
  @ApiModelProperty(value = "Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.")
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
   */
  public ConversionMSOTEventsCreate eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

  
  @ApiModelProperty(example = "eventId0001", required = true, value = "A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.")
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Type of user event.
   */
  public ConversionMSOTEventsCreate eventName(MsotEventName eventName) {
    this.eventName = eventName;
    return this;
  }

  
  @ApiModelProperty(example = "add_to_cart", required = true, value = "Type of user event.")
  @JsonProperty("event_name")
  public MsotEventName getEventName() {
    return eventName;
  }
  public void setEventName(MsotEventName eventName) {
    this.eventName = eventName;
  }

  /**
   * The time when the event occurred. Unix timestamp in seconds.
   */
  public ConversionMSOTEventsCreate eventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
    return this;
  }

  
  @ApiModelProperty(example = "1451431341", required = true, value = "The time when the event occurred. Unix timestamp in seconds.")
  @JsonProperty("event_timestamp")
  public Long getEventTimestamp() {
    return eventTimestamp;
  }
  public void setEventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  /**
   * Total number of ad events including other non-Pinterest ad platforms.
   * minimum: 1
   */
  public ConversionMSOTEventsCreate totalEventTouchpoints(Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
    return this;
  }

  
  @ApiModelProperty(example = "2", value = "Total number of ad events including other non-Pinterest ad platforms.")
  @JsonProperty("total_event_touchpoints")
  public Integer getTotalEventTouchpoints() {
    return totalEventTouchpoints;
  }
  public void setTotalEventTouchpoints(Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
  }

  /**
   * Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
   * minimum: 1
   */
  public ConversionMSOTEventsCreate totalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
    return this;
  }

  
  @ApiModelProperty(example = "2", value = "Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.")
  @JsonProperty("total_events")
  public Integer getTotalEvents() {
    return totalEvents;
  }
  public void setTotalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
  }

  /**
   * Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
   * minimum: 0
   */
  public ConversionMSOTEventsCreate totalEventsFractional(Double totalEventsFractional) {
    this.totalEventsFractional = totalEventsFractional;
    return this;
  }

  
  @ApiModelProperty(value = "Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).")
  @JsonProperty("total_events_fractional")
  public Double getTotalEventsFractional() {
    return totalEventsFractional;
  }
  public void setTotalEventsFractional(Double totalEventsFractional) {
    this.totalEventsFractional = totalEventsFractional;
  }

  /**
   * Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
   */
  public ConversionMSOTEventsCreate value(Double value) {
    this.value = value;
    return this;
  }

  
  @ApiModelProperty(example = "123.45", value = "Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.")
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * View window used for attribution (for example, `1d`, `7d`, `30d`).
   */
  public ConversionMSOTEventsCreate viewWindow(String viewWindow) {
    this.viewWindow = viewWindow;
    return this;
  }

  
  @ApiModelProperty(value = "View window used for attribution (for example, `1d`, `7d`, `30d`).")
  @JsonProperty("view_window")
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
    return Objects.equals(actionTimestamps, conversionMSOTEventsCreate.actionTimestamps) &&
        Objects.equals(adGroupId, conversionMSOTEventsCreate.adGroupId) &&
        Objects.equals(attributionModel, conversionMSOTEventsCreate.attributionModel) &&
        Objects.equals(attributionScope, conversionMSOTEventsCreate.attributionScope) &&
        Objects.equals(attributionScore, conversionMSOTEventsCreate.attributionScore) &&
        Objects.equals(campaignId, conversionMSOTEventsCreate.campaignId) &&
        Objects.equals(clickWindow, conversionMSOTEventsCreate.clickWindow) &&
        Objects.equals(currency, conversionMSOTEventsCreate.currency) &&
        Objects.equals(eventId, conversionMSOTEventsCreate.eventId) &&
        Objects.equals(eventName, conversionMSOTEventsCreate.eventName) &&
        Objects.equals(eventTimestamp, conversionMSOTEventsCreate.eventTimestamp) &&
        Objects.equals(totalEventTouchpoints, conversionMSOTEventsCreate.totalEventTouchpoints) &&
        Objects.equals(totalEvents, conversionMSOTEventsCreate.totalEvents) &&
        Objects.equals(totalEventsFractional, conversionMSOTEventsCreate.totalEventsFractional) &&
        Objects.equals(value, conversionMSOTEventsCreate.value) &&
        Objects.equals(viewWindow, conversionMSOTEventsCreate.viewWindow);
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

