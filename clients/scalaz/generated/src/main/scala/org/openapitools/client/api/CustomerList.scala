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
/* Customer list ID. */
  id: Option[String],
/* Customer list name. */
  name: Option[String],
/* Total number of list updates.  List creation counts as one batch. Each <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append</a> or <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call counts as another. List creation via the Ads Manager UI could result in more than one batch since the UI breaks up large lists. */
  numBatches: Option[BigDecimal],
/* Number of removed user records. In a <a href=\"/docs/redoc/#operation/ads_v3_customer_list_remove_handler_PUT\">Remove API</a> call, this counter increases even if the user is not found in the list. */
  numRemovedUserRecords: Option[BigDecimal],
/* Number of uploaded user records. In an <a href=\"/docs/redoc/#operation/ads_v3_customer_list_add_handler_PUT\">Append API</a> call, this counter increases even if the uploaded user is already in the list. */
  numUploadedUserRecords: Option[BigDecimal],
/* Customer list status. TOO_SMALL - the list has less than 100 Pinterest users. */
  status: Option[Status],
/* Always \"customerlist\". */
  `type`: Option[String],
/* Last update time. Unix timestamp in seconds. */
  updatedTime: Option[BigDecimal],
/* Customer list errors */
  exceptions: Option[Any])

object CustomerList {
  import DateTimeCodecs._
  sealed trait Status
  case object PROCESSING extends Status
  case object READY extends Status
  case object TOOSMALL extends Status
  case object UPLOADING extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "PROCESSING" => Some(PROCESSING)
      case "READY" => Some(READY)
      case "TOOSMALL" => Some(TOOSMALL)
      case "UPLOADING" => Some(UPLOADING)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case PROCESSING => "PROCESSING"
      case READY => "READY"
      case TOOSMALL => "TOOSMALL"
      case UPLOADING => "UPLOADING"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val CustomerListCodecJson: CodecJson[CustomerList] = CodecJson.derive[CustomerList]
  implicit val CustomerListDecoder: EntityDecoder[CustomerList] = jsonOf[CustomerList]
  implicit val CustomerListEncoder: EntityEncoder[CustomerList] = jsonEncoderOf[CustomerList]
}
