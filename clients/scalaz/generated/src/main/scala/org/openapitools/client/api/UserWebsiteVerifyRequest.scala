package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserWebsiteVerifyRequest._

case class UserWebsiteVerifyRequest (
  website: Option[String],
verificationMethod: Option[VerificationMethod])

object UserWebsiteVerifyRequest {
  import DateTimeCodecs._
  sealed trait VerificationMethod
  case object FILENAME extends VerificationMethod
  case object METATAG extends VerificationMethod
  case object DNSTXT extends VerificationMethod

  object VerificationMethod {
    def toVerificationMethod(s: String): Option[VerificationMethod] = s match {
      case "FILENAME" => Some(FILENAME)
      case "METATAG" => Some(METATAG)
      case "DNSTXT" => Some(DNSTXT)
      case _ => None
    }

    def fromVerificationMethod(x: VerificationMethod): String = x match {
      case FILENAME => "FILENAME"
      case METATAG => "METATAG"
      case DNSTXT => "DNSTXT"
    }
  }

  implicit val VerificationMethodEnumEncoder: EncodeJson[VerificationMethod] =
    EncodeJson[VerificationMethod](is => StringEncodeJson(VerificationMethod.fromVerificationMethod(is)))

  implicit val VerificationMethodEnumDecoder: DecodeJson[VerificationMethod] =
    DecodeJson.optionDecoder[VerificationMethod](n => n.string.flatMap(jStr => VerificationMethod.toVerificationMethod(jStr)), "VerificationMethod failed to de-serialize")

  implicit val UserWebsiteVerifyRequestCodecJson: CodecJson[UserWebsiteVerifyRequest] = CodecJson.derive[UserWebsiteVerifyRequest]
  implicit val UserWebsiteVerifyRequestDecoder: EntityDecoder[UserWebsiteVerifyRequest] = jsonOf[UserWebsiteVerifyRequest]
  implicit val UserWebsiteVerifyRequestEncoder: EntityEncoder[UserWebsiteVerifyRequest] = jsonEncoderOf[UserWebsiteVerifyRequest]
}
