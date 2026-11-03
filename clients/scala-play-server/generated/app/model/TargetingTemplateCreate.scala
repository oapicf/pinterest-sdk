package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
  * @param name targeting template name
  * @param targetingAttributes targeting profile attributes
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class TargetingTemplateCreate(
  autoTargetingEnabled: Option[Boolean],
  keywords: Option[List[TargetingTemplateKeyword]],
  name: String,
  placementGroup: Option[PlacementGroupType],
  targetingAttributes: TargetingSpecOptimal,
  trackingUrls: Option[TrackingUrls]
)

object TargetingTemplateCreate {
  implicit lazy val targetingTemplateCreateJsonFormat: Format[TargetingTemplateCreate] = Json.format[TargetingTemplateCreate]
}

