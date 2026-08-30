package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.AttributionModel;
import org.openapitools.vertxweb.server.model.AttributionScope;
import org.openapitools.vertxweb.server.model.Currency;
import org.openapitools.vertxweb.server.model.MsotEventName;

/**
 * Resource create operation model.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
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

  public ConversionMSOTEventsCreate () {

  }

  public ConversionMSOTEventsCreate (List<Long> actionTimestamps, String adGroupId, AttributionModel attributionModel, AttributionScope attributionScope, Double attributionScore, String campaignId, String clickWindow, Currency currency, String eventId, MsotEventName eventName, Long eventTimestamp, Integer totalEventTouchpoints, Integer totalEvents, Double totalEventsFractional, Double value, String viewWindow) {
    this.actionTimestamps = actionTimestamps;
    this.adGroupId = adGroupId;
    this.attributionModel = attributionModel;
    this.attributionScope = attributionScope;
    this.attributionScore = attributionScore;
    this.campaignId = campaignId;
    this.clickWindow = clickWindow;
    this.currency = currency;
    this.eventId = eventId;
    this.eventName = eventName;
    this.eventTimestamp = eventTimestamp;
    this.totalEventTouchpoints = totalEventTouchpoints;
    this.totalEvents = totalEvents;
    this.totalEventsFractional = totalEventsFractional;
    this.value = value;
    this.viewWindow = viewWindow;
  }

    
  @JsonProperty("action_timestamps")
  public List<Long> getActionTimestamps() {
    return actionTimestamps;
  }
  public void setActionTimestamps(List<Long> actionTimestamps) {
    this.actionTimestamps = actionTimestamps;
  }

    
  @JsonProperty("ad_group_id")
  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

    
  @JsonProperty("attribution_model")
  public AttributionModel getAttributionModel() {
    return attributionModel;
  }
  public void setAttributionModel(AttributionModel attributionModel) {
    this.attributionModel = attributionModel;
  }

    
  @JsonProperty("attribution_scope")
  public AttributionScope getAttributionScope() {
    return attributionScope;
  }
  public void setAttributionScope(AttributionScope attributionScope) {
    this.attributionScope = attributionScope;
  }

    
  @JsonProperty("attribution_score")
  public Double getAttributionScore() {
    return attributionScore;
  }
  public void setAttributionScore(Double attributionScore) {
    this.attributionScore = attributionScore;
  }

    
  @JsonProperty("campaign_id")
  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

    
  @JsonProperty("click_window")
  public String getClickWindow() {
    return clickWindow;
  }
  public void setClickWindow(String clickWindow) {
    this.clickWindow = clickWindow;
  }

    
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

    
  @JsonProperty("event_id")
  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

    
  @JsonProperty("event_name")
  public MsotEventName getEventName() {
    return eventName;
  }
  public void setEventName(MsotEventName eventName) {
    this.eventName = eventName;
  }

    
  @JsonProperty("event_timestamp")
  public Long getEventTimestamp() {
    return eventTimestamp;
  }
  public void setEventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

    
  @JsonProperty("total_event_touchpoints")
  public Integer getTotalEventTouchpoints() {
    return totalEventTouchpoints;
  }
  public void setTotalEventTouchpoints(Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
  }

    
  @JsonProperty("total_events")
  public Integer getTotalEvents() {
    return totalEvents;
  }
  public void setTotalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
  }

    
  @JsonProperty("total_events_fractional")
  public Double getTotalEventsFractional() {
    return totalEventsFractional;
  }
  public void setTotalEventsFractional(Double totalEventsFractional) {
    this.totalEventsFractional = totalEventsFractional;
  }

    
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }

    
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
