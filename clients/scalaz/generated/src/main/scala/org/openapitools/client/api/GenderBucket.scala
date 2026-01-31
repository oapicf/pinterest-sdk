package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GenderBucket._

case class GenderBucket (
  
object GenderBucket {
  import DateTimeCodecs._

  implicit val GenderBucketCodecJson: CodecJson[GenderBucket] = CodecJson.derive[GenderBucket]
  implicit val GenderBucketDecoder: EntityDecoder[GenderBucket] = jsonOf[GenderBucket]
  implicit val GenderBucketEncoder: EntityEncoder[GenderBucket] = jsonEncoderOf[GenderBucket]
}
