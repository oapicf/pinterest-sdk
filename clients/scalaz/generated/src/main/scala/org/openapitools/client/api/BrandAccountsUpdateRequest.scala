package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BrandAccountsUpdateRequest._

case class BrandAccountsUpdateRequest (
  /* Brand Account name */
  name: Option[String],
/* Brand Account username */
  username: Option[String],
country: Option[Country],
/* Brand Account about information */
  about: Option[String],
/* Brand Account website */
  website: Option[String],
profileImage: Option[ImageBase64])

object BrandAccountsUpdateRequest {
  import DateTimeCodecs._

  implicit val BrandAccountsUpdateRequestCodecJson: CodecJson[BrandAccountsUpdateRequest] = CodecJson.derive[BrandAccountsUpdateRequest]
  implicit val BrandAccountsUpdateRequestDecoder: EntityDecoder[BrandAccountsUpdateRequest] = jsonOf[BrandAccountsUpdateRequest]
  implicit val BrandAccountsUpdateRequestEncoder: EntityEncoder[BrandAccountsUpdateRequest] = jsonEncoderOf[BrandAccountsUpdateRequest]
}
