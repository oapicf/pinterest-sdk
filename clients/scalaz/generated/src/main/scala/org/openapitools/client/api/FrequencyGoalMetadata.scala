package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FrequencyGoalMetadata._

case class FrequencyGoalMetadata (
  frequency: Option[Integer],
timerange: Option[FrequencyGoalMetadataTimerange])

object FrequencyGoalMetadata {
  import DateTimeCodecs._

  implicit val FrequencyGoalMetadataCodecJson: CodecJson[FrequencyGoalMetadata] = CodecJson.derive[FrequencyGoalMetadata]
  implicit val FrequencyGoalMetadataDecoder: EntityDecoder[FrequencyGoalMetadata] = jsonOf[FrequencyGoalMetadata]
  implicit val FrequencyGoalMetadataEncoder: EntityEncoder[FrequencyGoalMetadata] = jsonEncoderOf[FrequencyGoalMetadata]
}
