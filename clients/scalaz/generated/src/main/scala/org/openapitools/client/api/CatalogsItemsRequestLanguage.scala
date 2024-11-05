package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemsRequestLanguage._

case class CatalogsItemsRequestLanguage (
  
object CatalogsItemsRequestLanguage {
  import DateTimeCodecs._

  implicit val CatalogsItemsRequestLanguageCodecJson: CodecJson[CatalogsItemsRequestLanguage] = CodecJson.derive[CatalogsItemsRequestLanguage]
  implicit val CatalogsItemsRequestLanguageDecoder: EntityDecoder[CatalogsItemsRequestLanguage] = jsonOf[CatalogsItemsRequestLanguage]
  implicit val CatalogsItemsRequestLanguageEncoder: EntityEncoder[CatalogsItemsRequestLanguage] = jsonEncoderOf[CatalogsItemsRequestLanguage]
}
