package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BrandAccountUpdate._

case class BrandAccountUpdate (
  /* Brand Account about information */
  about: Option[String],
country: Option[Country],
/* Brand Account name */
  name: Option[String],
profileImage: Option[BrandAccountProfileImageUpdate],
/* Brand Account username */
  username: Option[String],
/* Brand Account website */
  website: Option[String])

object BrandAccountUpdate {
  import DateTimeCodecs._

  implicit val BrandAccountUpdateCodecJson: CodecJson[BrandAccountUpdate] = CodecJson.derive[BrandAccountUpdate]
  implicit val BrandAccountUpdateDecoder: EntityDecoder[BrandAccountUpdate] = jsonOf[BrandAccountUpdate]
  implicit val BrandAccountUpdateEncoder: EntityEncoder[BrandAccountUpdate] = jsonEncoderOf[BrandAccountUpdate]
}
