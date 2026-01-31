package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplateCommon.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as <a href=\"https://help.pinterest.com/en/business/article/expanded-targeting\" target=\"_blank\">\"expanded targeting\"</a>.
  * @param name targeting template name
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TargetingTemplateCommon(
  autoTargetingEnabled: Option[Boolean],
  keywords: Option[List[TargetingTemplateKeyword]],
  name: Option[String],
  placementGroup: Option[PlacementGroupType],
  targetingAttributes: Option[TargetingSpec],
  trackingUrls: Option[TrackingUrls]
)

object TargetingTemplateCommon {
  implicit lazy val targetingTemplateCommonJsonFormat: Format[TargetingTemplateCommon] = Json.format[TargetingTemplateCommon]
}

