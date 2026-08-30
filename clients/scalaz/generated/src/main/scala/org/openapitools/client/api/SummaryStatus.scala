package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SummaryStatus._

case class SummaryStatus (
  
object SummaryStatus {
  import DateTimeCodecs._

  implicit val SummaryStatusCodecJson: CodecJson[SummaryStatus] = CodecJson.derive[SummaryStatus]
  implicit val SummaryStatusDecoder: EntityDecoder[SummaryStatus] = jsonOf[SummaryStatus]
  implicit val SummaryStatusEncoder: EntityEncoder[SummaryStatus] = jsonEncoderOf[SummaryStatus]
}
