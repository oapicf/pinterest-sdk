package apimodels;

import apimodels.Currency;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Object containing the MSOT conversion events.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-01-31T04:53:01.455950794Z[Etc/UTC]", comments = "Generator version: 7.18.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionMSOTEvents   {
  @JsonProperty("action_timestamps")
  
  private List<Long> actionTimestamps = null;

  @JsonProperty("ad_group_id")
  @NotNull
@Pattern(regexp="^\\d+$")

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

    @Override
    @JsonValue
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

  @JsonProperty("attribution_model")
  
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

    @Override
    @JsonValue
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

  @JsonProperty("attribution_scope")
  @NotNull

  private AttributionScopeEnum attributionScope;

  @JsonProperty("attribution_score")
  @DecimalMin("0")
@DecimalMax("1")

  private Double attributionScore;

  @JsonProperty("campaign_id")
  @Pattern(regexp="^\\d+$")

  private String campaignId;

  @JsonProperty("currency")
  @Valid

  private Currency currency;

  @JsonProperty("event_id")
  @NotNull
@Size(max=256)

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

    @Override
    @JsonValue
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

  @JsonProperty("event_name")
  @NotNull

  private EventNameEnum eventName;

  @JsonProperty("event_timestamp")
  @NotNull

  private Long eventTimestamp;

  @JsonProperty("total_event_touchpoints")
  @Min(1)

  private Integer totalEventTouchpoints;

  @JsonProperty("total_events")
  @Min(1)

  private Integer totalEvents;

  @JsonProperty("value")
  
  private Double value;

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

