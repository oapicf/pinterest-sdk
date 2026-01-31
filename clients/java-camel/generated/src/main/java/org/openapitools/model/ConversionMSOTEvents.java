package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Currency;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Object containing the MSOT conversion events.
 */

@Schema(name = "ConversionMSOTEvents", description = "Object containing the MSOT conversion events.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-01-31T04:53:41.522099385Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionMSOTEvents {

  @Valid
  private List<Long> actionTimestamps = new ArrayList<>();

  private String adGroupId;

  /**
   * The attribution model used to attribute the conversion event.
   */
  public enum AttributionModelEnum {
    FIRST_TOUCH("first_touch"),
    
    LAST_TOUCH("last_touch"),
    
    MULTI_TOUCH("multi_touch");

    private final String value;

    AttributionModelEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AttributionModelEnum fromValue(String value) {
      for (AttributionModelEnum b : AttributionModelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AttributionModelEnum attributionModel;

  /**
   * Ad event type.
   */
  public enum AttributionScopeEnum {
    VIEW("view"),
    
    ENGAGEMENT("engagement"),
    
    CLICK("click");

    private final String value;

    AttributionScopeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AttributionScopeEnum fromValue(String value) {
      for (AttributionScopeEnum b : AttributionScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private AttributionScopeEnum attributionScope;

  private Double attributionScore;

  private String campaignId;

  private Currency currency;

  private String eventId;

  /**
   * Type of user event.
   */
  public enum EventNameEnum {
    ADD_TO_CART("add_to_cart"),
    
    CHECKOUT("checkout"),
    
    LEAD("lead"),
    
    SIGNUP("signup");

    private final String value;

    EventNameEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventNameEnum fromValue(String value) {
      for (EventNameEnum b : EventNameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private EventNameEnum eventName;

  private Long eventTimestamp;

  private Integer totalEventTouchpoints;

  private Integer totalEvents;

  private Double value;

  public ConversionMSOTEvents() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ConversionMSOTEvents(String adGroupId, AttributionScopeEnum attributionScope, String eventId, EventNameEnum eventName, Long eventTimestamp) {
    this.adGroupId = adGroupId;
    this.attributionScope = attributionScope;
    this.eventId = eventId;
    this.eventName = eventName;
    this.eventTimestamp = eventTimestamp;
  }

  public ConversionMSOTEvents actionTimestamps(List<Long> actionTimestamps) {
    this.actionTimestamps = actionTimestamps;
    return this;
  }

  public ConversionMSOTEvents addActionTimestampsItem(Long actionTimestampsItem) {
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

  public void setActionTimestamps(List<Long> actionTimestamps) {
    this.actionTimestamps = actionTimestamps;
  }

  public ConversionMSOTEvents adGroupId(String adGroupId) {
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

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ConversionMSOTEvents attributionModel(AttributionModelEnum attributionModel) {
    this.attributionModel = attributionModel;
    return this;
  }

  /**
   * The attribution model used to attribute the conversion event.
   * @return attributionModel
   */
  
  @Schema(name = "attribution_model", example = "multi_touch", description = "The attribution model used to attribute the conversion event.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("attribution_model")
  public AttributionModelEnum getAttributionModel() {
    return attributionModel;
  }

  public void setAttributionModel(AttributionModelEnum attributionModel) {
    this.attributionModel = attributionModel;
  }

  public ConversionMSOTEvents attributionScope(AttributionScopeEnum attributionScope) {
    this.attributionScope = attributionScope;
    return this;
  }

  /**
   * Ad event type.
   * @return attributionScope
   */
  @NotNull 
  @Schema(name = "attribution_scope", example = "click", description = "Ad event type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("attribution_scope")
  public AttributionScopeEnum getAttributionScope() {
    return attributionScope;
  }

  public void setAttributionScope(AttributionScopeEnum attributionScope) {
    this.attributionScope = attributionScope;
  }

  public ConversionMSOTEvents attributionScore(Double attributionScore) {
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
  public Double getAttributionScore() {
    return attributionScore;
  }

  public void setAttributionScore(Double attributionScore) {
    this.attributionScore = attributionScore;
  }

  public ConversionMSOTEvents campaignId(String campaignId) {
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
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public ConversionMSOTEvents currency(Currency currency) {
    this.currency = currency;
    return this;
  }

  /**
   * Get currency
   * @return currency
   */
  @Valid 
  @Schema(name = "currency", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public ConversionMSOTEvents eventId(String eventId) {
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

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ConversionMSOTEvents eventName(EventNameEnum eventName) {
    this.eventName = eventName;
    return this;
  }

  /**
   * Type of user event.
   * @return eventName
   */
  @NotNull 
  @Schema(name = "event_name", example = "add_to_cart", description = "Type of user event.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("event_name")
  public EventNameEnum getEventName() {
    return eventName;
  }

  public void setEventName(EventNameEnum eventName) {
    this.eventName = eventName;
  }

  public ConversionMSOTEvents eventTimestamp(Long eventTimestamp) {
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

  public void setEventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  public ConversionMSOTEvents totalEventTouchpoints(Integer totalEventTouchpoints) {
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
  public Integer getTotalEventTouchpoints() {
    return totalEventTouchpoints;
  }

  public void setTotalEventTouchpoints(Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
  }

  public ConversionMSOTEvents totalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
    return this;
  }

  /**
   * Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
   * minimum: 1
   * @return totalEvents
   */
  @Min(value = 1) 
  @Schema(name = "total_events", example = "2", description = "Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("total_events")
  public Integer getTotalEvents() {
    return totalEvents;
  }

  public void setTotalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
  }

  public ConversionMSOTEvents value(Double value) {
    this.value = value;
    return this;
  }

  /**
   * Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
   * @return value
   */
  
  @Schema(name = "value", example = "123.45", description = "Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
    return Objects.equals(this.actionTimestamps, conversionMSOTEvents.actionTimestamps) &&
        Objects.equals(this.adGroupId, conversionMSOTEvents.adGroupId) &&
        Objects.equals(this.attributionModel, conversionMSOTEvents.attributionModel) &&
        Objects.equals(this.attributionScope, conversionMSOTEvents.attributionScope) &&
        Objects.equals(this.attributionScore, conversionMSOTEvents.attributionScore) &&
        Objects.equals(this.campaignId, conversionMSOTEvents.campaignId) &&
        Objects.equals(this.currency, conversionMSOTEvents.currency) &&
        Objects.equals(this.eventId, conversionMSOTEvents.eventId) &&
        Objects.equals(this.eventName, conversionMSOTEvents.eventName) &&
        Objects.equals(this.eventTimestamp, conversionMSOTEvents.eventTimestamp) &&
        Objects.equals(this.totalEventTouchpoints, conversionMSOTEvents.totalEventTouchpoints) &&
        Objects.equals(this.totalEvents, conversionMSOTEvents.totalEvents) &&
        Objects.equals(this.value, conversionMSOTEvents.value);
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

