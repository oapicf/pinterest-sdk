package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupAudienceSizingCreate._

case class AdGroupAudienceSizingCreate (
  /* Enable auto-targeting for ad group. Default value is True. Also known as [Pinterest Performance+ targeting](https://help.pinterest.com/en/business/article/performance-plus-targeting). */
  autoTargetingEnabled: Option[Boolean],
/* Pin creative types filter. **Note:** SHOP_THE_PIN has been deprecated. Please use COLLECTION instead. */
  creativeTypes: Option[List[AdGroupAudienceSizingCreativeTypes]],
/* Array of keyword objects. If the keywords field is missing, all keywords will be targeted. */
  keywords: Option[List[AdGroupAudienceSizingKeyword]],
/* [Placement group](/docs/redoc/#section/Placement-group). */
  placementGroup: Option[AdgroupPlacementGroupType],
/* Targeted product group IDs. **Note:** This can only be combined with shopping/catalog sales campaigns. For more information, [click here](https://help.pinterest.com/en/business/article/shopping-ads#section-14571). SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored. */
  productGroupIds: Option[List[String]],
targetingSpec: Option[TargetingSpecOptimal])

object AdGroupAudienceSizingCreate {
  import DateTimeCodecs._

  implicit val AdGroupAudienceSizingCreateCodecJson: CodecJson[AdGroupAudienceSizingCreate] = CodecJson.derive[AdGroupAudienceSizingCreate]
  implicit val AdGroupAudienceSizingCreateDecoder: EntityDecoder[AdGroupAudienceSizingCreate] = jsonOf[AdGroupAudienceSizingCreate]
  implicit val AdGroupAudienceSizingCreateEncoder: EntityEncoder[AdGroupAudienceSizingCreate] = jsonEncoderOf[AdGroupAudienceSizingCreate]
}
