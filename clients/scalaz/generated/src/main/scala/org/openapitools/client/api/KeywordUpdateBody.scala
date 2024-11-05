package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordUpdateBody._

case class KeywordUpdateBody (
  /* Keywords to update. Object array. Each object has 2 possible fields:<br>1. \"id\": (required) keyword ID<br>2. \"archived\": boolean. Should keyword be archived?<br>For example: [{\"id\":\"2886610576653\", \"archived\": false}, {\"id\":\"2886610576654\",  \"archived\": true}, ...] */
  keywords: List[KeywordUpdate])

object KeywordUpdateBody {
  import DateTimeCodecs._

  implicit val KeywordUpdateBodyCodecJson: CodecJson[KeywordUpdateBody] = CodecJson.derive[KeywordUpdateBody]
  implicit val KeywordUpdateBodyDecoder: EntityDecoder[KeywordUpdateBody] = jsonOf[KeywordUpdateBody]
  implicit val KeywordUpdateBodyEncoder: EntityEncoder[KeywordUpdateBody] = jsonEncoderOf[KeywordUpdateBody]
}
