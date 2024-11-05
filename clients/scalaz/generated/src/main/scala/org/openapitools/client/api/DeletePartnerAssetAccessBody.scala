package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeletePartnerAssetAccessBody._

case class DeletePartnerAssetAccessBody (
  accesses: List[DeletePartnerAssetAccessBodyAccessesInner])

object DeletePartnerAssetAccessBody {
  import DateTimeCodecs._

  implicit val DeletePartnerAssetAccessBodyCodecJson: CodecJson[DeletePartnerAssetAccessBody] = CodecJson.derive[DeletePartnerAssetAccessBody]
  implicit val DeletePartnerAssetAccessBodyDecoder: EntityDecoder[DeletePartnerAssetAccessBody] = jsonOf[DeletePartnerAssetAccessBody]
  implicit val DeletePartnerAssetAccessBodyEncoder: EntityEncoder[DeletePartnerAssetAccessBody] = jsonEncoderOf[DeletePartnerAssetAccessBody]
}
