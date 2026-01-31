package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.AdGroupAudienceSizingRequestKeywordsInner
import org.openapitools.models.PlacementGroupType
import org.openapitools.models.TargetingSpec
import scala.collection.immutable.Seq

/**
 * 
 * @param autoUnderscoretargetingUnderscoreenabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
 * @param creativeUnderscoretypes Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
 * @param placementUnderscoregroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @param productUnderscoregroupUnderscoreids Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
 * @param targetingUnderscorespec 
 */
case class AdGroupAudienceSizingRequest(autoUnderscoretargetingUnderscoreenabled: Option[Boolean],
                creativeUnderscoretypes: Option[Seq[String]],
                keywords: Option[Seq[AdGroupAudienceSizingRequestKeywordsInner]],
                placementUnderscoregroup: Option[PlacementGroupType],
                productUnderscoregroupUnderscoreids: Option[Seq[String]],
                targetingUnderscorespec: Option[TargetingSpec]
                )

object AdGroupAudienceSizingRequest {
    /**
     * Creates the codec for converting AdGroupAudienceSizingRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupAudienceSizingRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupAudienceSizingRequest] = deriveEncoder
}
