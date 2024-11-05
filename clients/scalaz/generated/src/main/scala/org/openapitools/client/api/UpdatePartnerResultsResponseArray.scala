package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePartnerResultsResponseArray._

case class UpdatePartnerResultsResponseArray (
  items: Option[List[UpdatePartnerResultsResponseArrayItemsInner]])

object UpdatePartnerResultsResponseArray {
  import DateTimeCodecs._

  implicit val UpdatePartnerResultsResponseArrayCodecJson: CodecJson[UpdatePartnerResultsResponseArray] = CodecJson.derive[UpdatePartnerResultsResponseArray]
  implicit val UpdatePartnerResultsResponseArrayDecoder: EntityDecoder[UpdatePartnerResultsResponseArray] = jsonOf[UpdatePartnerResultsResponseArray]
  implicit val UpdatePartnerResultsResponseArrayEncoder: EntityEncoder[UpdatePartnerResultsResponseArray] = jsonEncoderOf[UpdatePartnerResultsResponseArray]
}
