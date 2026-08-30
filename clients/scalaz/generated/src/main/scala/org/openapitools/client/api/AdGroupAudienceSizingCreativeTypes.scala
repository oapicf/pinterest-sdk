package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupAudienceSizingCreativeTypes._

case class AdGroupAudienceSizingCreativeTypes (
  
object AdGroupAudienceSizingCreativeTypes {
  import DateTimeCodecs._

  implicit val AdGroupAudienceSizingCreativeTypesCodecJson: CodecJson[AdGroupAudienceSizingCreativeTypes] = CodecJson.derive[AdGroupAudienceSizingCreativeTypes]
  implicit val AdGroupAudienceSizingCreativeTypesDecoder: EntityDecoder[AdGroupAudienceSizingCreativeTypes] = jsonOf[AdGroupAudienceSizingCreativeTypes]
  implicit val AdGroupAudienceSizingCreativeTypesEncoder: EntityEncoder[AdGroupAudienceSizingCreativeTypes] = jsonEncoderOf[AdGroupAudienceSizingCreativeTypes]
}
