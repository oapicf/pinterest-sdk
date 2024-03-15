package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupAudienceSizingRequestKeywordsInner._

case class AdGroupAudienceSizingRequestKeywordsInner (
  matchType: MatchTypeResponse,
/* Keyword value (120 chars max). */
  value: String)

object AdGroupAudienceSizingRequestKeywordsInner {
  import DateTimeCodecs._

  implicit val AdGroupAudienceSizingRequestKeywordsInnerCodecJson: CodecJson[AdGroupAudienceSizingRequestKeywordsInner] = CodecJson.derive[AdGroupAudienceSizingRequestKeywordsInner]
  implicit val AdGroupAudienceSizingRequestKeywordsInnerDecoder: EntityDecoder[AdGroupAudienceSizingRequestKeywordsInner] = jsonOf[AdGroupAudienceSizingRequestKeywordsInner]
  implicit val AdGroupAudienceSizingRequestKeywordsInnerEncoder: EntityEncoder[AdGroupAudienceSizingRequestKeywordsInner] = jsonEncoderOf[AdGroupAudienceSizingRequestKeywordsInner]
}
