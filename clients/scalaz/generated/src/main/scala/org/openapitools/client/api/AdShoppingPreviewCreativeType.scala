package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdShoppingPreviewCreativeType._

case class AdShoppingPreviewCreativeType (
  
object AdShoppingPreviewCreativeType {
  import DateTimeCodecs._

  implicit val AdShoppingPreviewCreativeTypeCodecJson: CodecJson[AdShoppingPreviewCreativeType] = CodecJson.derive[AdShoppingPreviewCreativeType]
  implicit val AdShoppingPreviewCreativeTypeDecoder: EntityDecoder[AdShoppingPreviewCreativeType] = jsonOf[AdShoppingPreviewCreativeType]
  implicit val AdShoppingPreviewCreativeTypeEncoder: EntityEncoder[AdShoppingPreviewCreativeType] = jsonEncoderOf[AdShoppingPreviewCreativeType]
}
