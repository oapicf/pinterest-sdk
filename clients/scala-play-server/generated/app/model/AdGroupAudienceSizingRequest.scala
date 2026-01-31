package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupAudienceSizingRequest.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>.
  * @param creativeTypes Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  * @param placementGroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  * @param productGroupIds Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdGroupAudienceSizingRequest(
  autoTargetingEnabled: Option[Boolean],
  creativeTypes: Option[AdGroupAudienceSizingRequest.CreativeTypes.Value],
  keywords: Option[List[AdGroupAudienceSizingRequestKeywordsInner]],
  placementGroup: Option[PlacementGroupType],
  productGroupIds: Option[List[String]],
  targetingSpec: Option[TargetingSpec]
)

object AdGroupAudienceSizingRequest {
  implicit lazy val adGroupAudienceSizingRequestJsonFormat: Format[AdGroupAudienceSizingRequest] = Json.format[AdGroupAudienceSizingRequest]

  // noinspection TypeAnnotation
  object CreativeTypes extends Enumeration {
    val REGULAR = Value("REGULAR")
    val VIDEO = Value("VIDEO")
    val SHOPPING = Value("SHOPPING")
    val CAROUSEL = Value("CAROUSEL")
    val MAXVIDEO = Value("MAX_VIDEO")
    val SHOPTHEPIN = Value("SHOP_THE_PIN")
    val COLLECTION = Value("COLLECTION")
    val IDEA = Value("IDEA")

    type CreativeTypes = Value
    implicit lazy val CreativeTypesJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

