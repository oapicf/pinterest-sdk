package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordsRequest._

case class KeywordsRequest (
  /* Keyword JSON array. Each array element has 3 fields */
  keywords: List[KeywordsCommon],
/* Keyword parent entity ID (advertiser, campaign, ad group). */
  parentId: String)

object KeywordsRequest {
  import DateTimeCodecs._

  implicit val KeywordsRequestCodecJson: CodecJson[KeywordsRequest] = CodecJson.derive[KeywordsRequest]
  implicit val KeywordsRequestDecoder: EntityDecoder[KeywordsRequest] = jsonOf[KeywordsRequest]
  implicit val KeywordsRequestEncoder: EntityEncoder[KeywordsRequest] = jsonEncoderOf[KeywordsRequest]
}
