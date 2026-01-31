package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BrandAccountsCreateRequest._

case class BrandAccountsCreateRequest (
  /* Brand Account name */
  name: String,
/* Brand Account username */
  username: String,
country: Country,
/* Brand Account about information */
  about: Option[String],
/* Brand Account website */
  website: Option[String],
profileImage: Option[ImageBase64])

object BrandAccountsCreateRequest {
  import DateTimeCodecs._

  implicit val BrandAccountsCreateRequestCodecJson: CodecJson[BrandAccountsCreateRequest] = CodecJson.derive[BrandAccountsCreateRequest]
  implicit val BrandAccountsCreateRequestDecoder: EntityDecoder[BrandAccountsCreateRequest] = jsonOf[BrandAccountsCreateRequest]
  implicit val BrandAccountsCreateRequestEncoder: EntityEncoder[BrandAccountsCreateRequest] = jsonEncoderOf[BrandAccountsCreateRequest]
}
