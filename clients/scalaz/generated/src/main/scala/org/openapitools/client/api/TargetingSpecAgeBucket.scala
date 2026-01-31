package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecAgeBucket._

case class TargetingSpecAgeBucket (
  
object TargetingSpecAgeBucket {
  import DateTimeCodecs._

  implicit val TargetingSpecAgeBucketCodecJson: CodecJson[TargetingSpecAgeBucket] = CodecJson.derive[TargetingSpecAgeBucket]
  implicit val TargetingSpecAgeBucketDecoder: EntityDecoder[TargetingSpecAgeBucket] = jsonOf[TargetingSpecAgeBucket]
  implicit val TargetingSpecAgeBucketEncoder: EntityEncoder[TargetingSpecAgeBucket] = jsonEncoderOf[TargetingSpecAgeBucket]
}
