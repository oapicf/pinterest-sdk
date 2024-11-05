package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBusinessPartners200Response._

case class GetBusinessPartners200Response (
  /* List of business partners. */
  items: List[UserBusinessRoleBinding],
bookmark: Option[String])

object GetBusinessPartners200Response {
  import DateTimeCodecs._

  implicit val GetBusinessPartners200ResponseCodecJson: CodecJson[GetBusinessPartners200Response] = CodecJson.derive[GetBusinessPartners200Response]
  implicit val GetBusinessPartners200ResponseDecoder: EntityDecoder[GetBusinessPartners200Response] = jsonOf[GetBusinessPartners200Response]
  implicit val GetBusinessPartners200ResponseEncoder: EntityEncoder[GetBusinessPartners200Response] = jsonEncoderOf[GetBusinessPartners200Response]
}
