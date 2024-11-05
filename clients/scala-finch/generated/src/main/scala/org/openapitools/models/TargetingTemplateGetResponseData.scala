package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PlacementGroupType
import org.openapitools.models.TargetingSpec
import org.openapitools.models.TargetingTemplateAudienceSizing
import org.openapitools.models.TargetingTemplateKeyword
import org.openapitools.models.TrackingUrls
import scala.collection.immutable.Seq

/**
 * 
 * @param name targeting template name
 * @param autoUnderscoretargetingUnderscoreenabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param targetingUnderscoreattributes 
 * @param placementUnderscoregroup 
 * @param keywords 
 * @param trackingUnderscoreurls 
 * @param id Targeting template ID.
 * @param createdUnderscoretime Targeting template created time. Unix timestamp in seconds.
 * @param updatedUnderscoretime Targeting template updated time.Unix timestamp in seconds.
 * @param adUnderscoreaccountUnderscoreid The ID of the advertiser that this targeting template belongs to.
 * @param status Indicate targeting template is active or Deleted
 * @param sizing 
 * @param valid Inform if the targeting template is valid (ex. would be false if has revoked audience)
 */
case class TargetingTemplateGetResponseData(name: Option[String],
                autoUnderscoretargetingUnderscoreenabled: Option[Boolean],
                targetingUnderscoreattributes: Option[TargetingSpec],
                placementUnderscoregroup: Option[PlacementGroupType],
                keywords: Option[Seq[TargetingTemplateKeyword]],
                trackingUnderscoreurls: Option[TrackingUrls],
                id: Option[String],
                createdUnderscoretime: Option[Int],
                updatedUnderscoretime: Option[Int],
                adUnderscoreaccountUnderscoreid: Option[String],
                status: Option[String],
                sizing: Option[TargetingTemplateAudienceSizing],
                valid: Option[Boolean]
                )

object TargetingTemplateGetResponseData {
    /**
     * Creates the codec for converting TargetingTemplateGetResponseData from and to JSON.
     */
    implicit val decoder: Decoder[TargetingTemplateGetResponseData] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingTemplateGetResponseData] = deriveEncoder
}
