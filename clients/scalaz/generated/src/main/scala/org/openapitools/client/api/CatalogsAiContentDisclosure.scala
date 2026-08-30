package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsAiContentDisclosure._

case class CatalogsAiContentDisclosure (
  /* Disclosure labels that apply to this asset. */
  disclosure: List[CatalogsAiContentDisclosureLabel],
/* URL of the asset. Must match one of image_link, additional_image_link, or video_link. */
  url: String)

object CatalogsAiContentDisclosure {
  import DateTimeCodecs._

  implicit val CatalogsAiContentDisclosureCodecJson: CodecJson[CatalogsAiContentDisclosure] = CodecJson.derive[CatalogsAiContentDisclosure]
  implicit val CatalogsAiContentDisclosureDecoder: EntityDecoder[CatalogsAiContentDisclosure] = jsonOf[CatalogsAiContentDisclosure]
  implicit val CatalogsAiContentDisclosureEncoder: EntityEncoder[CatalogsAiContentDisclosure] = jsonEncoderOf[CatalogsAiContentDisclosure]
}
