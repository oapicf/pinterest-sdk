package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Keyword._

case class Keyword (
  archived: Option[Boolean],
/* **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
  bid: Option[Integer],
/* Keyword ID . */
  id: String,
/* Keyword [match type](/docs/api-features/targeting-overview/) */
  matchType: MatchType,
/* Keyword parent entity ID (advertiser, campaign, ad group). */
  parentId: String,
/* Parent entity type (advertiser, campaign, ad group). */
  parentType: Option[String],
/* Always keyword */
  `type`: Option[String],
/* Keyword value (120 chars max). */
  value: String)

object Keyword {
  import DateTimeCodecs._

  implicit val KeywordCodecJson: CodecJson[Keyword] = CodecJson.derive[Keyword]
  implicit val KeywordDecoder: EntityDecoder[Keyword] = jsonOf[Keyword]
  implicit val KeywordEncoder: EntityEncoder[Keyword] = jsonEncoderOf[Keyword]
}
