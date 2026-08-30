package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteBusinessMembershipBody._

case class DeleteBusinessMembershipBody (
  members: List[DeleteBusinessMembershipMember])

object DeleteBusinessMembershipBody {
  import DateTimeCodecs._

  implicit val DeleteBusinessMembershipBodyCodecJson: CodecJson[DeleteBusinessMembershipBody] = CodecJson.derive[DeleteBusinessMembershipBody]
  implicit val DeleteBusinessMembershipBodyDecoder: EntityDecoder[DeleteBusinessMembershipBody] = jsonOf[DeleteBusinessMembershipBody]
  implicit val DeleteBusinessMembershipBodyEncoder: EntityEncoder[DeleteBusinessMembershipBody] = jsonEncoderOf[DeleteBusinessMembershipBody]
}
