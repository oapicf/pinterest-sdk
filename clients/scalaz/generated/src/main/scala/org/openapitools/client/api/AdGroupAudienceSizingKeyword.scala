package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupAudienceSizingKeyword._

case class AdGroupAudienceSizingKeyword (
  matchType: MatchType,
/* Keyword value (120 chars max). */
  value: String)

object AdGroupAudienceSizingKeyword {
  import DateTimeCodecs._

  implicit val AdGroupAudienceSizingKeywordCodecJson: CodecJson[AdGroupAudienceSizingKeyword] = CodecJson.derive[AdGroupAudienceSizingKeyword]
  implicit val AdGroupAudienceSizingKeywordDecoder: EntityDecoder[AdGroupAudienceSizingKeyword] = jsonOf[AdGroupAudienceSizingKeyword]
  implicit val AdGroupAudienceSizingKeywordEncoder: EntityEncoder[AdGroupAudienceSizingKeyword] = jsonEncoderOf[AdGroupAudienceSizingKeyword]
}
