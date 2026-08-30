package apimodels;

import apimodels.AttributionModel;
import apimodels.AttributionScope;
import apimodels.Currency;
import apimodels.MsotEventName;
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
 * Resource create operation model.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-08-30T09:53:05.195757851Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ConversionMSOTEventsCreate   {
  @JsonProperty("action_timestamps")
  
  private List<Long> actionTimestamps = null;

  @JsonProperty("ad_group_id")
  @NotNull
@Pattern(regexp="^\\d+$")

  private String adGroupId;

  @JsonProperty("attribution_model")
  @Valid

  private AttributionModel attributionModel;

  @JsonProperty("attribution_scope")
  @Valid

  private AttributionScope attributionScope;

  @JsonProperty("attribution_score")
  @DecimalMin("0")
@DecimalMax("1")

  private Double attributionScore;

  @JsonProperty("campaign_id")
  @Pattern(regexp="^\\d+$")

  private String campaignId;

  @JsonProperty("click_window")
  
  private String clickWindow;

  @JsonProperty("currency")
  @Valid

  private Currency currency;

  @JsonProperty("event_id")
  @NotNull
@Size(max=256)

  private String eventId;

  @JsonProperty("event_name")
  @NotNull
@Valid

  private MsotEventName eventName;

  @JsonProperty("event_timestamp")
  @NotNull

  private Long eventTimestamp;

  @JsonProperty("total_event_touchpoints")
  @Min(1)

  private Integer totalEventTouchpoints;

  @JsonProperty("total_events")
  @Min(1)

  private Integer totalEvents;

  @JsonProperty("total_events_fractional")
  @DecimalMin("0")

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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

