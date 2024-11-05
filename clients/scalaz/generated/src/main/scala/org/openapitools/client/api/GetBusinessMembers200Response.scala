package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBusinessMembers200Response._

case class GetBusinessMembers200Response (
  /* List of business members. */
  items: List[UserBusinessRoleBinding],
bookmark: Option[String])

object GetBusinessMembers200Response {
  import DateTimeCodecs._

  implicit val GetBusinessMembers200ResponseCodecJson: CodecJson[GetBusinessMembers200Response] = CodecJson.derive[GetBusinessMembers200Response]
  implicit val GetBusinessMembers200ResponseDecoder: EntityDecoder[GetBusinessMembers200Response] = jsonOf[GetBusinessMembers200Response]
  implicit val GetBusinessMembers200ResponseEncoder: EntityEncoder[GetBusinessMembers200Response] = jsonEncoderOf[GetBusinessMembers200Response]
}
