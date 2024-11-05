package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessAssetsGet200Response._

case class BusinessAssetsGet200Response (
  /* List of assets the requesting business has access to. */
  items: List[GetBusinessAssetsResponse],
bookmark: Option[String])

object BusinessAssetsGet200Response {
  import DateTimeCodecs._

  implicit val BusinessAssetsGet200ResponseCodecJson: CodecJson[BusinessAssetsGet200Response] = CodecJson.derive[BusinessAssetsGet200Response]
  implicit val BusinessAssetsGet200ResponseDecoder: EntityDecoder[BusinessAssetsGet200Response] = jsonOf[BusinessAssetsGet200Response]
  implicit val BusinessAssetsGet200ResponseEncoder: EntityEncoder[BusinessAssetsGet200Response] = jsonEncoderOf[BusinessAssetsGet200Response]
}
