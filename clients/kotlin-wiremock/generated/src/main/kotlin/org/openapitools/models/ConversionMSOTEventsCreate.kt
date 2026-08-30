@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionMSOTEventsCreate(
    @field:JsonProperty("ad_group_id")
    val adGroupId: kotlin.String,

    @field:JsonProperty("event_id")
    val eventId: kotlin.String,

    @field:JsonProperty("event_name")
    val eventName: MsotEventName,

    @field:JsonProperty("event_timestamp")
    val eventTimestamp: kotlin.Long,

    @field:JsonProperty("action_timestamps")
    val actionTimestamps: kotlin.collections.List<kotlin.Long>? = null,

    @field:JsonProperty("attribution_model")
    val attributionModel: AttributionModel? = null,

    @field:JsonProperty("attribution_scope")
    val attributionScope: AttributionScope? = null,

    @field:JsonProperty("attribution_score")
    val attributionScore: kotlin.Double? = null,

    @field:JsonProperty("campaign_id")
    val campaignId: kotlin.String? = null,

    @field:JsonProperty("click_window")
    val clickWindow: kotlin.String? = null,

    @field:JsonProperty("currency")
    val currency: Currency? = null,

    @field:JsonProperty("total_event_touchpoints")
    val totalEventTouchpoints: kotlin.Int? = null,

    @field:JsonProperty("total_events")
    val totalEvents: kotlin.Int? = null,

    @field:JsonProperty("total_events_fractional")
    val totalEventsFractional: kotlin.Double? = null,

    @field:JsonProperty("value")
    val `value`: kotlin.Double? = null,

    @field:JsonProperty("view_window")
    val viewWindow: kotlin.String? = null,

)
