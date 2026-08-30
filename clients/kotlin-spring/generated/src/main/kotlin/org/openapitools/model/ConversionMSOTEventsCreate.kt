package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AttributionModel
import org.openapitools.model.AttributionScope
import org.openapitools.model.Currency
import org.openapitools.model.MsotEventName
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Resource create operation model.
 * @param adGroupId The ID of the ad group that was attributed to the conversion event.
 * @param eventId A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
 * @param eventName Type of user event.
 * @param eventTimestamp The time when the event occurred. Unix timestamp in seconds.
 * @param actionTimestamps Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
 * @param attributionModel The attribution model used to attribute the conversion event.
 * @param attributionScope Ad event type.
 * @param attributionScore Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
 * @param campaignId The ID of the campaign that was attributed to the conversion event.
 * @param clickWindow Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).
 * @param currency Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.
 * @param totalEventTouchpoints Total number of ad events including other non-Pinterest ad platforms.
 * @param totalEvents Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.
 * @param totalEventsFractional Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).
 * @param &#x60;value&#x60; Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.
 * @param viewWindow View window used for attribution (for example, `1d`, `7d`, `30d`).
 */
data class ConversionMSOTEventsCreate(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680060704746", required = true, description = "The ID of the ad group that was attributed to the conversion event.")
    @param:JsonProperty("ad_group_id")
    @get:JsonProperty("ad_group_id", required = true) val adGroupId: kotlin.String,

    @get:Size(max=256)
    @Schema(example = "eventId0001", required = true, description = "A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.")
    @param:JsonProperty("event_id")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @field:Valid
    @Schema(example = "add_to_cart", required = true, description = "Type of user event.")
    @param:JsonProperty("event_name")
    @get:JsonProperty("event_name", required = true) val eventName: MsotEventName,

    @Schema(example = "1451431341", required = true, description = "The time when the event occurred. Unix timestamp in seconds.")
    @param:JsonProperty("event_timestamp")
    @get:JsonProperty("event_timestamp", required = true) val eventTimestamp: kotlin.Long,

    @Schema(example = "[1451410040]", description = "Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("action_timestamps")
    @get:JsonProperty("action_timestamps") val actionTimestamps: kotlin.collections.List<kotlin.Long>? = null,

    @field:Valid
    @Schema(example = "multi_touch", description = "The attribution model used to attribute the conversion event.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("attribution_model")
    @get:JsonProperty("attribution_model") val attributionModel: AttributionModel? = null,

    @field:Valid
    @Schema(example = "click", description = "Ad event type.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("attribution_scope")
    @get:JsonProperty("attribution_scope") val attributionScope: AttributionScope? = null,

    @get:DecimalMin(value="0")
    @get:DecimalMax(value="1")
    @Schema(example = "0.5", description = "Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("attribution_score")
    @get:JsonProperty("attribution_score") val attributionScore: kotlin.Double? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "626736533506", description = "The ID of the campaign that was attributed to the conversion event.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("campaign_id")
    @get:JsonProperty("campaign_id") val campaignId: kotlin.String? = null,

    @Schema(description = "Click window used for attribution (for example, `1d`, `7d`, `30d`, `lifetime`).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("click_window")
    @get:JsonProperty("click_window") val clickWindow: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Currency code for the `value` field, required if `value` is present. Currency Codes should be in ISO 4217 standard.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("currency")
    @get:JsonProperty("currency") val currency: Currency? = null,

    @get:Min(value=1)
    @Schema(example = "2", description = "Total number of ad events including other non-Pinterest ad platforms.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("total_event_touchpoints")
    @get:JsonProperty("total_event_touchpoints") val totalEventTouchpoints: kotlin.Int? = null,

    @get:Min(value=1)
    @Schema(example = "2", description = "Deprecated: use `total_events_fractional` instead to avoid rounding errors. Total number of conversion events that are reported in one API call.  If you are sending one API request for one attributed conversion event then this value should be 1. If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.")
    @Deprecated(message = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("total_events")
    @get:JsonProperty("total_events") val totalEvents: kotlin.Int? = null,

    @get:DecimalMin(value="0")
    @Schema(description = "Total number of conversion events that are reported in one API call. Use this field instead of `total_events` to send precise fractional values.  If you are sending one API request for one attributed conversion event with full credit, this value should be 1.0. For partial attribution, send the exact fractional value (e.g., 0.5 for half credit).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("total_events_fractional")
    @get:JsonProperty("total_events_fractional") val totalEventsFractional: kotlin.Double? = null,

    @Schema(example = "123.45", description = "Order value of the conversion event. Required if `event_name` is `add_to_cart` or `checkout`.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("value")
    @get:JsonProperty("value") val `value`: kotlin.Double? = null,

    @Schema(description = "View window used for attribution (for example, `1d`, `7d`, `30d`).")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("view_window")
    @get:JsonProperty("view_window") val viewWindow: kotlin.String? = null
) {

}

