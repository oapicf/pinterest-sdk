package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LinkFilter._

case class LinkFilter (
  LINK: CatalogsProductGroupFilterOperatorTypeCriteria)

object LinkFilter {
  import DateTimeCodecs._

  implicit val LinkFilterCodecJson: CodecJson[LinkFilter] = CodecJson.derive[LinkFilter]
  implicit val LinkFilterDecoder: EntityDecoder[LinkFilter] = jsonOf[LinkFilter]
  implicit val LinkFilterEncoder: EntityEncoder[LinkFilter] = jsonEncoderOf[LinkFilter]
}
