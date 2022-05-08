package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OauthAccessTokenRequest._

case class OauthAccessTokenRequest (
  grantType: GrantType)

object OauthAccessTokenRequest {
  import DateTimeCodecs._
  sealed trait GrantType
  case object AuthorizationCode extends GrantType
  case object RefreshToken extends GrantType

  object GrantType {
    def toGrantType(s: String): Option[GrantType] = s match {
      case "AuthorizationCode" => Some(AuthorizationCode)
      case "RefreshToken" => Some(RefreshToken)
      case _ => None
    }

    def fromGrantType(x: GrantType): String = x match {
      case AuthorizationCode => "AuthorizationCode"
      case RefreshToken => "RefreshToken"
    }
  }

  implicit val GrantTypeEnumEncoder: EncodeJson[GrantType] =
    EncodeJson[GrantType](is => StringEncodeJson(GrantType.fromGrantType(is)))

  implicit val GrantTypeEnumDecoder: DecodeJson[GrantType] =
    DecodeJson.optionDecoder[GrantType](n => n.string.flatMap(jStr => GrantType.toGrantType(jStr)), "GrantType failed to de-serialize")

  implicit val OauthAccessTokenRequestCodecJson: CodecJson[OauthAccessTokenRequest] = CodecJson.derive[OauthAccessTokenRequest]
  implicit val OauthAccessTokenRequestDecoder: EntityDecoder[OauthAccessTokenRequest] = jsonOf[OauthAccessTokenRequest]
  implicit val OauthAccessTokenRequestEncoder: EntityEncoder[OauthAccessTokenRequest] = jsonEncoderOf[OauthAccessTokenRequest]
}
