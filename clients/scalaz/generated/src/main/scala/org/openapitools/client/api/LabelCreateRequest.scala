package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelCreateRequest._

case class LabelCreateRequest (
  /* Labels that you are applying to the campaign. */
  labels: List[LabelCreateItem])

object LabelCreateRequest {
  import DateTimeCodecs._

  implicit val LabelCreateRequestCodecJson: CodecJson[LabelCreateRequest] = CodecJson.derive[LabelCreateRequest]
  implicit val LabelCreateRequestDecoder: EntityDecoder[LabelCreateRequest] = jsonOf[LabelCreateRequest]
  implicit val LabelCreateRequestEncoder: EntityEncoder[LabelCreateRequest] = jsonEncoderOf[LabelCreateRequest]
}
