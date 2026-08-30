package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsAiContentDisclosureLabel._

case class CatalogsAiContentDisclosureLabel (
  
object CatalogsAiContentDisclosureLabel {
  import DateTimeCodecs._

  implicit val CatalogsAiContentDisclosureLabelCodecJson: CodecJson[CatalogsAiContentDisclosureLabel] = CodecJson.derive[CatalogsAiContentDisclosureLabel]
  implicit val CatalogsAiContentDisclosureLabelDecoder: EntityDecoder[CatalogsAiContentDisclosureLabel] = jsonOf[CatalogsAiContentDisclosureLabel]
  implicit val CatalogsAiContentDisclosureLabelEncoder: EntityEncoder[CatalogsAiContentDisclosureLabel] = jsonEncoderOf[CatalogsAiContentDisclosureLabel]
}
