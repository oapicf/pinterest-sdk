package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FormFactor._

case class FormFactor (
  
object FormFactor {
  import DateTimeCodecs._

  implicit val FormFactorCodecJson: CodecJson[FormFactor] = CodecJson.derive[FormFactor]
  implicit val FormFactorDecoder: EntityDecoder[FormFactor] = jsonOf[FormFactor]
  implicit val FormFactorEncoder: EntityEncoder[FormFactor] = jsonEncoderOf[FormFactor]
}
