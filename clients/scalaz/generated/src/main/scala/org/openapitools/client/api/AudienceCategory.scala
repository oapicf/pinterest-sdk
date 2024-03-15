package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceCategory._

case class AudienceCategory (
  /* Interest unique key (same as ID). */
  key: Option[String],
/* Interest name. */
  name: Option[String],
/* Interest's percent of category's total audience. */
  ratio: Option[BigDecimal],
/* Interest affinity index. */
  index: Option[BigDecimal],
/* Interest ID. */
  id: Option[String],
/* Subcategory interest distribution */
  subcategories: Option[List[AudienceSubcategory]])

object AudienceCategory {
  import DateTimeCodecs._

  implicit val AudienceCategoryCodecJson: CodecJson[AudienceCategory] = CodecJson.derive[AudienceCategory]
  implicit val AudienceCategoryDecoder: EntityDecoder[AudienceCategory] = jsonOf[AudienceCategory]
  implicit val AudienceCategoryEncoder: EntityEncoder[AudienceCategory] = jsonEncoderOf[AudienceCategory]
}
