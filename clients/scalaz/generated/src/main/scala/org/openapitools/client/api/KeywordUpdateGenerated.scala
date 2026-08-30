package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordUpdateGenerated._

case class KeywordUpdateGenerated (
  /* Is keyword archived? */
  archived: Option[Boolean],
/* </p><strong>Note:</strong> bid field has been deprecated. Input will not be set and field will return null. Keyword custom bid in microcurrency - null if inherited from parent ad group. */
  bid: Option[Integer],
/* Keyword ID. */
  id: String)

object KeywordUpdateGenerated {
  import DateTimeCodecs._

  implicit val KeywordUpdateGeneratedCodecJson: CodecJson[KeywordUpdateGenerated] = CodecJson.derive[KeywordUpdateGenerated]
  implicit val KeywordUpdateGeneratedDecoder: EntityDecoder[KeywordUpdateGenerated] = jsonOf[KeywordUpdateGenerated]
  implicit val KeywordUpdateGeneratedEncoder: EntityEncoder[KeywordUpdateGenerated] = jsonEncoderOf[KeywordUpdateGenerated]
}
