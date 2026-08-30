package org.openapitools.model;

import org.openapitools.model.AttributionModel;
import org.openapitools.model.AttributionScope;
import org.openapitools.model.Currency;
import org.openapitools.model.MsotEventName;
import java.util.*;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Resource create operation model.
 */
public class ConversionMSOTEventsCreate implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
   */
  @JsonProperty("action_timestamps")
  private List<Long> actionTimestamps = new ArrayList<>();

  /**
   * The ID of the ad group that was attributed to the conversion event.
   */
  @JsonProperty("ad_group_id")
  private String adGroupId;

  /**
   * The attribution model used to attribute the conversion event.
   */
  @JsonProperty("attribution_model")
  private AttributionModel attributionModel;

  /**
   * Ad event type.
   */
  @JsonProperty("attribution_scope")
  private AttributionScope attributionScope;

  /**
   * Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1.
   */
  @JsonProperty("attribution_score")
  private Double attributionScore;

  /**
   * The ID of the campaign that was attributed to the conversion event.
   */
  @JsonProperty("campaign_id")
  private String campaignId;

  /**
   * Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;).
   */
  @JsonProperty("click_window")
  private String clickWindow;

  /**
   * Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard.
   */
  @JsonProperty("currency")
  private Currency currency;

  /**
   * A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
   */
  @JsonProperty("event_id")
  private String eventId;

  /**
   * Type of user event.
   */
  @JsonProperty("event_name")
  private MsotEventName eventName;

  /**
   * The time when the event occurred. Unix timestamp in seconds.
   */
  @JsonProperty("event_timestamp")
  private Long eventTimestamp;

  /**
   * Total number of ad events including other non-Pinterest ad platforms.
   */
  @JsonProperty("total_event_touchpoints")
  private Integer totalEventTouchpoints;

  /**
   * Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
   */
  @JsonProperty("total_events")
  private Integer totalEvents;

  /**
   * Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
   */
  @JsonProperty("total_events_fractional")
  private Double totalEventsFractional;

  /**
   * Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;.
   */
  @JsonProperty("value")
  private Double value;

  /**
   * View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;).
   */
  @JsonProperty("view_window")
  private String viewWindow;

  /**
   * Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
   * @return actionTimestamps
   */
  public List<Long> getActionTimestamps() {
    return actionTimestamps;
  }

  public void setActionTimestamps(List<Long> actionTimestamps) {
    this.actionTimestamps = actionTimestamps;
  }

  /**
   * The ID of the ad group that was attributed to the conversion event.
   * @return adGroupId
   */
  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * The attribution model used to attribute the conversion event.
   * @return attributionModel
   */
  public AttributionModel getAttributionModel() {
    return attributionModel;
  }

  public void setAttributionModel(AttributionModel attributionModel) {
    this.attributionModel = attributionModel;
  }

  /**
   * Ad event type.
   * @return attributionScope
   */
  public AttributionScope getAttributionScope() {
    return attributionScope;
  }

  public void setAttributionScope(AttributionScope attributionScope) {
    this.attributionScope = attributionScope;
  }

  /**
   * Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1.
   * @return attributionScore
   */
  public Double getAttributionScore() {
    return attributionScore;
  }

  public void setAttributionScore(Double attributionScore) {
    this.attributionScore = attributionScore;
  }

  /**
   * The ID of the campaign that was attributed to the conversion event.
   * @return campaignId
   */
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;).
   * @return clickWindow
   */
  public String getClickWindow() {
    return clickWindow;
  }

  public void setClickWindow(String clickWindow) {
    this.clickWindow = clickWindow;
  }

  /**
   * Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard.
   * @return currency
   */
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
   * @return eventId
   */
  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Type of user event.
   * @return eventName
   */
  public MsotEventName getEventName() {
    return eventName;
  }

  public void setEventName(MsotEventName eventName) {
    this.eventName = eventName;
  }

  /**
   * The time when the event occurred. Unix timestamp in seconds.
   * @return eventTimestamp
   */
  public Long getEventTimestamp() {
    return eventTimestamp;
  }

  public void setEventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  /**
   * Total number of ad events including other non-Pinterest ad platforms.
   * @return totalEventTouchpoints
   */
  public Integer getTotalEventTouchpoints() {
    return totalEventTouchpoints;
  }

  public void setTotalEventTouchpoints(Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
  }

  /**
   * Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
   * @return totalEvents
   */
  public Integer getTotalEvents() {
    return totalEvents;
  }

  public void setTotalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
  }

  /**
   * Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
   * @return totalEventsFractional
   */
  public Double getTotalEventsFractional() {
    return totalEventsFractional;
  }

  public void setTotalEventsFractional(Double totalEventsFractional) {
    this.totalEventsFractional = totalEventsFractional;
  }

  /**
   * Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;.
   * @return value
   */
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

  /**
   * View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;).
   * @return viewWindow
   */
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
