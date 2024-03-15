package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SsioInsertionOrdersStatusGetByAdAccount200Response._

case class SsioInsertionOrdersStatusGetByAdAccount200Response (
  /* Insertion orders status by ad acount id */
  items: List[SSIOInsertionOrderStatus],
bookmark: Option[String])

object SsioInsertionOrdersStatusGetByAdAccount200Response {
  import DateTimeCodecs._

  implicit val SsioInsertionOrdersStatusGetByAdAccount200ResponseCodecJson: CodecJson[SsioInsertionOrdersStatusGetByAdAccount200Response] = CodecJson.derive[SsioInsertionOrdersStatusGetByAdAccount200Response]
  implicit val SsioInsertionOrdersStatusGetByAdAccount200ResponseDecoder: EntityDecoder[SsioInsertionOrdersStatusGetByAdAccount200Response] = jsonOf[SsioInsertionOrdersStatusGetByAdAccount200Response]
  implicit val SsioInsertionOrdersStatusGetByAdAccount200ResponseEncoder: EntityEncoder[SsioInsertionOrdersStatusGetByAdAccount200Response] = jsonEncoderOf[SsioInsertionOrdersStatusGetByAdAccount200Response]
}
