package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationsGetList200Response._

case class IntegrationsGetList200Response (
  items: List[IntegrationRecord],
bookmark: Option[String])

object IntegrationsGetList200Response {
  import DateTimeCodecs._

  implicit val IntegrationsGetList200ResponseCodecJson: CodecJson[IntegrationsGetList200Response] = CodecJson.derive[IntegrationsGetList200Response]
  implicit val IntegrationsGetList200ResponseDecoder: EntityDecoder[IntegrationsGetList200Response] = jsonOf[IntegrationsGetList200Response]
  implicit val IntegrationsGetList200ResponseEncoder: EntityEncoder[IntegrationsGetList200Response] = jsonEncoderOf[IntegrationsGetList200Response]
}
