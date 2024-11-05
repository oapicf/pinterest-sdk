package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Keyword._

case class Keyword (
  /* </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
  bid: Option[Integer],
matchType: MatchTypeResponse,
/* Keyword value (120 chars max). */
  value: String,
archived: Option[Boolean],
/* Keyword ID . */
  id: Option[String],
/* Keyword parent entity ID (advertiser, campaign, ad group). */
  parentId: Option[String],
/* Parent entity type */
  parentType: Option[String],
/* Always keyword */
  `type`: Option[String])

object Keyword {
  import DateTimeCodecs._

  implicit val KeywordCodecJson: CodecJson[Keyword] = CodecJson.derive[Keyword]
  implicit val KeywordDecoder: EntityDecoder[Keyword] = jsonOf[Keyword]
  implicit val KeywordEncoder: EntityEncoder[Keyword] = jsonEncoderOf[Keyword]
}
