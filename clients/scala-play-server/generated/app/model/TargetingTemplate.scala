package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TargetingTemplate.
  * @param adAccountId The ID of the advertiser that this targeting template belongs to.
  * @param autoTargetingEnabled Enable auto-targeting for ad group. Also known as [\"expanded targeting\"](https://help.pinterest.com/en/business/article/expanded-targeting).
  * @param createdTime Targeting template created time. Unix timestamp in seconds.
  * @param id Targeting template ID.
  * @param name targeting template name
  * @param status Indicate targeting template is active or Deleted
  * @param targetingAttributes targeting profile attributes
  * @param updatedTime Targeting template updated time.Unix timestamp in seconds.
  * @param valid Inform if the targeting template is valid (ex. would be false if has revoked audience)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TargetingTemplate(
  adAccountId: Option[String],
  autoTargetingEnabled: Option[Boolean],
  createdTime: Option[Int],
  id: Option[String],
  keywords: Option[List[TargetingTemplateKeyword]],
  name: String,
  placementGroup: Option[PlacementGroupType],
  sizing: Option[TargetingTemplateAudienceSizing],
  status: Option[TargetingTemplateStatus],
  targetingAttributes: TargetingSpecOptimal,
  trackingUrls: Option[TrackingUrls],
  updatedTime: Option[Int],
  valid: Option[Boolean]
)

object TargetingTemplate {
  implicit lazy val targetingTemplateJsonFormat: Format[TargetingTemplate] = Json.format[TargetingTemplate]
}

