package org.openapitools.server.api.model

import org.openapitools.server.api.model.AttributionModel
import org.openapitools.server.api.model.AttributionScope
import org.openapitools.server.api.model.Currency
import org.openapitools.server.api.model.MsotEventName
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionMSOTEventsCreate(
    /** The ID of the ad group that was attributed to the conversion event. */
    val adGroupId: kotlin.String,
    /** A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API. */
    val eventId: kotlin.String,
    /** Type of user event. */
    val eventName: MsotEventName,
    /** The time when the event occurred. Unix timestamp in seconds. */
    val eventTimestamp: kotlin.Long,
    /** Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds. */
    val actionTimestamps: kotlin.collections.List<kotlin.Long>? = null,
    /** The attribution model used to attribute the conversion event. */
    val attributionModel: AttributionModel? = null,
    /** Ad event type. */
    val attributionScope: AttributionScope? = null,
    /** Credit given to the attributed ad actions. Allowed values are &gt; 0 and &lt;&#x3D; 1. */
    val attributionScore: kotlin.Double? = null,
    /** The ID of the campaign that was attributed to the conversion event. */
    val campaignId: kotlin.String? = null,
    /** Click window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;, &#x60;lifetime&#x60;). */
    val clickWindow: kotlin.String? = null,
    /** Currency code for the &#x60;value&#x60; field, required if &#x60;value&#x60; is present. Currency Codes should be in ISO 4217 standard. */
    val currency: Currency? = null,
    /** Total number of ad events including other non-Pinterest ad platforms. */
    val totalEventTouchpoints: kotlin.Int? = null,
    /** Deprecated: use &#x60;total_events_fractional&#x60; instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request. */
    val totalEvents: kotlin.Int? = null,
    /** Total number of conversion events that are reported in one API call. Use this field instead of &#x60;total_events&#x60; to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit). */
    val totalEventsFractional: kotlin.Double? = null,
    /** Order value of the conversion event. Required if &#x60;event_name&#x60; is &#x60;add_to_cart&#x60; or &#x60;checkout&#x60;. */
    val `value`: kotlin.Double? = null,
    /** View window used for attribution (for example, &#x60;1d&#x60;, &#x60;7d&#x60;, &#x60;30d&#x60;). */
    val viewWindow: kotlin.String? = null
)
