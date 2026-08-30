package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FilterOperatorType._

case class FilterOperatorType (
  
object FilterOperatorType {
  import DateTimeCodecs._

  implicit val FilterOperatorTypeCodecJson: CodecJson[FilterOperatorType] = CodecJson.derive[FilterOperatorType]
  implicit val FilterOperatorTypeDecoder: EntityDecoder[FilterOperatorType] = jsonOf[FilterOperatorType]
  implicit val FilterOperatorTypeEncoder: EntityEncoder[FilterOperatorType] = jsonEncoderOf[FilterOperatorType]
}
