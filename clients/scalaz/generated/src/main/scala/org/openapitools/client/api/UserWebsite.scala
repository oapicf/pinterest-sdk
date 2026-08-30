package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserWebsite._

case class UserWebsite (
  /* Status of the verification process */
  status: Option[String],
/* UTC timestamp when the verification happened - sometimes missing */
  verifiedAt: Option[String],
/* Website with path or domain only */
  website: Option[String])

object UserWebsite {
  import DateTimeCodecs._

  implicit val UserWebsiteCodecJson: CodecJson[UserWebsite] = CodecJson.derive[UserWebsite]
  implicit val UserWebsiteDecoder: EntityDecoder[UserWebsite] = jsonOf[UserWebsite]
  implicit val UserWebsiteEncoder: EntityEncoder[UserWebsite] = jsonEncoderOf[UserWebsite]
}
