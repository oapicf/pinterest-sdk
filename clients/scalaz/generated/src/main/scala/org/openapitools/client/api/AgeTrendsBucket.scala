package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AgeTrendsBucket._

case class AgeTrendsBucket (
  
object AgeTrendsBucket {
  import DateTimeCodecs._

  implicit val AgeTrendsBucketCodecJson: CodecJson[AgeTrendsBucket] = CodecJson.derive[AgeTrendsBucket]
  implicit val AgeTrendsBucketDecoder: EntityDecoder[AgeTrendsBucket] = jsonOf[AgeTrendsBucket]
  implicit val AgeTrendsBucketEncoder: EntityEncoder[AgeTrendsBucket] = jsonEncoderOf[AgeTrendsBucket]
}
