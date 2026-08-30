package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import NullablePartnerType._

case class NullablePartnerType (
  
object NullablePartnerType {
  import DateTimeCodecs._

  implicit val NullablePartnerTypeCodecJson: CodecJson[NullablePartnerType] = CodecJson.derive[NullablePartnerType]
  implicit val NullablePartnerTypeDecoder: EntityDecoder[NullablePartnerType] = jsonOf[NullablePartnerType]
  implicit val NullablePartnerTypeEncoder: EntityEncoder[NullablePartnerType] = jsonEncoderOf[NullablePartnerType]
}
