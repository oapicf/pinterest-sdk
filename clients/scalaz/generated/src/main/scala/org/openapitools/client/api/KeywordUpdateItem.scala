package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordUpdateItem._

case class KeywordUpdateItem (
  archived: Option[Boolean],
/* **Note:** bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
  bid: Option[Integer],
/* Keyword ID . */
  id: String)

object KeywordUpdateItem {
  import DateTimeCodecs._

  implicit val KeywordUpdateItemCodecJson: CodecJson[KeywordUpdateItem] = CodecJson.derive[KeywordUpdateItem]
  implicit val KeywordUpdateItemDecoder: EntityDecoder[KeywordUpdateItem] = jsonOf[KeywordUpdateItem]
  implicit val KeywordUpdateItemEncoder: EntityEncoder[KeywordUpdateItem] = jsonEncoderOf[KeywordUpdateItem]
}
