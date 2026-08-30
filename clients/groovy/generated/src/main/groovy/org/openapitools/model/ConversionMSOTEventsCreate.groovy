package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AttributionModel;
import org.openapitools.model.AttributionScope;
import org.openapitools.model.Currency;
import org.openapitools.model.MsotEventName;

@Canonical
class ConversionMSOTEventsCreate {
    /* Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. */
    List<Long> actionTimestamps = new ArrayList<>()
    /* The ID of the ad group that was attributed to the conversion event. */
    String adGroupId
    /* The attribution model used to attribute the conversion event. */
    AttributionModel attributionModel
    /* Ad event type. */
    AttributionScope attributionScope
    /* Credit given to the attributed ad actions. Allowed values are > 0 and <= 1. */
    Double attributionScore
    /* The ID of the campaign that was attributed to the conversion event. */
    String campaignId
    /* Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`). */
    String clickWindow
    /* Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard. */
    Currency currency
    /* A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. */
    String eventId
    /* Type of user event. */
    MsotEventName eventName
    /* The time when the event occurred. Unix timestamp in seconds. */
    Long eventTimestamp
    /* Total number of ad events including other non-Pinterest ad platforms. */
    Integer totalEventTouchpoints
    /* Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. */
    Integer totalEvents
    /* Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). */
    Double totalEventsFractional
    /* Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`. */
    Double value
    /* View window used for attribution (for example, `1d`, `7d`, `30d`). */
    String viewWindow
}
