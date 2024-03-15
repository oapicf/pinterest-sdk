package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordsCommon._

case class KeywordsCommon (
  /* Keyword custom bid in microcurrency - null if inherited from parent ad group. */
  bid: Option[Integer],
matchType: MatchTypeResponse,
/* Keyword value (120 chars max). */
  value: String)

object KeywordsCommon {
  import DateTimeCodecs._

  implicit val KeywordsCommonCodecJson: CodecJson[KeywordsCommon] = CodecJson.derive[KeywordsCommon]
  implicit val KeywordsCommonDecoder: EntityDecoder[KeywordsCommon] = jsonOf[KeywordsCommon]
  implicit val KeywordsCommonEncoder: EntityEncoder[KeywordsCommon] = jsonEncoderOf[KeywordsCommon]
}
