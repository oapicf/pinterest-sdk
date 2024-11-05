package model

import play.api.libs.json._

/**
  * Ad accounts and profiles the member/partner will be granted access to with this invite/request.
  * @param adAccounts List of ad account IDs and respective permission levels that will be assigned.
  * @param profiles List of profile IDs and respective permission levels that will be assigned.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class InviteAssetsSummary(
  adAccounts: Option[List[InviteAssetsSummaryAdAccountsInner]],
  profiles: Option[List[InviteAssetsSummaryProfilesInner]]
)

object InviteAssetsSummary {
  implicit lazy val inviteAssetsSummaryJsonFormat: Format[InviteAssetsSummary] = Json.format[InviteAssetsSummary]
}

