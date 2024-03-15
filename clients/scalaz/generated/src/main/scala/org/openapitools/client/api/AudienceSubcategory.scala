package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceSubcategory._

case class AudienceSubcategory (
  /* Interest unique key (same as ID). */
  key: Option[String],
/* Subinterest name. */
  name: Option[String],
/* Subinterest's percent of category's total audience. */
  ratio: Option[BigDecimal],
/* Subinterest affinity index. */
  index: Option[BigDecimal],
/* Subinterest ID. */
  id: Option[String])

object AudienceSubcategory {
  import DateTimeCodecs._

  implicit val AudienceSubcategoryCodecJson: CodecJson[AudienceSubcategory] = CodecJson.derive[AudienceSubcategory]
  implicit val AudienceSubcategoryDecoder: EntityDecoder[AudienceSubcategory] = jsonOf[AudienceSubcategory]
  implicit val AudienceSubcategoryEncoder: EntityEncoder[AudienceSubcategory] = jsonEncoderOf[AudienceSubcategory]
}
