package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdgroupTrackingFeatures._

case class AdgroupTrackingFeatures (
  /* Tracking features. To clear this field, set to null. */
  enabled: Option[List[AdgroupTrackingFeatureType]])

object AdgroupTrackingFeatures {
  import DateTimeCodecs._

  implicit val AdgroupTrackingFeaturesCodecJson: CodecJson[AdgroupTrackingFeatures] = CodecJson.derive[AdgroupTrackingFeatures]
  implicit val AdgroupTrackingFeaturesDecoder: EntityDecoder[AdgroupTrackingFeatures] = jsonOf[AdgroupTrackingFeatures]
  implicit val AdgroupTrackingFeaturesEncoder: EntityEncoder[AdgroupTrackingFeatures] = jsonEncoderOf[AdgroupTrackingFeatures]
}
