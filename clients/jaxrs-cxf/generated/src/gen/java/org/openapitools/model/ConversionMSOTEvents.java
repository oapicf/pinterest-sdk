package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
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

FIRST_TOUCH(String.valueOf("first_touch")), LAST_TOUCH(String.valueOf("last_touch")), MULTI_TOUCH(String.valueOf("multi_touch"));


    private String value;

    AttributionModelEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
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

 /**
  * The attribution model used to attribute the conversion event.
  */
  @ApiModelProperty(example = "multi_touch", value = "The attribution model used to attribute the conversion event.")

  private AttributionModelEnum attributionModel;

public enum AttributionScopeEnum {

VIEW(String.valueOf("view")), ENGAGEMENT(String.valueOf("engagement")), CLICK(String.valueOf("click"));


    private String value;

    AttributionScopeEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
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

ADD_TO_CART(String.valueOf("add_to_cart")), CHECKOUT(String.valueOf("checkout")), LEAD(String.valueOf("lead")), SIGNUP(String.valueOf("signup"));


    private String value;

    EventNameEnum (String v) {
        value = v;
    }

    public String value() {
        return value;
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
  **/
  @JsonProperty("action_timestamps")
  public List<Long> getActionTimestamps() {
    return actionTimestamps;
  }

  public void setActionTimestamps(List<Long> actionTimestamps) {
    this.actionTimestamps = actionTimestamps;
  }

  public ConversionMSOTEvents actionTimestamps(List<Long> actionTimestamps) {
    this.actionTimestamps = actionTimestamps;
    return this;
  }

  public ConversionMSOTEvents addActionTimestampsItem(Long actionTimestampsItem) {
    this.actionTimestamps.add(actionTimestampsItem);
    return this;
  }

 /**
   * The ID of the ad group that was attributed to the conversion event.
   * @return adGroupId
  **/
  @JsonProperty("ad_group_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdGroupId() {
    return adGroupId;
  }

  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  public ConversionMSOTEvents adGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
    return this;
  }

 /**
   * The attribution model used to attribute the conversion event.
   * @return attributionModel
  **/
  @JsonProperty("attribution_model")
  public String getAttributionModel() {
    if (attributionModel == null) {
      return null;
    }
    return attributionModel.value();
  }

  public void setAttributionModel(AttributionModelEnum attributionModel) {
    this.attributionModel = attributionModel;
  }

  public ConversionMSOTEvents attributionModel(AttributionModelEnum attributionModel) {
    this.attributionModel = attributionModel;
    return this;
  }

 /**
   * Ad event type.
   * @return attributionScope
  **/
  @JsonProperty("attribution_scope")
  @NotNull
  public String getAttributionScope() {
    if (attributionScope == null) {
      return null;
    }
    return attributionScope.value();
  }

  public void setAttributionScope(AttributionScopeEnum attributionScope) {
    this.attributionScope = attributionScope;
  }

  public ConversionMSOTEvents attributionScope(AttributionScopeEnum attributionScope) {
    this.attributionScope = attributionScope;
    return this;
  }

 /**
   * Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1.
   * minimum: 0
   * maximum: 1
   * @return attributionScore
  **/
  @JsonProperty("attribution_score")
 @DecimalMin(value="0",inclusive=false) @DecimalMax("1")  public Double getAttributionScore() {
    return attributionScore;
  }

  public void setAttributionScore(Double attributionScore) {
    this.attributionScore = attributionScore;
  }

  public ConversionMSOTEvents attributionScore(Double attributionScore) {
    this.attributionScore = attributionScore;
    return this;
  }

 /**
   * The ID of the campaign that was attributed to the conversion event.
   * @return campaignId
  **/
  @JsonProperty("campaign_id")
 @Pattern(regexp="^\\d+$")  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  public ConversionMSOTEvents campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

 /**
   * Get currency
   * @return currency
  **/
  @JsonProperty("currency")
  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public ConversionMSOTEvents currency(Currency currency) {
    this.currency = currency;
    return this;
  }

 /**
   * A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
   * @return eventId
  **/
  @JsonProperty("event_id")
  @NotNull
 @Size(max=256)  public String getEventId() {
    return eventId;
  }

  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  public ConversionMSOTEvents eventId(String eventId) {
    this.eventId = eventId;
    return this;
  }

 /**
   * Type of user event.
   * @return eventName
  **/
  @JsonProperty("event_name")
  @NotNull
  public String getEventName() {
    if (eventName == null) {
      return null;
    }
    return eventName.value();
  }

  public void setEventName(EventNameEnum eventName) {
    this.eventName = eventName;
  }

  public ConversionMSOTEvents eventName(EventNameEnum eventName) {
    this.eventName = eventName;
    return this;
  }

 /**
   * The time when the event occurred. Unix timestamp in seconds.
   * @return eventTimestamp
  **/
  @JsonProperty("event_timestamp")
  @NotNull
  public Long getEventTimestamp() {
    return eventTimestamp;
  }

  public void setEventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  public ConversionMSOTEvents eventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
    return this;
  }

 /**
   * Total number of ad events including other non-Pinterest ad platforms.
   * minimum: 1
   * @return totalEventTouchpoints
  **/
  @JsonProperty("total_event_touchpoints")
 @Min(1)  public Integer getTotalEventTouchpoints() {
    return totalEventTouchpoints;
  }

  public void setTotalEventTouchpoints(Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
  }

  public ConversionMSOTEvents totalEventTouchpoints(Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
    return this;
  }

 /**
   * Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt;
   * minimum: 1
   * @return totalEvents
  **/
  @JsonProperty("total_events")
 @Min(1)  public Integer getTotalEvents() {
    return totalEvents;
  }

  public void setTotalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
  }

  public ConversionMSOTEvents totalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
    return this;
  }

 /**
   * Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;.
   * @return value
  **/
  @JsonProperty("value")
  public Double getValue() {
    return value;
  }

  public void setValue(Double value) {
    this.value = value;
  }

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

