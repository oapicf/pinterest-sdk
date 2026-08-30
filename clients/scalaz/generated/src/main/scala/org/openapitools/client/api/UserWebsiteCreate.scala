package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserWebsiteCreate._

case class UserWebsiteCreate (
  /* Method used to verify website ownership. */
  verificationMethod: Option[WebsiteVerificationMethod],
/* Website with path or domain only */
  website: Option[String])

object UserWebsiteCreate {
  import DateTimeCodecs._

  implicit val UserWebsiteCreateCodecJson: CodecJson[UserWebsiteCreate] = CodecJson.derive[UserWebsiteCreate]
  implicit val UserWebsiteCreateDecoder: EntityDecoder[UserWebsiteCreate] = jsonOf[UserWebsiteCreate]
  implicit val UserWebsiteCreateEncoder: EntityEncoder[UserWebsiteCreate] = jsonEncoderOf[UserWebsiteCreate]
}
