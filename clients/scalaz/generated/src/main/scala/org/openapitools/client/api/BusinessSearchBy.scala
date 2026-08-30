package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessSearchBy._

case class BusinessSearchBy (
  
object BusinessSearchBy {
  import DateTimeCodecs._

  implicit val BusinessSearchByCodecJson: CodecJson[BusinessSearchBy] = CodecJson.derive[BusinessSearchBy]
  implicit val BusinessSearchByDecoder: EntityDecoder[BusinessSearchBy] = jsonOf[BusinessSearchBy]
  implicit val BusinessSearchByEncoder: EntityEncoder[BusinessSearchBy] = jsonEncoderOf[BusinessSearchBy]
}
