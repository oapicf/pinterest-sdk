package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateMaskBidOptionField._

case class UpdateMaskBidOptionField (
  
object UpdateMaskBidOptionField {
  import DateTimeCodecs._

  implicit val UpdateMaskBidOptionFieldCodecJson: CodecJson[UpdateMaskBidOptionField] = CodecJson.derive[UpdateMaskBidOptionField]
  implicit val UpdateMaskBidOptionFieldDecoder: EntityDecoder[UpdateMaskBidOptionField] = jsonOf[UpdateMaskBidOptionField]
  implicit val UpdateMaskBidOptionFieldEncoder: EntityEncoder[UpdateMaskBidOptionField] = jsonEncoderOf[UpdateMaskBidOptionField]
}
