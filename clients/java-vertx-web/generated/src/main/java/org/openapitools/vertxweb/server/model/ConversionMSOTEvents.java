package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.Currency;

/**
 * Object containing the MSOT conversion events.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ConversionMSOTEvents   {
  
  private List<Long> actionTimestamps = new ArrayList<>();
  private String adGroupId;


  public enum AttributionModelEnum {
    FIRST_TOUCH("first_touch"),
    LAST_TOUCH("last_touch"),
    MULTI_TOUCH("multi_touch");

    private String value;

    AttributionModelEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private AttributionModelEnum attributionModel;


  public enum AttributionScopeEnum {
    VIEW("view"),
    ENGAGEMENT("engagement"),
    CLICK("click");

    private String value;

    AttributionScopeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private AttributionScopeEnum attributionScope;
  private Double attributionScore;
  private String campaignId;
  private Currency currency;
  private String eventId;


  public enum EventNameEnum {
    ADD_TO_CART("add_to_cart"),
    CHECKOUT("checkout"),
    LEAD("lead"),
    SIGNUP("signup");

    private String value;

    EventNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return value;
    }
  }

  private EventNameEnum eventName;
  private Long eventTimestamp;
  private Integer totalEventTouchpoints;
  private Integer totalEvents;
  private Double value;

  public ConversionMSOTEvents () {

  }

  public ConversionMSOTEvents (List<Long> actionTimestamps, String adGroupId, AttributionModelEnum attributionModel, AttributionScopeEnum attributionScope, Double attributionScore, String campaignId, Currency currency, String eventId, EventNameEnum eventName, Long eventTimestamp, Integer totalEventTouchpoints, Integer totalEvents, Double value) {
    this.actionTimestamps = actionTimestamps;
    this.adGroupId = adGroupId;
    this.attributionModel = attributionModel;
    this.attributionScope = attributionScope;
    this.attributionScore = attributionScore;
    this.campaignId = campaignId;
    this.currency = currency;
    this.eventId = eventId;
    this.eventName = eventName;
    this.eventTimestamp = eventTimestamp;
    this.totalEventTouchpoints = totalEventTouchpoints;
    this.totalEvents = totalEvents;
    this.value = value;
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
  public AttributionModelEnum getAttributionModel() {
    return attributionModel;
  }
  public void setAttributionModel(AttributionModelEnum attributionModel) {
    this.attributionModel = attributionModel;
  }

    
  @JsonProperty("attribution_scope")
  public AttributionScopeEnum getAttributionScope() {
    return attributionScope;
  }
  public void setAttributionScope(AttributionScopeEnum attributionScope) {
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
  public EventNameEnum getEventName() {
    return eventName;
  }
  public void setEventName(EventNameEnum eventName) {
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

    
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }
  public void setValue(Double value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversionMSOTEvents conversionMSOTEvents = (ConversionMSOTEvents) o;
    return Objects.equals(actionTimestamps, conversionMSOTEvents.actionTimestamps) &&
        Objects.equals(adGroupId, conversionMSOTEvents.adGroupId) &&
        Objects.equals(attributionModel, conversionMSOTEvents.attributionModel) &&
        Objects.equals(attributionScope, conversionMSOTEvents.attributionScope) &&
        Objects.equals(attributionScore, conversionMSOTEvents.attributionScore) &&
        Objects.equals(campaignId, conversionMSOTEvents.campaignId) &&
        Objects.equals(currency, conversionMSOTEvents.currency) &&
        Objects.equals(eventId, conversionMSOTEvents.eventId) &&
        Objects.equals(eventName, conversionMSOTEvents.eventName) &&
        Objects.equals(eventTimestamp, conversionMSOTEvents.eventTimestamp) &&
        Objects.equals(totalEventTouchpoints, conversionMSOTEvents.totalEventTouchpoints) &&
        Objects.equals(totalEvents, conversionMSOTEvents.totalEvents) &&
        Objects.equals(value, conversionMSOTEvents.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTimestamps, adGroupId, attributionModel, attributionScope, attributionScore, campaignId, currency, eventId, eventName, eventTimestamp, totalEventTouchpoints, totalEvents, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversionMSOTEvents {\n");
    
    sb.append("    actionTimestamps: ").append(toIndentedString(actionTimestamps)).append("\n");
    sb.append("    adGroupId: ").append(toIndentedString(adGroupId)).append("\n");
    sb.append("    attributionModel: ").append(toIndentedString(attributionModel)).append("\n");
    sb.append("    attributionScope: ").append(toIndentedString(attributionScope)).append("\n");
    sb.append("    attributionScore: ").append(toIndentedString(attributionScore)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventName: ").append(toIndentedString(eventName)).append("\n");
    sb.append("    eventTimestamp: ").append(toIndentedString(eventTimestamp)).append("\n");
    sb.append("    totalEventTouchpoints: ").append(toIndentedString(totalEventTouchpoints)).append("\n");
    sb.append("    totalEvents: ").append(toIndentedString(totalEvents)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
