package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.AttributionModel;
import org.openapitools.server.model.AttributionScope;
import org.openapitools.server.model.Currency;
import org.openapitools.server.model.MsotEventName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Resource create operation model.
 */
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
     * Default constructor.
     */
    public ConversionMSOTEventsCreate() {
    // JSON-B / Jackson
    }

    /**
     * Create ConversionMSOTEventsCreate.
     *
     * @param actionTimestamps Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
     * @param adGroupId The ID of the ad group that was attributed to the conversion event.
     * @param attributionModel The attribution model used to attribute the conversion event.
     * @param attributionScope Ad event type.
     * @param attributionScore Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1.
     * @param campaignId The ID of the campaign that was attributed to the conversion event.
     * @param clickWindow Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;).
     * @param currency Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard.
     * @param eventId A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
     * @param eventName Type of user event.
     * @param eventTimestamp The time when the event occurred. Unix timestamp in seconds.
     * @param totalEventTouchpoints Total number of ad events including other non-Pinterest ad platforms.
     * @param totalEvents Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
     * @param totalEventsFractional Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
     * @param value Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;.
     * @param viewWindow View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;).
     */
    public ConversionMSOTEventsCreate(
        List<Long> actionTimestamps, 
        String adGroupId, 
        AttributionModel attributionModel, 
        AttributionScope attributionScope, 
        Double attributionScore, 
        String campaignId, 
        String clickWindow, 
        Currency currency, 
        String eventId, 
        MsotEventName eventName, 
        Long eventTimestamp, 
        Integer totalEventTouchpoints, 
        Integer totalEvents, 
        Double totalEventsFractional, 
        Double value, 
        String viewWindow
    ) {
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
     * Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
     * minimum: 0
     * maximum: 1
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
     * Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
     * @return clickWindow
     */
    public String getClickWindow() {
        return clickWindow;
    }

    public void setClickWindow(String clickWindow) {
        this.clickWindow = clickWindow;
    }

    /**
     * Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
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
     * minimum: 1
     * @return totalEventTouchpoints
     */
    public Integer getTotalEventTouchpoints() {
        return totalEventTouchpoints;
    }

    public void setTotalEventTouchpoints(Integer totalEventTouchpoints) {
        this.totalEventTouchpoints = totalEventTouchpoints;
    }

    /**
     * Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
     * minimum: 1
     * @return totalEvents
     */
    public Integer getTotalEvents() {
        return totalEvents;
    }

    public void setTotalEvents(Integer totalEvents) {
        this.totalEvents = totalEvents;
    }

    /**
     * Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
     * minimum: 0
     * @return totalEventsFractional
     */
    public Double getTotalEventsFractional() {
        return totalEventsFractional;
    }

    public void setTotalEventsFractional(Double totalEventsFractional) {
        this.totalEventsFractional = totalEventsFractional;
    }

    /**
     * Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
     * @return value
     */
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * View window used for attribution (for example, `1d`, `7d`, `30d`).
     * @return viewWindow
     */
    public String getViewWindow() {
        return viewWindow;
    }

    public void setViewWindow(String viewWindow) {
        this.viewWindow = viewWindow;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

