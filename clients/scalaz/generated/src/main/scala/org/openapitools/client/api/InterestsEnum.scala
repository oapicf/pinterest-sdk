package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InterestsEnum._

case class InterestsEnum (
  
object InterestsEnum {
  import DateTimeCodecs._

  implicit val InterestsEnumCodecJson: CodecJson[InterestsEnum] = CodecJson.derive[InterestsEnum]
  implicit val InterestsEnumDecoder: EntityDecoder[InterestsEnum] = jsonOf[InterestsEnum]
  implicit val InterestsEnumEncoder: EntityEncoder[InterestsEnum] = jsonEncoderOf[InterestsEnum]
}
