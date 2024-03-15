package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationLogClientRequest._

case class IntegrationLogClientRequest (
  method: Method,
/* HTTP request host from host header. */
  host: String,
/* HTTP request path. */
  `path`: String,
/* HTTP request headers as key-value pairs. */
  requestHeaders: Option[Map[String, String]],
/* HTTP response headers as key-value pairs. */
  responseHeaders: Option[Map[String, String]],
responseStatusCode: Option[Integer])

object IntegrationLogClientRequest {
  import DateTimeCodecs._
  sealed trait Method
  case object GET extends Method
  case object HEAD extends Method
  case object POST extends Method
  case object PUT extends Method
  case object DELETE extends Method
  case object CONNECT extends Method
  case object OPTIONS extends Method
  case object TRACE extends Method
  case object PATCH extends Method

  object Method {
    def toMethod(s: String): Option[Method] = s match {
      case "GET" => Some(GET)
      case "HEAD" => Some(HEAD)
      case "POST" => Some(POST)
      case "PUT" => Some(PUT)
      case "DELETE" => Some(DELETE)
      case "CONNECT" => Some(CONNECT)
      case "OPTIONS" => Some(OPTIONS)
      case "TRACE" => Some(TRACE)
      case "PATCH" => Some(PATCH)
      case _ => None
    }

    def fromMethod(x: Method): String = x match {
      case GET => "GET"
      case HEAD => "HEAD"
      case POST => "POST"
      case PUT => "PUT"
      case DELETE => "DELETE"
      case CONNECT => "CONNECT"
      case OPTIONS => "OPTIONS"
      case TRACE => "TRACE"
      case PATCH => "PATCH"
    }
  }

  implicit val MethodEnumEncoder: EncodeJson[Method] =
    EncodeJson[Method](is => StringEncodeJson(Method.fromMethod(is)))

  implicit val MethodEnumDecoder: DecodeJson[Method] =
    DecodeJson.optionDecoder[Method](n => n.string.flatMap(jStr => Method.toMethod(jStr)), "Method failed to de-serialize")

  implicit val IntegrationLogClientRequestCodecJson: CodecJson[IntegrationLogClientRequest] = CodecJson.derive[IntegrationLogClientRequest]
  implicit val IntegrationLogClientRequestDecoder: EntityDecoder[IntegrationLogClientRequest] = jsonOf[IntegrationLogClientRequest]
  implicit val IntegrationLogClientRequestEncoder: EntityEncoder[IntegrationLogClientRequest] = jsonEncoderOf[IntegrationLogClientRequest]
}
