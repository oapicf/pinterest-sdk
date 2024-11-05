package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBusinessEmployers200Response._

case class GetBusinessEmployers200Response (
  /* List of employers. */
  items: List[UserBusinessRoleBinding],
bookmark: Option[String])

object GetBusinessEmployers200Response {
  import DateTimeCodecs._

  implicit val GetBusinessEmployers200ResponseCodecJson: CodecJson[GetBusinessEmployers200Response] = CodecJson.derive[GetBusinessEmployers200Response]
  implicit val GetBusinessEmployers200ResponseDecoder: EntityDecoder[GetBusinessEmployers200Response] = jsonOf[GetBusinessEmployers200Response]
  implicit val GetBusinessEmployers200ResponseEncoder: EntityEncoder[GetBusinessEmployers200Response] = jsonEncoderOf[GetBusinessEmployers200Response]
}
