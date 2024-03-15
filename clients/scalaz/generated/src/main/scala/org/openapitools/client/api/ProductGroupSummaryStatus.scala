package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductGroupSummaryStatus._

case class ProductGroupSummaryStatus (
  
object ProductGroupSummaryStatus {
  import DateTimeCodecs._

  implicit val ProductGroupSummaryStatusCodecJson: CodecJson[ProductGroupSummaryStatus] = CodecJson.derive[ProductGroupSummaryStatus]
  implicit val ProductGroupSummaryStatusDecoder: EntityDecoder[ProductGroupSummaryStatus] = jsonOf[ProductGroupSummaryStatus]
  implicit val ProductGroupSummaryStatusEncoder: EntityEncoder[ProductGroupSummaryStatus] = jsonEncoderOf[ProductGroupSummaryStatus]
}
