package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordCreateItem._

case class KeywordCreateItem (
  /* **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
  bid: Option[Integer],
/* Keyword [match type](/docs/api-features/targeting-overview/) */
  matchType: MatchType,
/* Keyword value (120 chars max). */
  value: String)

object KeywordCreateItem {
  import DateTimeCodecs._

  implicit val KeywordCreateItemCodecJson: CodecJson[KeywordCreateItem] = CodecJson.derive[KeywordCreateItem]
  implicit val KeywordCreateItemDecoder: EntityDecoder[KeywordCreateItem] = jsonOf[KeywordCreateItem]
  implicit val KeywordCreateItemEncoder: EntityEncoder[KeywordCreateItem] = jsonEncoderOf[KeywordCreateItem]
}
