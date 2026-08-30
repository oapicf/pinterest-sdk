package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdgroupTrackingFeatureType._

case class AdgroupTrackingFeatureType (
  
object AdgroupTrackingFeatureType {
  import DateTimeCodecs._

  implicit val AdgroupTrackingFeatureTypeCodecJson: CodecJson[AdgroupTrackingFeatureType] = CodecJson.derive[AdgroupTrackingFeatureType]
  implicit val AdgroupTrackingFeatureTypeDecoder: EntityDecoder[AdgroupTrackingFeatureType] = jsonOf[AdgroupTrackingFeatureType]
  implicit val AdgroupTrackingFeatureTypeEncoder: EntityEncoder[AdgroupTrackingFeatureType] = jsonEncoderOf[AdgroupTrackingFeatureType]
}
