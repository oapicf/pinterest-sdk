package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import StandardPinMetricTypes._

case class StandardPinMetricTypes (
  
object StandardPinMetricTypes {
  import DateTimeCodecs._

  implicit val StandardPinMetricTypesCodecJson: CodecJson[StandardPinMetricTypes] = CodecJson.derive[StandardPinMetricTypes]
  implicit val StandardPinMetricTypesDecoder: EntityDecoder[StandardPinMetricTypes] = jsonOf[StandardPinMetricTypes]
  implicit val StandardPinMetricTypesEncoder: EntityEncoder[StandardPinMetricTypes] = jsonEncoderOf[StandardPinMetricTypes]
}
