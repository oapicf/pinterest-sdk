package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateCommon.
  * @param name targeting template name
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

