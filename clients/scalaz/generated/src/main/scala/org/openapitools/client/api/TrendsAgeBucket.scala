package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrendsAgeBucket._

case class TrendsAgeBucket (
  
object TrendsAgeBucket {
  import DateTimeCodecs._

  implicit val TrendsAgeBucketCodecJson: CodecJson[TrendsAgeBucket] = CodecJson.derive[TrendsAgeBucket]
  implicit val TrendsAgeBucketDecoder: EntityDecoder[TrendsAgeBucket] = jsonOf[TrendsAgeBucket]
  implicit val TrendsAgeBucketEncoder: EntityEncoder[TrendsAgeBucket] = jsonEncoderOf[TrendsAgeBucket]
}
