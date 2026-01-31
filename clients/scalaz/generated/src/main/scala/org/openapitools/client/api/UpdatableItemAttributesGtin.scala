package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatableItemAttributesGtin._

case class UpdatableItemAttributesGtin (
  
object UpdatableItemAttributesGtin {
  import DateTimeCodecs._

  implicit val UpdatableItemAttributesGtinCodecJson: CodecJson[UpdatableItemAttributesGtin] = CodecJson.derive[UpdatableItemAttributesGtin]
  implicit val UpdatableItemAttributesGtinDecoder: EntityDecoder[UpdatableItemAttributesGtin] = jsonOf[UpdatableItemAttributesGtin]
  implicit val UpdatableItemAttributesGtinEncoder: EntityEncoder[UpdatableItemAttributesGtin] = jsonEncoderOf[UpdatableItemAttributesGtin]
}
