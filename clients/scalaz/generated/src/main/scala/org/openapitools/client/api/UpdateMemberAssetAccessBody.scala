package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateMemberAssetAccessBody._

case class UpdateMemberAssetAccessBody (
  accesses: List[UpdateMemberAssetAccessBodyAccessesInner])

object UpdateMemberAssetAccessBody {
  import DateTimeCodecs._

  implicit val UpdateMemberAssetAccessBodyCodecJson: CodecJson[UpdateMemberAssetAccessBody] = CodecJson.derive[UpdateMemberAssetAccessBody]
  implicit val UpdateMemberAssetAccessBodyDecoder: EntityDecoder[UpdateMemberAssetAccessBody] = jsonOf[UpdateMemberAssetAccessBody]
  implicit val UpdateMemberAssetAccessBodyEncoder: EntityEncoder[UpdateMemberAssetAccessBody] = jsonEncoderOf[UpdateMemberAssetAccessBody]
}
