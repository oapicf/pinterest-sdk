package model

import play.api.libs.json._

/**
  * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
  * @param adAccounts List of ad account IDs and respective permission levels that will be assigned.
  * @param profiles List of profile IDs and respective permission levels that will be assigned.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class InviteAssetsSummary(
  adAccounts: Option[List[InviteAssetsSummaryItem]],
  profiles: Option[List[InviteAssetsSummaryItem]]
)

object InviteAssetsSummary {
  implicit lazy val inviteAssetsSummaryJsonFormat: Format[InviteAssetsSummary] = Json.format[InviteAssetsSummary]
}

