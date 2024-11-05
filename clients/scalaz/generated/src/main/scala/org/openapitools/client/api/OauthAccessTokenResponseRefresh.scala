package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OauthAccessTokenResponseRefresh._

case class OauthAccessTokenResponseRefresh (
  responseType: Option[ResponseType],
accessToken: String,
tokenType: String,
expiresIn: Integer,
scope: String)

object OauthAccessTokenResponseRefresh {
  import DateTimeCodecs._
  sealed trait ResponseType
  case object AuthorizationCode extends ResponseType
  case object RefreshToken extends ResponseType
  case object ClientCredentials extends ResponseType

  object ResponseType {
    def toResponseType(s: String): Option[ResponseType] = s match {
      case "AuthorizationCode" => Some(AuthorizationCode)
      case "RefreshToken" => Some(RefreshToken)
      case "ClientCredentials" => Some(ClientCredentials)
      case _ => None
    }

    def fromResponseType(x: ResponseType): String = x match {
      case AuthorizationCode => "AuthorizationCode"
      case RefreshToken => "RefreshToken"
      case ClientCredentials => "ClientCredentials"
    }
  }

  implicit val ResponseTypeEnumEncoder: EncodeJson[ResponseType] =
    EncodeJson[ResponseType](is => StringEncodeJson(ResponseType.fromResponseType(is)))

  implicit val ResponseTypeEnumDecoder: DecodeJson[ResponseType] =
    DecodeJson.optionDecoder[ResponseType](n => n.string.flatMap(jStr => ResponseType.toResponseType(jStr)), "ResponseType failed to de-serialize")

  implicit val OauthAccessTokenResponseRefreshCodecJson: CodecJson[OauthAccessTokenResponseRefresh] = CodecJson.derive[OauthAccessTokenResponseRefresh]
  implicit val OauthAccessTokenResponseRefreshDecoder: EntityDecoder[OauthAccessTokenResponseRefresh] = jsonOf[OauthAccessTokenResponseRefresh]
  implicit val OauthAccessTokenResponseRefreshEncoder: EntityEncoder[OauthAccessTokenResponseRefresh] = jsonEncoderOf[OauthAccessTokenResponseRefresh]
}
