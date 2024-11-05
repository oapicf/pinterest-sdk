package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTypeFilter._

case class TargetingTypeFilter (
  /* List of targeting types. Requires `level` to be a value ending in `_TARGETING`. [\"AGE_BUCKET_AND_GENDER\"] is in BETA and not yet available to all users. */
  targetingTypes: Option[List[AdsAnalyticsTargetingType]])

object TargetingTypeFilter {
  import DateTimeCodecs._

  implicit val TargetingTypeFilterCodecJson: CodecJson[TargetingTypeFilter] = CodecJson.derive[TargetingTypeFilter]
  implicit val TargetingTypeFilterDecoder: EntityDecoder[TargetingTypeFilter] = jsonOf[TargetingTypeFilter]
  implicit val TargetingTypeFilterEncoder: EntityEncoder[TargetingTypeFilter] = jsonEncoderOf[TargetingTypeFilter]
}
