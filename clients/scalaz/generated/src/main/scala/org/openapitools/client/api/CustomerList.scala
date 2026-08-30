package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomerList._

case class CustomerList (
  /* Associated ad account ID. */
  adAccountId: Option[String],
/* Creation time. Unix timestamp in seconds. */
  createdTime: Option[BigDecimal],
/* Customer list errors. */
  exceptions: Option[Any],
/* Customer list ID. */
  id: String,
/* Whether the list was uploaded for new customer acquisition (expanded matching). Immutable after creation. */
  isNca: Option[Boolean],
/* Customer list name. */
  name: String,
/* Total number of list updates. List creation counts as one batch. Each [Append](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) or [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call counts as another. List creation via the **Ads Manager** UI could result in more than one batch since the UI breaks up large lists. */
  numBatches: Option[BigDecimal],
/* Number of removed user records. In a [Remove API](/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT) call, this counter increases even if the user is not found in the list. */
  numRemovedUserRecords: Option[BigDecimal],
/* Number of uploaded user records. In an [Append API](/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT) call, this counter increases even if the uploaded user is already in the list. */
  numUploadedUserRecords: Option[BigDecimal],
/* Customer list status. `TOO_SMALL` means the list has fewer than 100 Pinterest users. */
  status: Option[CustomerListStatus],
/* Always `customerlist`. */
  `type`: Option[String],
/* Last update time. Unix timestamp in seconds. */
  updatedTime: Option[BigDecimal])

object CustomerList {
  import DateTimeCodecs._

  implicit val CustomerListCodecJson: CodecJson[CustomerList] = CodecJson.derive[CustomerList]
  implicit val CustomerListDecoder: EntityDecoder[CustomerList] = jsonOf[CustomerList]
  implicit val CustomerListEncoder: EntityEncoder[CustomerList] = jsonEncoderOf[CustomerList]
}
