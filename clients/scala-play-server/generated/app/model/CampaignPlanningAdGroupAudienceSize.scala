package model

import play.api.libs.json._

/**
  * Range audience size for an ad group.
  * @param countLower Lower bound of the audience size estimate.
  * @param countUpper Upper bound of the audience size estimate.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CampaignPlanningAdGroupAudienceSize(
  countLower: Option[Int],
  countUpper: Option[Int]
)

object CampaignPlanningAdGroupAudienceSize {
  implicit lazy val campaignPlanningAdGroupAudienceSizeJsonFormat: Format[CampaignPlanningAdGroupAudienceSize] = Json.format[CampaignPlanningAdGroupAudienceSize]
}

