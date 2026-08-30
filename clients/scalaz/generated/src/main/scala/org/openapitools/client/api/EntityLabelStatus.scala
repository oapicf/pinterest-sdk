package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EntityLabelStatus._

case class EntityLabelStatus (
  
object EntityLabelStatus {
  import DateTimeCodecs._

  implicit val EntityLabelStatusCodecJson: CodecJson[EntityLabelStatus] = CodecJson.derive[EntityLabelStatus]
  implicit val EntityLabelStatusDecoder: EntityDecoder[EntityLabelStatus] = jsonOf[EntityLabelStatus]
  implicit val EntityLabelStatusEncoder: EntityEncoder[EntityLabelStatus] = jsonEncoderOf[EntityLabelStatus]
}
