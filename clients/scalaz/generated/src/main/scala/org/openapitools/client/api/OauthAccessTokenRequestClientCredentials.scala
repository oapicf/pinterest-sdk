package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OauthAccessTokenRequestClientCredentials._

case class OauthAccessTokenRequestClientCredentials (
  grantType: GrantType,
scope: String)

object OauthAccessTokenRequestClientCredentials {
  import DateTimeCodecs._
  sealed trait GrantType
  case object AuthorizationCode extends GrantType
  case object RefreshToken extends GrantType
  case object ClientCredentials extends GrantType

  object GrantType {
    def toGrantType(s: String): Option[GrantType] = s match {
      case "AuthorizationCode" => Some(AuthorizationCode)
      case "RefreshToken" => Some(RefreshToken)
      case "ClientCredentials" => Some(ClientCredentials)
      case _ => None
    }

    def fromGrantType(x: GrantType): String = x match {
      case AuthorizationCode => "AuthorizationCode"
      case RefreshToken => "RefreshToken"
      case ClientCredentials => "ClientCredentials"
    }
  }

  implicit val GrantTypeEnumEncoder: EncodeJson[GrantType] =
    EncodeJson[GrantType](is => StringEncodeJson(GrantType.fromGrantType(is)))

  implicit val GrantTypeEnumDecoder: DecodeJson[GrantType] =
    DecodeJson.optionDecoder[GrantType](n => n.string.flatMap(jStr => GrantType.toGrantType(jStr)), "GrantType failed to de-serialize")

  implicit val OauthAccessTokenRequestClientCredentialsCodecJson: CodecJson[OauthAccessTokenRequestClientCredentials] = CodecJson.derive[OauthAccessTokenRequestClientCredentials]
  implicit val OauthAccessTokenRequestClientCredentialsDecoder: EntityDecoder[OauthAccessTokenRequestClientCredentials] = jsonOf[OauthAccessTokenRequestClientCredentials]
  implicit val OauthAccessTokenRequestClientCredentialsEncoder: EntityEncoder[OauthAccessTokenRequestClientCredentials] = jsonEncoderOf[OauthAccessTokenRequestClientCredentials]
}
