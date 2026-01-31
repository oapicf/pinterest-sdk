package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Object containing the MSOT conversion events.
 */
@ApiModel(description="Object containing the MSOT conversion events.")

public class ConversionMSOTEvents  {
  
 /**
  * Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "[1451410040]", value = "Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.")
  private List<Long> actionTimestamps = new ArrayList<>();

 /**
  * The ID of the ad group that was attributed to the conversion event.
  */
  @ApiModelProperty(example = "2680060704746", required = true, value = "The ID of the ad group that was attributed to the conversion event.")
  private String adGroupId;

public enum AttributionModelEnum {

    @JsonProperty("first_touch") FIRST_TOUCH(String.valueOf("first_touch")),
    @JsonProperty("last_touch") LAST_TOUCH(String.valueOf("last_touch")),
    @JsonProperty("multi_touch") MULTI_TOUCH(String.valueOf("multi_touch"));

    private String value;

    AttributionModelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AttributionModelEnum fromValue(String value) {
        for (AttributionModelEnum b : AttributionModelEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * The attribution model used to attribute the conversion event.
  */
  @ApiModelProperty(example = "multi_touch", value = "The attribution model used to attribute the conversion event.")
  private AttributionModelEnum attributionModel;

public enum AttributionScopeEnum {

    @JsonProperty("view") VIEW(String.valueOf("view")),
    @JsonProperty("engagement") ENGAGEMENT(String.valueOf("engagement")),
    @JsonProperty("click") CLICK(String.valueOf("click"));

    private String value;

    AttributionScopeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static AttributionScopeEnum fromValue(String value) {
        for (AttributionScopeEnum b : AttributionScopeEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Ad event type.
  */
  @ApiModelProperty(example = "click", required = true, value = "Ad event type.")
  private AttributionScopeEnum attributionScope;

 /**
  * Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
  */
  @ApiModelProperty(example = "0.5", value = "Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.")
  private Double attributionScore;

 /**
  * The ID of the campaign that was attributed to the conversion event.
  */
  @ApiModelProperty(example = "626736533506", value = "The ID of the campaign that was attributed to the conversion event.")
  private String campaignId;

  @ApiModelProperty(value = "")
  @Valid
  private Currency currency;

 /**
  * A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
  */
  @ApiModelProperty(example = "eventId0001", required = true, value = "A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.")
  private String eventId;

public enum EventNameEnum {

    @JsonProperty("add_to_cart") ADD_TO_CART(String.valueOf("add_to_cart")),
    @JsonProperty("checkout") CHECKOUT(String.valueOf("checkout")),
    @JsonProperty("lead") LEAD(String.valueOf("lead")),
    @JsonProperty("signup") SIGNUP(String.valueOf("signup"));

    private String value;

    EventNameEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static EventNameEnum fromValue(String value) {
        for (EventNameEnum b : EventNameEnum.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}

 /**
  * Type of user event.
  */
  @ApiModelProperty(example = "add_to_cart", required = true, value = "Type of user event.")
  private EventNameEnum eventName;

 /**
  * The time when the event occurred. Unix timestamp in seconds.
  */
  @ApiModelProperty(example = "1451431341", required = true, value = "The time when the event occurred. Unix timestamp in seconds.")
  private Long eventTimestamp;

 /**
  * Total number of ad events including other non-Pinterest ad platforms.
  */
  @ApiModelProperty(example = "2", value = "Total number of ad events including other non-Pinterest ad platforms.")
  private Integer totalEventTouchpoints;

 /**
  * Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
  */
  @ApiModelProperty(example = "2", value = "Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>")
  private Integer totalEvents;

 /**
  * Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
  */
  @ApiModelProperty(example = "123.45", value = "Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.")
  private Double value;
 /**
  * Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
  * @return actionTimestamps
  */
  @JsonProperty("action_timestamps")
  public List<Long> getActionTimestamps() {
    return actionTimestamps;
  }

  /**
   * Sets the <code>actionTimestamps</code> property.
   */
 public void setActionTimestamps(List<Long> actionTimestamps) {
    this.actionTimestamps = actionTimestamps;
  }

  /**
   * Sets the <code>actionTimestamps</code> property.
   */
  public ConversionMSOTEvents actionTimestamps(List<Long> actionTimestamps) {
    this.actionTimestamps = actionTimestamps;
    return this;
  }

  /**
   * Adds a new item to the <code>actionTimestamps</code> list.
   */
  public ConversionMSOTEvents addActionTimestampsItem(Long actionTimestampsItem) {
    this.actionTimestamps.add(actionTimestampsItem);
    return this;
  }

 /**
  * The ID of the ad group that was attributed to the conversion event.
  * @return adGroupId
  */
  @JsonProperty("ad_group_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdGroupId() {
    return adGroupId;
  }

  /**
   * Sets the <code>adGroupId</code> property.
   */
 public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * Sets the <code>adGroupId</code> property.
   */
  public ConversionMSOTEvents adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

 /**
  * The attribution model used to attribute the conversion event.
  * @return attributionModel
  */
  @JsonProperty("attribution_model")
  public String getAttributionModel() {
    return attributionModel == null ? null : attributionModel.value();
  }

  /**
   * Sets the <code>attributionModel</code> property.
   */
 public void setAttributionModel(AttributionModelEnum attributionModel) {
    this.attributionModel = attributionModel;
  }

  /**
   * Sets the <code>attributionModel</code> property.
   */
  public ConversionMSOTEvents attributionModel(AttributionModelEnum attributionModel) {
    this.attributionModel = attributionModel;
    return this;
  }

 /**
  * Ad event type.
  * @return attributionScope
  */
  @JsonProperty("attribution_scope")
  @NotNull
  public String getAttributionScope() {
    return attributionScope == null ? null : attributionScope.value();
  }

  /**
   * Sets the <code>attributionScope</code> property.
   */
 public void setAttributionScope(AttributionScopeEnum attributionScope) {
    this.attributionScope = attributionScope;
  }

  /**
   * Sets the <code>attributionScope</code> property.
   */
  public ConversionMSOTEvents attributionScope(AttributionScopeEnum attributionScope) {
    this.attributionScope = attributionScope;
    return this;
  }

 /**
  * Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1.
  * minimum: 0
  * maximum: 1
  * @return attributionScore
  */
  @JsonProperty("attribution_score")
 @DecimalMin("0") @DecimalMax("1")  public Double getAttributionScore() {
    return attributionScore;
  }

  /**
   * Sets the <code>attributionScore</code> property.
   */
 public void setAttributionScore(Double attributionScore) {
    this.attributionScore = attributionScore;
  }

  /**
   * Sets the <code>attributionScore</code> property.
   */
  public ConversionMSOTEvents attributionScore(Double attributionScore) {
    this.attributionScore = attributionScore;
    return this;
  }

 /**
  * The ID of the campaign that was attributed to the conversion event.
  * @return campaignId
  */
  @JsonProperty("campaign_id")
 @Pattern(regexp="^\\d+$")  public String getCampaignId() {
    return campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
 public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   * Sets the <code>campaignId</code> property.
   */
  public ConversionMSOTEvents campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
  * Get currency
  * @return currency
  */
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
 public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * Sets the <code>currency</code> property.
   */
  public ConversionMSOTEvents currency(Currency currency) {
    this.currency = currency;
    return this;
  }

 /**
  * A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
  * @return eventId
  */
  @JsonProperty("event_id")
  @NotNull
 @Size(max=256)  public String getEventId() {
    return eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
 public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Sets the <code>eventId</code> property.
   */
  public ConversionMSOTEvents eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
  * Type of user event.
  * @return eventName
  */
  @JsonProperty("event_name")
  @NotNull
  public String getEventName() {
    return eventName == null ? null : eventName.value();
  }

  /**
   * Sets the <code>eventName</code> property.
   */
 public void setEventName(EventNameEnum eventName) {
    this.eventName = eventName;
  }

  /**
   * Sets the <code>eventName</code> property.
   */
  public ConversionMSOTEvents eventName(EventNameEnum eventName) {
    this.eventName = eventName;
    return this;
  }

 /**
  * The time when the event occurred. Unix timestamp in seconds.
  * @return eventTimestamp
  */
  @JsonProperty("event_timestamp")
  @NotNull
  public Long getEventTimestamp() {
    return eventTimestamp;
  }

  /**
   * Sets the <code>eventTimestamp</code> property.
   */
 public void setEventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  /**
   * Sets the <code>eventTimestamp</code> property.
   */
  public ConversionMSOTEvents eventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
    return this;
  }

 /**
  * Total number of ad events including other non-Pinterest ad platforms.
  * minimum: 1
  * @return totalEventTouchpoints
  */
  @JsonProperty("total_event_touchpoints")
 @Min(1)  public Integer getTotalEventTouchpoints() {
    return totalEventTouchpoints;
  }

  /**
   * Sets the <code>totalEventTouchpoints</code> property.
   */
 public void setTotalEventTouchpoints(Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
  }

  /**
   * Sets the <code>totalEventTouchpoints</code> property.
   */
  public ConversionMSOTEvents totalEventTouchpoints(Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
    return this;
  }

 /**
  * Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt;
  * minimum: 1
  * @return totalEvents
  */
  @JsonProperty("total_events")
 @Min(1)  public Integer getTotalEvents() {
    return totalEvents;
  }

  /**
   * Sets the <code>totalEvents</code> property.
   */
 public void setTotalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
  }

  /**
   * Sets the <code>totalEvents</code> property.
   */
  public ConversionMSOTEvents totalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
    return this;
  }

 /**
  * Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;.
  * @return value
  */
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }

  /**
   * Sets the <code>value</code> property.
   */
 public void setValue(Double value) {
    this.value = value;
  }

  /**
   * Sets the <code>value</code> property.
   */
  public ConversionMSOTEvents value(Double value) {
    this.value = value;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

