package model

import play.api.libs.json._

/**
  * Pinterest Performance+ campaign settings.
  * @param boostProspectingAdGroupBid Whether to boost prospecting ad group bid.
  * @param pinnerListExclusions List of campaign-level exclusion pinner list IDs.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PerformancePlusCampaignSettings(
  boostProspectingAdGroupBid: Option[Boolean],
  pinnerListExclusions: Option[List[String]]
)

object PerformancePlusCampaignSettings {
  implicit lazy val performancePlusCampaignSettingsJsonFormat: Format[PerformancePlusCampaignSettings] = Json.format[PerformancePlusCampaignSettings]
}

