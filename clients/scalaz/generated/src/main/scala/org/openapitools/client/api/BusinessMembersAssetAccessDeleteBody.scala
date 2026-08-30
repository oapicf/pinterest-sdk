package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessMembersAssetAccessDeleteBody._

case class BusinessMembersAssetAccessDeleteBody (
  /* List of members asset access to be deleted */
  accesses: List[DeleteMemberAssetAccessItem])

object BusinessMembersAssetAccessDeleteBody {
  import DateTimeCodecs._

  implicit val BusinessMembersAssetAccessDeleteBodyCodecJson: CodecJson[BusinessMembersAssetAccessDeleteBody] = CodecJson.derive[BusinessMembersAssetAccessDeleteBody]
  implicit val BusinessMembersAssetAccessDeleteBodyDecoder: EntityDecoder[BusinessMembersAssetAccessDeleteBody] = jsonOf[BusinessMembersAssetAccessDeleteBody]
  implicit val BusinessMembersAssetAccessDeleteBodyEncoder: EntityEncoder[BusinessMembersAssetAccessDeleteBody] = jsonEncoderOf[BusinessMembersAssetAccessDeleteBody]
}
