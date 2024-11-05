package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PermissionsWithOwner._

case class PermissionsWithOwner (
  
object PermissionsWithOwner {
  import DateTimeCodecs._

  implicit val PermissionsWithOwnerCodecJson: CodecJson[PermissionsWithOwner] = CodecJson.derive[PermissionsWithOwner]
  implicit val PermissionsWithOwnerDecoder: EntityDecoder[PermissionsWithOwner] = jsonOf[PermissionsWithOwner]
  implicit val PermissionsWithOwnerEncoder: EntityEncoder[PermissionsWithOwner] = jsonEncoderOf[PermissionsWithOwner]
}
