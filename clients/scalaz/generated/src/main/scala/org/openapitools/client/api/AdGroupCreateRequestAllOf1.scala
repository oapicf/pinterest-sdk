package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupCreateRequestAllOf1._

case class AdGroupCreateRequestAllOf1 (
  /* Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. */
  autoTargetingEnabled: Option[Boolean],
/* <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. */
  bidMultiplier: Option[BigDecimal],
budgetType: Option[BudgetType],
pacingDeliveryType: Option[PacingDeliveryType])

object AdGroupCreateRequestAllOf1 {
  import DateTimeCodecs._

  implicit val AdGroupCreateRequestAllOf1CodecJson: CodecJson[AdGroupCreateRequestAllOf1] = CodecJson.derive[AdGroupCreateRequestAllOf1]
  implicit val AdGroupCreateRequestAllOf1Decoder: EntityDecoder[AdGroupCreateRequestAllOf1] = jsonOf[AdGroupCreateRequestAllOf1]
  implicit val AdGroupCreateRequestAllOf1Encoder: EntityEncoder[AdGroupCreateRequestAllOf1] = jsonEncoderOf[AdGroupCreateRequestAllOf1]
}
