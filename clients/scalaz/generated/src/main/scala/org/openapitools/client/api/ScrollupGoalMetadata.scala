package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ScrollupGoalMetadata._

case class ScrollupGoalMetadata (
  scrollupGoalValueInMicroCurrency: Option[String])

object ScrollupGoalMetadata {
  import DateTimeCodecs._

  implicit val ScrollupGoalMetadataCodecJson: CodecJson[ScrollupGoalMetadata] = CodecJson.derive[ScrollupGoalMetadata]
  implicit val ScrollupGoalMetadataDecoder: EntityDecoder[ScrollupGoalMetadata] = jsonOf[ScrollupGoalMetadata]
  implicit val ScrollupGoalMetadataEncoder: EntityEncoder[ScrollupGoalMetadata] = jsonEncoderOf[ScrollupGoalMetadata]
}
