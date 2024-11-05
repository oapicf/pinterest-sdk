package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeletePartnerAssetsResultsResponseArray._

case class DeletePartnerAssetsResultsResponseArray (
  /* List of terminated asset access. */
  items: Option[List[DeletePartnerAssetsResult]])

object DeletePartnerAssetsResultsResponseArray {
  import DateTimeCodecs._

  implicit val DeletePartnerAssetsResultsResponseArrayCodecJson: CodecJson[DeletePartnerAssetsResultsResponseArray] = CodecJson.derive[DeletePartnerAssetsResultsResponseArray]
  implicit val DeletePartnerAssetsResultsResponseArrayDecoder: EntityDecoder[DeletePartnerAssetsResultsResponseArray] = jsonOf[DeletePartnerAssetsResultsResponseArray]
  implicit val DeletePartnerAssetsResultsResponseArrayEncoder: EntityEncoder[DeletePartnerAssetsResultsResponseArray] = jsonEncoderOf[DeletePartnerAssetsResultsResponseArray]
}
