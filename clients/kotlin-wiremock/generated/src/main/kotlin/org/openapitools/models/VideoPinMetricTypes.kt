@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class VideoPinMetricTypes {
    @JsonProperty(value = "IMPRESSION") IMPRESSION,
    @JsonProperty(value = "OUTBOUND_CLICK") OUTBOUND_CLICK,
    @JsonProperty(value = "PIN_CLICK") PIN_CLICK,
    @JsonProperty(value = "SAVE") SAVE,
    @JsonProperty(value = "SAVE_RATE") SAVE_RATE,
    @JsonProperty(value = "VIDEO_MRC_VIEW") VIDEO_MRC_VIEW,
    @JsonProperty(value = "VIDEO_10S_VIEW") VIDEO_10S_VIEW,
    @JsonProperty(value = "QUARTILE_95_PERCENT_VIEW") QUARTILE_95_PERCENT_VIEW,
    @JsonProperty(value = "VIDEO_V50_WATCH_TIME") VIDEO_V50_WATCH_TIME,
    @JsonProperty(value = "VIDEO_START") VIDEO_START,
    @JsonProperty(value = "VIDEO_AVG_WATCH_TIME") VIDEO_AVG_WATCH_TIME,
    @JsonProperty(value = "TOTAL_COMMENTS") TOTAL_COMMENTS,
    @JsonProperty(value = "TOTAL_REACTIONS") TOTAL_REACTIONS,
}
