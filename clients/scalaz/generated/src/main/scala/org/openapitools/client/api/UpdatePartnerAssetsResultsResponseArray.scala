package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePartnerAssetsResultsResponseArray._

case class UpdatePartnerAssetsResultsResponseArray (
  /* List of assigned/updated partner asset access. */
  items: Option[List[UpdatePartnerAssetsResult]])

object UpdatePartnerAssetsResultsResponseArray {
  import DateTimeCodecs._

  implicit val UpdatePartnerAssetsResultsResponseArrayCodecJson: CodecJson[UpdatePartnerAssetsResultsResponseArray] = CodecJson.derive[UpdatePartnerAssetsResultsResponseArray]
  implicit val UpdatePartnerAssetsResultsResponseArrayDecoder: EntityDecoder[UpdatePartnerAssetsResultsResponseArray] = jsonOf[UpdatePartnerAssetsResultsResponseArray]
  implicit val UpdatePartnerAssetsResultsResponseArrayEncoder: EntityEncoder[UpdatePartnerAssetsResultsResponseArray] = jsonEncoderOf[UpdatePartnerAssetsResultsResponseArray]
}
