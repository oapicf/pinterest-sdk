package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FrequencyGoalMetadataTimerange._

case class FrequencyGoalMetadataTimerange (
  
object FrequencyGoalMetadataTimerange {
  import DateTimeCodecs._

  implicit val FrequencyGoalMetadataTimerangeCodecJson: CodecJson[FrequencyGoalMetadataTimerange] = CodecJson.derive[FrequencyGoalMetadataTimerange]
  implicit val FrequencyGoalMetadataTimerangeDecoder: EntityDecoder[FrequencyGoalMetadataTimerange] = jsonOf[FrequencyGoalMetadataTimerange]
  implicit val FrequencyGoalMetadataTimerangeEncoder: EntityEncoder[FrequencyGoalMetadataTimerange] = jsonEncoderOf[FrequencyGoalMetadataTimerange]
}
