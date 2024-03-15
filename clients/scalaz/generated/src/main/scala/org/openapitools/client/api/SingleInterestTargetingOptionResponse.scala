package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SingleInterestTargetingOptionResponse._

case class SingleInterestTargetingOptionResponse (
  id: Option[String],
name: Option[String],
childInterests: Option[List[String]],
level: Option[Integer])

object SingleInterestTargetingOptionResponse {
  import DateTimeCodecs._

  implicit val SingleInterestTargetingOptionResponseCodecJson: CodecJson[SingleInterestTargetingOptionResponse] = CodecJson.derive[SingleInterestTargetingOptionResponse]
  implicit val SingleInterestTargetingOptionResponseDecoder: EntityDecoder[SingleInterestTargetingOptionResponse] = jsonOf[SingleInterestTargetingOptionResponse]
  implicit val SingleInterestTargetingOptionResponseEncoder: EntityEncoder[SingleInterestTargetingOptionResponse] = jsonEncoderOf[SingleInterestTargetingOptionResponse]
}
