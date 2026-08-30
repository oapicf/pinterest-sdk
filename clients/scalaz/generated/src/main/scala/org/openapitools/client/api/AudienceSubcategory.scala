package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceSubcategory._

case class AudienceSubcategory (
  id: Option[String],
index: Option[BigDecimal],
key: Option[String],
name: Option[String],
ratio: Option[BigDecimal])

object AudienceSubcategory {
  import DateTimeCodecs._

  implicit val AudienceSubcategoryCodecJson: CodecJson[AudienceSubcategory] = CodecJson.derive[AudienceSubcategory]
  implicit val AudienceSubcategoryDecoder: EntityDecoder[AudienceSubcategory] = jsonOf[AudienceSubcategory]
  implicit val AudienceSubcategoryEncoder: EntityEncoder[AudienceSubcategory] = jsonEncoderOf[AudienceSubcategory]
}
