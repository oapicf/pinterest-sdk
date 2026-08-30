package org.openapitools.server.api.model

import org.openapitools.server.api.model.AttributionWindows
import org.openapitools.server.api.model.ConversionEvent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionTagV3GoalMetadata(
    val attributionWindows: AttributionWindows? = null,
    val conversionEvent: ConversionEvent? = null,
    val conversionTagId: kotlin.String? = null,
    val cpaGoalValueInMicroCurrency: kotlin.String? = null,
    /** Pinterest Performance+ ROAS bidding. When enabled, Pinterest will optimize for conversion value instead of conversion volume. Only supported when &#x60;conversion_event&#x60; is set to &#x60;\&quot;CHECKOUT\&quot;&#x60; and &#x60;bid_strategy_type&#x60; is set to &#x60;\&quot;AUTOMATIC_BID\&quot;&#x60;. This parameter is not enabled for all advertisers. [Learn more](https://developers.pinterest.com/docs/getting-started/using-beta-and-restricted-features/). */
    val isRoasOptimized: kotlin.Boolean? = null,
    /** Event name for custom or standard events mapped to an oCPM model */
    val reportingEvent: kotlin.String? = null
)
