package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Currency;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Object containing the MSOT conversion events.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-01-31T04:54:58.059572557Z[Etc/UTC]", comments = "Generator version: 7.18.0")
public class ConversionMSOTEvents   {
  
  private List<Long> actionTimestamps = new ArrayList<>();
  private String adGroupId;

  /**
   * The attribution model used to attribute the conversion event.
   */
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
      return String.valueOf(value);
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
    private String value;

    AttributionScopeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
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
    private String value;

    EventNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private EventNameEnum eventName;
  private Long eventTimestamp;
  private Integer totalEventTouchpoints;
  private Integer totalEvents;
  private Double value;

  /**
   * Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
   **/
  
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
   **/
  
  @ApiModelProperty(example = "2680060704746", required = true, value = "The ID of the ad group that was attributed to the conversion event.")
  @JsonProperty("ad_group_id")
  @NotNull
 @Pattern(regexp="^\\d+$")  public String getAdGroupId() {
    return adGroupId;
  }
  public void setAdGroupId(String adGroupId) {
    this.adGroupId = adGroupId;
  }

  /**
   * The attribution model used to attribute the conversion event.
   **/
  
  @ApiModelProperty(example = "multi_touch", value = "The attribution model used to attribute the conversion event.")
  @JsonProperty("attribution_model")
  public AttributionModelEnum getAttributionModel() {
    return attributionModel;
  }
  public void setAttributionModel(AttributionModelEnum attributionModel) {
    this.attributionModel = attributionModel;
  }

  /**
   * Ad event type.
   **/
  
  @ApiModelProperty(example = "click", required = true, value = "Ad event type.")
  @JsonProperty("attribution_scope")
  @NotNull
  public AttributionScopeEnum getAttributionScope() {
    return attributionScope;
  }
  public void setAttributionScope(AttributionScopeEnum attributionScope) {
    this.attributionScope = attributionScope;
  }

  /**
   * Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1.
   * minimum: 0
   * maximum: 1
   **/
  
  @ApiModelProperty(example = "0.5", value = "Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.")
  @JsonProperty("attribution_score")
 @DecimalMin(value="0",inclusive=false) @DecimalMax("1")  public Double getAttributionScore() {
    return attributionScore;
  }
  public void setAttributionScore(Double attributionScore) {
    this.attributionScore = attributionScore;
  }

  /**
   * The ID of the campaign that was attributed to the conversion event.
   **/
  
  @ApiModelProperty(example = "626736533506", value = "The ID of the campaign that was attributed to the conversion event.")
  @JsonProperty("campaign_id")
 @Pattern(regexp="^\\d+$")  public String getCampaignId() {
    return campaignId;
  }
  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("currency")
  @Valid
  public Currency getCurrency() {
    return currency;
  }
  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  /**
   * A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
   **/
  
  @ApiModelProperty(example = "eventId0001", required = true, value = "A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.")
  @JsonProperty("event_id")
  @NotNull
 @Size(max=256)  public String getEventId() {
    return eventId;
  }
  public void setEventId(String eventId) {
    this.eventId = eventId;
  }

  /**
   * Type of user event.
   **/
  
  @ApiModelProperty(example = "add_to_cart", required = true, value = "Type of user event.")
  @JsonProperty("event_name")
  @NotNull
  public EventNameEnum getEventName() {
    return eventName;
  }
  public void setEventName(EventNameEnum eventName) {
    this.eventName = eventName;
  }

  /**
   * The time when the event occurred. Unix timestamp in seconds.
   **/
  
  @ApiModelProperty(example = "1451431341", required = true, value = "The time when the event occurred. Unix timestamp in seconds.")
  @JsonProperty("event_timestamp")
  @NotNull
  public Long getEventTimestamp() {
    return eventTimestamp;
  }
  public void setEventTimestamp(Long eventTimestamp) {
    this.eventTimestamp = eventTimestamp;
  }

  /**
   * Total number of ad events including other non-Pinterest ad platforms.
   * minimum: 1
   **/
  
  @ApiModelProperty(example = "2", value = "Total number of ad events including other non-Pinterest ad platforms.")
  @JsonProperty("total_event_touchpoints")
 @Min(1)  public Integer getTotalEventTouchpoints() {
    return totalEventTouchpoints;
  }
  public void setTotalEventTouchpoints(Integer totalEventTouchpoints) {
    this.totalEventTouchpoints = totalEventTouchpoints;
  }

  /**
   * Total number of conversion events that are reported in one API call. &lt;p&gt;If you are sending one API request for one attributed conversion event then this value should be 1.&lt;/p&gt; &lt;p&gt;If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.&lt;/p&gt;
   * minimum: 1
   **/
  
  @ApiModelProperty(example = "2", value = "Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>")
  @JsonProperty("total_events")
 @Min(1)  public Integer getTotalEvents() {
    return totalEvents;
  }
  public void setTotalEvents(Integer totalEvents) {
    this.totalEvents = totalEvents;
  }

  /**
   * Order value of the conversion event. Required if &lt;code&gt;event_name&lt;/code&gt; is &#39;add_to_cart&#39; or &#39;checkout&#39;.
   **/
  
  @ApiModelProperty(example = "123.45", value = "Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.")
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

