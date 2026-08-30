package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateBusinessMembershipsResponse._

case class UpdateBusinessMembershipsResponse (
  /* List of members with updated business access role. */
  items: Option[List[BusinessMembershipMember]])

object UpdateBusinessMembershipsResponse {
  import DateTimeCodecs._

  implicit val UpdateBusinessMembershipsResponseCodecJson: CodecJson[UpdateBusinessMembershipsResponse] = CodecJson.derive[UpdateBusinessMembershipsResponse]
  implicit val UpdateBusinessMembershipsResponseDecoder: EntityDecoder[UpdateBusinessMembershipsResponse] = jsonOf[UpdateBusinessMembershipsResponse]
  implicit val UpdateBusinessMembershipsResponseEncoder: EntityEncoder[UpdateBusinessMembershipsResponse] = jsonEncoderOf[UpdateBusinessMembershipsResponse]
}
