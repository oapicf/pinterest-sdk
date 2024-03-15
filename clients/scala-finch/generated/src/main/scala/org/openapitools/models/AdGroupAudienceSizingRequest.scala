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
 * @param autoUnderscoretargetingUnderscoreenabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param placementUnderscoregroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
 * @param creativeUnderscoretypes Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
 * @param targetingUnderscorespec 
 * @param productUnderscoregroupUnderscoreids Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
 * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
 */
case class AdGroupAudienceSizingRequest(autoUnderscoretargetingUnderscoreenabled: Option[Boolean],
                placementUnderscoregroup: Option[PlacementGroupType],
                creativeUnderscoretypes: Option[Seq[String]],
                targetingUnderscorespec: Option[TargetingSpec],
                productUnderscoregroupUnderscoreids: Option[Seq[String]],
                keywords: Option[Seq[AdGroupAudienceSizingRequestKeywordsInner]]
                )

object AdGroupAudienceSizingRequest {
    /**
     * Creates the codec for converting AdGroupAudienceSizingRequest from and to JSON.
     */
    implicit val decoder: Decoder[AdGroupAudienceSizingRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdGroupAudienceSizingRequest] = deriveEncoder
}
