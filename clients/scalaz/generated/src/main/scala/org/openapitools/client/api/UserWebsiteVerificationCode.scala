package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserWebsiteVerificationCode._

case class UserWebsiteVerificationCode (
  /* Code to check against the user claiming the website */
  verificationCode: Option[String],
/* DNS TXT record to check against for the website to be claimed */
  dnsTxtRecord: Option[String],
/* Metatag the verification process searchs for the website to be claimed */
  metatag: Option[String],
/* File expected to find on the website being claimed */
  filename: Option[String],
/* A full html file to upload to the website in order for it to be claimed */
  fileContent: Option[String])

object UserWebsiteVerificationCode {
  import DateTimeCodecs._

  implicit val UserWebsiteVerificationCodeCodecJson: CodecJson[UserWebsiteVerificationCode] = CodecJson.derive[UserWebsiteVerificationCode]
  implicit val UserWebsiteVerificationCodeDecoder: EntityDecoder[UserWebsiteVerificationCode] = jsonOf[UserWebsiteVerificationCode]
  implicit val UserWebsiteVerificationCodeEncoder: EntityEncoder[UserWebsiteVerificationCode] = jsonEncoderOf[UserWebsiteVerificationCode]
}
