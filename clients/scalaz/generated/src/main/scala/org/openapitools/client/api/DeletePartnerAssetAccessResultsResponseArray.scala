package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeletePartnerAssetAccessResultsResponseArray._

case class DeletePartnerAssetAccessResultsResponseArray (
  /* List of terminated partner asset accesses. */
  items: Option[List[DeletePartnerAssetAccessResult]])

object DeletePartnerAssetAccessResultsResponseArray {
  import DateTimeCodecs._

  implicit val DeletePartnerAssetAccessResultsResponseArrayCodecJson: CodecJson[DeletePartnerAssetAccessResultsResponseArray] = CodecJson.derive[DeletePartnerAssetAccessResultsResponseArray]
  implicit val DeletePartnerAssetAccessResultsResponseArrayDecoder: EntityDecoder[DeletePartnerAssetAccessResultsResponseArray] = jsonOf[DeletePartnerAssetAccessResultsResponseArray]
  implicit val DeletePartnerAssetAccessResultsResponseArrayEncoder: EntityEncoder[DeletePartnerAssetAccessResultsResponseArray] = jsonEncoderOf[DeletePartnerAssetAccessResultsResponseArray]
}
