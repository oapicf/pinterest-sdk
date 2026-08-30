package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationLogClientRequest._

case class IntegrationLogClientRequest (
  /* HTTP request host from host header. */
  host: String,
method: HttpMethod,
/* HTTP request path. */
  `path`: String,
/* HTTP request headers as key-value pairs. */
  requestHeaders: Option[Map[String, String]],
/* HTTP response headers as key-value pairs. */
  responseHeaders: Option[Map[String, String]],
responseStatusCode: Option[Integer])

object IntegrationLogClientRequest {
  import DateTimeCodecs._

  implicit val IntegrationLogClientRequestCodecJson: CodecJson[IntegrationLogClientRequest] = CodecJson.derive[IntegrationLogClientRequest]
  implicit val IntegrationLogClientRequestDecoder: EntityDecoder[IntegrationLogClientRequest] = jsonOf[IntegrationLogClientRequest]
  implicit val IntegrationLogClientRequestEncoder: EntityEncoder[IntegrationLogClientRequest] = jsonEncoderOf[IntegrationLogClientRequest]
}
