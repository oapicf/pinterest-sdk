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
package org.openapitools.client.model

import org.openapitools.client.core.ApiModel

case class TopPinsAnalyticsResponse (
  dateAvailability: Option[TopPinsAnalyticsResponseDateAvailability] = None,
  pins: Option[Seq[TopPinsAnalyticsResponsePinsInner]] = None,
  sortBy: Option[TopPinsAnalyticsResponseEnums.SortBy] = None
) extends ApiModel

object TopPinsAnalyticsResponseEnums {

  type SortBy = SortBy.Value
  object SortBy extends Enumeration {
    val ENGAGEMENT = Value("ENGAGEMENT")
    val SAVE = Value("SAVE")
    val IMPRESSION = Value("IMPRESSION")
    val OUTBOUNDCLICK = Value("OUTBOUND_CLICK")
    val PINCLICK = Value("PIN_CLICK")
  }

}
