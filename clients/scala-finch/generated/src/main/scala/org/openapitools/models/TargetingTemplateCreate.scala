package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.PlacementGroupType
import org.openapitools.models.TargetingSpec
import org.openapitools.models.TargetingTemplateKeyword
import org.openapitools.models.TrackingUrls
import scala.collection.immutable.Seq

/**
 * 
 * @param autoUnderscoretargetingUnderscoreenabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
 * @param keywords 
 * @param name Name of targeting template.
 * @param placementUnderscoregroup 
 * @param targetingUnderscoreattributes 
 * @param trackingUnderscoreurls 
 */
case class TargetingTemplateCreate(autoUnderscoretargetingUnderscoreenabled: Option[Boolean],
                keywords: Option[Seq[TargetingTemplateKeyword]],
                name: String,
                placementUnderscoregroup: Option[PlacementGroupType],
                targetingUnderscoreattributes: TargetingSpec,
                trackingUnderscoreurls: Option[TrackingUrls]
                )

object TargetingTemplateCreate {
    /**
     * Creates the codec for converting TargetingTemplateCreate from and to JSON.
     */
    implicit val decoder: Decoder[TargetingTemplateCreate] = deriveDecoder
    implicit val encoder: ObjectEncoder[TargetingTemplateCreate] = deriveEncoder
}
