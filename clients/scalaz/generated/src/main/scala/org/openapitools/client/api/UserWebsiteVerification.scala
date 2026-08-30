package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserWebsiteVerification._

case class UserWebsiteVerification (
  /* DNS TXT record to check against for the website to be claimed */
  dnsTxtRecord: Option[String],
/* A full html file to upload to the website in order for it to be claimed */
  fileContent: Option[String],
/* File expected to find on the website being claimed */
  filename: Option[String],
/* Metatag the verification process searchs for the website to be claimed */
  metatag: Option[String],
/* Code to check against the user claiming the website */
  verificationCode: Option[String])

object UserWebsiteVerification {
  import DateTimeCodecs._

  implicit val UserWebsiteVerificationCodecJson: CodecJson[UserWebsiteVerification] = CodecJson.derive[UserWebsiteVerification]
  implicit val UserWebsiteVerificationDecoder: EntityDecoder[UserWebsiteVerification] = jsonOf[UserWebsiteVerification]
  implicit val UserWebsiteVerificationEncoder: EntityEncoder[UserWebsiteVerification] = jsonEncoderOf[UserWebsiteVerification]
}
