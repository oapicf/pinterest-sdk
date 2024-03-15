package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordUpdate._

case class KeywordUpdate (
  /* Keyword ID. */
  id: String,
/* Is keyword archived? */
  archived: Option[Boolean],
/* Keyword custom bid in microcurrency - null if inherited from parent ad group. */
  bid: Option[Integer])

object KeywordUpdate {
  import DateTimeCodecs._

  implicit val KeywordUpdateCodecJson: CodecJson[KeywordUpdate] = CodecJson.derive[KeywordUpdate]
  implicit val KeywordUpdateDecoder: EntityDecoder[KeywordUpdate] = jsonOf[KeywordUpdate]
  implicit val KeywordUpdateEncoder: EntityEncoder[KeywordUpdate] = jsonEncoderOf[KeywordUpdate]
}
