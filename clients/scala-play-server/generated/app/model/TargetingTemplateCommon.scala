package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateCommon.
  * @param name targeting template name
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class TargetingTemplateCommon(
  name: Option[String],
  autoTargetingEnabled: Option[Boolean],
  targetingAttributes: Option[TargetingSpec],
  placementGroup: Option[PlacementGroupType],
  keywords: Option[List[TargetingTemplateKeyword]],
  trackingUrls: Option[TrackingUrls]
)

object TargetingTemplateCommon {
  implicit lazy val targetingTemplateCommonJsonFormat: Format[TargetingTemplateCommon] = Json.format[TargetingTemplateCommon]
}

