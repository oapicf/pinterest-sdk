package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Keywords._

case class Keywords (
  /* Keyword error */
  errors: List[KeywordError],
/* Keywords */
  keywords: List[Keyword])

object Keywords {
  import DateTimeCodecs._

  implicit val KeywordsCodecJson: CodecJson[Keywords] = CodecJson.derive[Keywords]
  implicit val KeywordsDecoder: EntityDecoder[Keywords] = jsonOf[Keywords]
  implicit val KeywordsEncoder: EntityEncoder[Keywords] = jsonEncoderOf[Keywords]
}
