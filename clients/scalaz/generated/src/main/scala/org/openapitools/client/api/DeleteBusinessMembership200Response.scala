package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteBusinessMembership200Response._

case class DeleteBusinessMembership200Response (
  deletedMembers: Option[List[String]])

object DeleteBusinessMembership200Response {
  import DateTimeCodecs._

  implicit val DeleteBusinessMembership200ResponseCodecJson: CodecJson[DeleteBusinessMembership200Response] = CodecJson.derive[DeleteBusinessMembership200Response]
  implicit val DeleteBusinessMembership200ResponseDecoder: EntityDecoder[DeleteBusinessMembership200Response] = jsonOf[DeleteBusinessMembership200Response]
  implicit val DeleteBusinessMembership200ResponseEncoder: EntityEncoder[DeleteBusinessMembership200Response] = jsonEncoderOf[DeleteBusinessMembership200Response]
}
