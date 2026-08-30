package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SingleInterestTargetingOption._

case class SingleInterestTargetingOption (
  childInterests: List[String],
id: String,
level: Integer,
name: String)

object SingleInterestTargetingOption {
  import DateTimeCodecs._

  implicit val SingleInterestTargetingOptionCodecJson: CodecJson[SingleInterestTargetingOption] = CodecJson.derive[SingleInterestTargetingOption]
  implicit val SingleInterestTargetingOptionDecoder: EntityDecoder[SingleInterestTargetingOption] = jsonOf[SingleInterestTargetingOption]
  implicit val SingleInterestTargetingOptionEncoder: EntityEncoder[SingleInterestTargetingOption] = jsonEncoderOf[SingleInterestTargetingOption]
}
