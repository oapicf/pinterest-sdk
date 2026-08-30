package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BrandAccountCreate._

case class BrandAccountCreate (
  /* Brand Account about information */
  about: Option[String],
country: Country,
/* Brand Account name */
  name: String,
profileImage: Option[BrandAccountProfileImage],
/* Brand Account username */
  username: String,
/* Brand Account website */
  website: Option[String])

object BrandAccountCreate {
  import DateTimeCodecs._

  implicit val BrandAccountCreateCodecJson: CodecJson[BrandAccountCreate] = CodecJson.derive[BrandAccountCreate]
  implicit val BrandAccountCreateDecoder: EntityDecoder[BrandAccountCreate] = jsonOf[BrandAccountCreate]
  implicit val BrandAccountCreateEncoder: EntityEncoder[BrandAccountCreate] = jsonEncoderOf[BrandAccountCreate]
}
