package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SsioOrderLinesGetByAdAccount200Response._

case class SsioOrderLinesGetByAdAccount200Response (
  /* SSIO order lines by ad acount id */
  items: List[SSIOOrderLine],
bookmark: Option[String])

object SsioOrderLinesGetByAdAccount200Response {
  import DateTimeCodecs._

  implicit val SsioOrderLinesGetByAdAccount200ResponseCodecJson: CodecJson[SsioOrderLinesGetByAdAccount200Response] = CodecJson.derive[SsioOrderLinesGetByAdAccount200Response]
  implicit val SsioOrderLinesGetByAdAccount200ResponseDecoder: EntityDecoder[SsioOrderLinesGetByAdAccount200Response] = jsonOf[SsioOrderLinesGetByAdAccount200Response]
  implicit val SsioOrderLinesGetByAdAccount200ResponseEncoder: EntityEncoder[SsioOrderLinesGetByAdAccount200Response] = jsonEncoderOf[SsioOrderLinesGetByAdAccount200Response]
}
