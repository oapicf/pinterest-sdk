package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupAudienceSizingRequest.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  * @param placementGroup <a href=\"/docs/redoc/#section/Placement-group\">Placement group</a>.
  * @param creativeTypes Pin creative types filter. </p><strong>Note:</strong> SHOP_THE_PIN has been deprecated. Please use COLLECTION instead.
  * @param productGroupIds Targeted product group IDs. </p><strong>Note:</strong> This can only be combined with shopping/catalog sales campaigns. For more information, <a href=\"https://help.pinterest.com/en/business/article/shopping-ads#section-14571\" target=\"_blank\">click here</a>. SHOPPING_RETARGETING must be included in targeting_spec object or this field will be ignored.
  * @param keywords Array of keyword objects. If the keywords field is missing, all keywords will be targeted.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdGroupAudienceSizingRequest(
  autoTargetingEnabled: Option[Boolean],
  placementGroup: Option[PlacementGroupType],
  creativeTypes: Option[AdGroupAudienceSizingRequest.CreativeTypes.Value],
  targetingSpec: Option[TargetingSpec],
  productGroupIds: Option[List[String]],
  keywords: Option[List[AdGroupAudienceSizingRequestKeywordsInner]]
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

