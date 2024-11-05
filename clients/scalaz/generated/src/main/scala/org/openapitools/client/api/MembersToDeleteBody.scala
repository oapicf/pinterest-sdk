package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MembersToDeleteBody._

case class MembersToDeleteBody (
  members: List[MembersToDeleteBodyMembersInner])

object MembersToDeleteBody {
  import DateTimeCodecs._

  implicit val MembersToDeleteBodyCodecJson: CodecJson[MembersToDeleteBody] = CodecJson.derive[MembersToDeleteBody]
  implicit val MembersToDeleteBodyDecoder: EntityDecoder[MembersToDeleteBody] = jsonOf[MembersToDeleteBody]
  implicit val MembersToDeleteBodyEncoder: EntityEncoder[MembersToDeleteBody] = jsonEncoderOf[MembersToDeleteBody]
}
