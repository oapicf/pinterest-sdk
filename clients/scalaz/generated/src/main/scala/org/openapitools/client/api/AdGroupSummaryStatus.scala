package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupSummaryStatus._

case class AdGroupSummaryStatus (
  
object AdGroupSummaryStatus {
  import DateTimeCodecs._

  implicit val AdGroupSummaryStatusCodecJson: CodecJson[AdGroupSummaryStatus] = CodecJson.derive[AdGroupSummaryStatus]
  implicit val AdGroupSummaryStatusDecoder: EntityDecoder[AdGroupSummaryStatus] = jsonOf[AdGroupSummaryStatus]
  implicit val AdGroupSummaryStatusEncoder: EntityEncoder[AdGroupSummaryStatus] = jsonEncoderOf[AdGroupSummaryStatus]
}
