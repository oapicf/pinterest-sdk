package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserWebsitesGet200Response._

case class UserWebsitesGet200Response (
  items: List[UserWebsiteSummary],
bookmark: Option[String])

object UserWebsitesGet200Response {
  import DateTimeCodecs._

  implicit val UserWebsitesGet200ResponseCodecJson: CodecJson[UserWebsitesGet200Response] = CodecJson.derive[UserWebsitesGet200Response]
  implicit val UserWebsitesGet200ResponseDecoder: EntityDecoder[UserWebsitesGet200Response] = jsonOf[UserWebsitesGet200Response]
  implicit val UserWebsitesGet200ResponseEncoder: EntityEncoder[UserWebsitesGet200Response] = jsonEncoderOf[UserWebsitesGet200Response]
}
