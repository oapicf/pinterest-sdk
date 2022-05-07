package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardOwner._

case class BoardOwner (
  username: Option[String])

object BoardOwner {
  import DateTimeCodecs._

  implicit val BoardOwnerCodecJson: CodecJson[BoardOwner] = CodecJson.derive[BoardOwner]
  implicit val BoardOwnerDecoder: EntityDecoder[BoardOwner] = jsonOf[BoardOwner]
  implicit val BoardOwnerEncoder: EntityEncoder[BoardOwner] = jsonEncoderOf[BoardOwner]
}
