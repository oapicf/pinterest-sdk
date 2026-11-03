package model

import play.api.libs.json._

/**
  * Range audience size for an ad group.
  * @param countLower Lower bound of the audience size estimate.
  * @param countUpper Upper bound of the audience size estimate.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CampaignPlanningAdGroupAudienceSize(
  countLower: Option[Int],
  countUpper: Option[Int]
)

object CampaignPlanningAdGroupAudienceSize {
  implicit lazy val campaignPlanningAdGroupAudienceSizeJsonFormat: Format[CampaignPlanningAdGroupAudienceSize] = Json.format[CampaignPlanningAdGroupAudienceSize]
}

