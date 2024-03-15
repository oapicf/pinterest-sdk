package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsCreditsDiscountsGet200Response._

case class AdsCreditsDiscountsGet200Response (
  items: List[AdsCreditDiscountsResponse],
bookmark: Option[String])

object AdsCreditsDiscountsGet200Response {
  import DateTimeCodecs._

  implicit val AdsCreditsDiscountsGet200ResponseCodecJson: CodecJson[AdsCreditsDiscountsGet200Response] = CodecJson.derive[AdsCreditsDiscountsGet200Response]
  implicit val AdsCreditsDiscountsGet200ResponseDecoder: EntityDecoder[AdsCreditsDiscountsGet200Response] = jsonOf[AdsCreditsDiscountsGet200Response]
  implicit val AdsCreditsDiscountsGet200ResponseEncoder: EntityEncoder[AdsCreditsDiscountsGet200Response] = jsonEncoderOf[AdsCreditsDiscountsGet200Response]
}
