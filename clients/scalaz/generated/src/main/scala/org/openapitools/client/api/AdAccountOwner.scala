package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdAccountOwner._

case class AdAccountOwner (
  /* Public username for the user account */
  username: Option[String])

object AdAccountOwner {
  import DateTimeCodecs._

  implicit val AdAccountOwnerCodecJson: CodecJson[AdAccountOwner] = CodecJson.derive[AdAccountOwner]
  implicit val AdAccountOwnerDecoder: EntityDecoder[AdAccountOwner] = jsonOf[AdAccountOwner]
  implicit val AdAccountOwnerEncoder: EntityEncoder[AdAccountOwner] = jsonEncoderOf[AdAccountOwner]
}
