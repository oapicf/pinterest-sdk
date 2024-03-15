package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupStatus._

case class CatalogsProductGroupStatus (
  
object CatalogsProductGroupStatus {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupStatusCodecJson: CodecJson[CatalogsProductGroupStatus] = CodecJson.derive[CatalogsProductGroupStatus]
  implicit val CatalogsProductGroupStatusDecoder: EntityDecoder[CatalogsProductGroupStatus] = jsonOf[CatalogsProductGroupStatus]
  implicit val CatalogsProductGroupStatusEncoder: EntityEncoder[CatalogsProductGroupStatus] = jsonEncoderOf[CatalogsProductGroupStatus]
}
