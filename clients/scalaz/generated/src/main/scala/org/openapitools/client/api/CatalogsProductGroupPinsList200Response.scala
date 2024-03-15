package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupPinsList200Response._

case class CatalogsProductGroupPinsList200Response (
  /* Pins */
  items: List[CatalogsProduct],
bookmark: Option[String])

object CatalogsProductGroupPinsList200Response {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupPinsList200ResponseCodecJson: CodecJson[CatalogsProductGroupPinsList200Response] = CodecJson.derive[CatalogsProductGroupPinsList200Response]
  implicit val CatalogsProductGroupPinsList200ResponseDecoder: EntityDecoder[CatalogsProductGroupPinsList200Response] = jsonOf[CatalogsProductGroupPinsList200Response]
  implicit val CatalogsProductGroupPinsList200ResponseEncoder: EntityEncoder[CatalogsProductGroupPinsList200Response] = jsonEncoderOf[CatalogsProductGroupPinsList200Response]
}
