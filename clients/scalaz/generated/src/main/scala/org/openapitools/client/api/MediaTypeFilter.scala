package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MediaTypeFilter._

case class MediaTypeFilter (
  MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria)

object MediaTypeFilter {
  import DateTimeCodecs._

  implicit val MediaTypeFilterCodecJson: CodecJson[MediaTypeFilter] = CodecJson.derive[MediaTypeFilter]
  implicit val MediaTypeFilterDecoder: EntityDecoder[MediaTypeFilter] = jsonOf[MediaTypeFilter]
  implicit val MediaTypeFilterEncoder: EntityEncoder[MediaTypeFilter] = jsonEncoderOf[MediaTypeFilter]
}
