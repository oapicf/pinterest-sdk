package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordInfo._

case class KeywordInfo (
  /* Keyword Name */
  name: String,
/* MoM growth as a percentage, if there is no growth rate, this field is not present */
  pctGrowthMom: Option[BigDecimal])

object KeywordInfo {
  import DateTimeCodecs._

  implicit val KeywordInfoCodecJson: CodecJson[KeywordInfo] = CodecJson.derive[KeywordInfo]
  implicit val KeywordInfoDecoder: EntityDecoder[KeywordInfo] = jsonOf[KeywordInfo]
  implicit val KeywordInfoEncoder: EntityEncoder[KeywordInfo] = jsonEncoderOf[KeywordInfo]
}
