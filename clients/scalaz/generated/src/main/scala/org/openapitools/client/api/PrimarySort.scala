package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PrimarySort._

case class PrimarySort (
  
object PrimarySort {
  import DateTimeCodecs._

  implicit val PrimarySortCodecJson: CodecJson[PrimarySort] = CodecJson.derive[PrimarySort]
  implicit val PrimarySortDecoder: EntityDecoder[PrimarySort] = jsonOf[PrimarySort]
  implicit val PrimarySortEncoder: EntityEncoder[PrimarySort] = jsonEncoderOf[PrimarySort]
}
