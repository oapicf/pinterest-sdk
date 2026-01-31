package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TitleKeywordsFilter._

case class TitleKeywordsFilter (
  TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria)

object TitleKeywordsFilter {
  import DateTimeCodecs._

  implicit val TitleKeywordsFilterCodecJson: CodecJson[TitleKeywordsFilter] = CodecJson.derive[TitleKeywordsFilter]
  implicit val TitleKeywordsFilterDecoder: EntityDecoder[TitleKeywordsFilter] = jsonOf[TitleKeywordsFilter]
  implicit val TitleKeywordsFilterEncoder: EntityEncoder[TitleKeywordsFilter] = jsonEncoderOf[TitleKeywordsFilter]
}
