package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Currency
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
 * Object containing the MSOT conversion events.
 * @param adGroupId The ID of the ad group that was attributed to the conversion event.
 * @param attributionScope Ad event type.
 * @param eventId A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.
 * @param eventName Type of user event.
 * @param eventTimestamp The time when the event occurred. Unix timestamp in seconds.
 * @param actionTimestamps Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.
 * @param attributionModel The attribution model used to attribute the conversion event.
 * @param attributionScore Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.
 * @param campaignId The ID of the campaign that was attributed to the conversion event.
 * @param currency 
 * @param totalEventTouchpoints Total number of ad events including other non-Pinterest ad platforms.
 * @param totalEvents Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>
 * @param &#x60;value&#x60; Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.
 */
data class ConversionMSOTEvents(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680060704746", required = true, description = "The ID of the ad group that was attributed to the conversion event.")
    @get:JsonProperty("ad_group_id", required = true) val adGroupId: kotlin.String,

    @Schema(example = "click", required = true, description = "Ad event type.")
    @get:JsonProperty("attribution_scope", required = true) val attributionScope: ConversionMSOTEvents.AttributionScope,

    @get:Size(max=256)
    @Schema(example = "eventId0001", required = true, description = "A unique id string that identifies this event. If you are already sending us events through Conversions API, then this id should match the event_id sent through Conversions API.")
    @get:JsonProperty("event_id", required = true) val eventId: kotlin.String,

    @Schema(example = "add_to_cart", required = true, description = "Type of user event.")
    @get:JsonProperty("event_name", required = true) val eventName: ConversionMSOTEvents.EventName,

    @Schema(example = "1451431341", required = true, description = "The time when the event occurred. Unix timestamp in seconds.")
    @get:JsonProperty("event_timestamp", required = true) val eventTimestamp: kotlin.Long,

    @Schema(example = "[1451410040]", description = "Timestamp(s) when the ad action(s) happened. Unix timestamp in seconds.")
    @get:JsonProperty("action_timestamps") val actionTimestamps: kotlin.collections.List<kotlin.Long>? = null,

    @Schema(example = "multi_touch", description = "The attribution model used to attribute the conversion event.")
    @get:JsonProperty("attribution_model") val attributionModel: ConversionMSOTEvents.AttributionModel? = null,

    @get:DecimalMin(value="0")
    @get:DecimalMax(value="1")
    @Schema(example = "0.5", description = "Credit given to the attributed ad actions. Allowed values are > 0 and <= 1.")
    @get:JsonProperty("attribution_score") val attributionScore: kotlin.Double? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "626736533506", description = "The ID of the campaign that was attributed to the conversion event.")
    @get:JsonProperty("campaign_id") val campaignId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currency") val currency: Currency? = null,

    @get:Min(value=1)
    @Schema(example = "2", description = "Total number of ad events including other non-Pinterest ad platforms.")
    @get:JsonProperty("total_event_touchpoints") val totalEventTouchpoints: kotlin.Int? = null,

    @get:Min(value=1)
    @Schema(example = "2", description = "Total number of conversion events that are reported in one API call. <p>If you are sending one API request for one attributed conversion event then this value should be 1.</p> <p>If you are sending multiple attributed conversion events in one API request then this value should be the total number of attributed conversion events in the request.</p>")
    @get:JsonProperty("total_events") val totalEvents: kotlin.Int? = null,

    @Schema(example = "123.45", description = "Order value of the conversion event. Required if <code>event_name</code> is 'add_to_cart' or 'checkout'.")
    @get:JsonProperty("value") val `value`: kotlin.Double? = null
) {

    /**
    * Ad event type.
    * Values: view,engagement,click
    */
    enum class AttributionScope(@get:JsonValue val value: kotlin.String) {

        view("view"),
        engagement("engagement"),
        click("click");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): AttributionScope {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConversionMSOTEvents'")
            }
        }
    }

    /**
    * Type of user event.
    * Values: add_to_cart,checkout,lead,signup
    */
    enum class EventName(@get:JsonValue val value: kotlin.String) {

        add_to_cart("add_to_cart"),
        checkout("checkout"),
        lead("lead"),
        signup("signup");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): EventName {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConversionMSOTEvents'")
            }
        }
    }

    /**
    * The attribution model used to attribute the conversion event.
    * Values: first_touch,last_touch,multi_touch
    */
    enum class AttributionModel(@get:JsonValue val value: kotlin.String) {

        first_touch("first_touch"),
        last_touch("last_touch"),
        multi_touch("multi_touch");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): AttributionModel {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConversionMSOTEvents'")
            }
        }
    }

}

