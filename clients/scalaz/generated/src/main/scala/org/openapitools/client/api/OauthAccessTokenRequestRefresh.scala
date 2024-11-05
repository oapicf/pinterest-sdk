package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OauthAccessTokenRequestRefresh._

case class OauthAccessTokenRequestRefresh (
  grantType: GrantType,
refreshToken: String,
scope: Option[String],
/* Setting this field to <code>true</code> will add a new refresh token to your 200 response, as well as the refresh_token_expires_in and refresh_token_expires_at fields. To see the structure of this payload, set the 200 response_type to \"everlasting_refresh\". */
  refreshOn: Option[Boolean])

object OauthAccessTokenRequestRefresh {
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

  implicit val OauthAccessTokenRequestRefreshCodecJson: CodecJson[OauthAccessTokenRequestRefresh] = CodecJson.derive[OauthAccessTokenRequestRefresh]
  implicit val OauthAccessTokenRequestRefreshDecoder: EntityDecoder[OauthAccessTokenRequestRefresh] = jsonOf[OauthAccessTokenRequestRefresh]
  implicit val OauthAccessTokenRequestRefreshEncoder: EntityEncoder[OauthAccessTokenRequestRefresh] = jsonEncoderOf[OauthAccessTokenRequestRefresh]
}
