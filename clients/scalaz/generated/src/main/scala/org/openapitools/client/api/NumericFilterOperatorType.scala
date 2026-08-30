package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NumericFilterOperatorType._

case class NumericFilterOperatorType (
  
object NumericFilterOperatorType {
  import DateTimeCodecs._

  implicit val NumericFilterOperatorTypeCodecJson: CodecJson[NumericFilterOperatorType] = CodecJson.derive[NumericFilterOperatorType]
  implicit val NumericFilterOperatorTypeDecoder: EntityDecoder[NumericFilterOperatorType] = jsonOf[NumericFilterOperatorType]
  implicit val NumericFilterOperatorTypeEncoder: EntityEncoder[NumericFilterOperatorType] = jsonEncoderOf[NumericFilterOperatorType]
}
