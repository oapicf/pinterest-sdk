package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsStatus._

case class CatalogsStatus (
  
object CatalogsStatus {
  import DateTimeCodecs._

  implicit val CatalogsStatusCodecJson: CodecJson[CatalogsStatus] = CodecJson.derive[CatalogsStatus]
  implicit val CatalogsStatusDecoder: EntityDecoder[CatalogsStatus] = jsonOf[CatalogsStatus]
  implicit val CatalogsStatusEncoder: EntityEncoder[CatalogsStatus] = jsonEncoderOf[CatalogsStatus]
}
