/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.TopPinsAnalyticsResponseDateAvailability
import org.openapitools.server.models.TopVideoPinsAnalyticsResponsePinsInner

/**
 * 
 * @param dateAvailability 
 * @param pins 
 * @param sortBy 
 */
data class TopVideoPinsAnalyticsResponse(
    val dateAvailability: TopPinsAnalyticsResponseDateAvailability? = null,
    val pins: kotlin.collections.List<TopVideoPinsAnalyticsResponsePinsInner>? = null,
    val sortBy: TopVideoPinsAnalyticsResponse.SortBy? = null
) 
{
    /**
    * 
    * Values: SAVE,IMPRESSION,OUTBOUND_CLICK,VIDEO_MRC_VIEW,VIDEO_AVG_WATCH_TIME,VIDEO_V50_WATCH_TIME,QUARTILE_95_PERCENT_VIEW,VIDEO_10S_VIEW,VIDEO_START
    */
    enum class SortBy(val value: kotlin.String){
        SAVE("SAVE"),
        IMPRESSION("IMPRESSION"),
        OUTBOUND_CLICK("OUTBOUND_CLICK"),
        VIDEO_MRC_VIEW("VIDEO_MRC_VIEW"),
        VIDEO_AVG_WATCH_TIME("VIDEO_AVG_WATCH_TIME"),
        VIDEO_V50_WATCH_TIME("VIDEO_V50_WATCH_TIME"),
        QUARTILE_95_PERCENT_VIEW("QUARTILE_95_PERCENT_VIEW"),
        VIDEO_10S_VIEW("VIDEO_10S_VIEW"),
        VIDEO_START("VIDEO_START");
    }
}

