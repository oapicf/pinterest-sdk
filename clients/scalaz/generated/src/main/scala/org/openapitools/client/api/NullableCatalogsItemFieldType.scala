package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NullableCatalogsItemFieldType._

case class NullableCatalogsItemFieldType (
  
object NullableCatalogsItemFieldType {
  import DateTimeCodecs._

  implicit val NullableCatalogsItemFieldTypeCodecJson: CodecJson[NullableCatalogsItemFieldType] = CodecJson.derive[NullableCatalogsItemFieldType]
  implicit val NullableCatalogsItemFieldTypeDecoder: EntityDecoder[NullableCatalogsItemFieldType] = jsonOf[NullableCatalogsItemFieldType]
  implicit val NullableCatalogsItemFieldTypeEncoder: EntityEncoder[NullableCatalogsItemFieldType] = jsonEncoderOf[NullableCatalogsItemFieldType]
}
