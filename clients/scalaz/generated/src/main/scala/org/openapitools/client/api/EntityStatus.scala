package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EntityStatus._

case class EntityStatus (
  
object EntityStatus {
  import DateTimeCodecs._

  implicit val EntityStatusCodecJson: CodecJson[EntityStatus] = CodecJson.derive[EntityStatus]
  implicit val EntityStatusDecoder: EntityDecoder[EntityStatus] = jsonOf[EntityStatus]
  implicit val EntityStatusEncoder: EntityEncoder[EntityStatus] = jsonEncoderOf[EntityStatus]
}
