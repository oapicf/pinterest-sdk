package model

import play.api.libs.json._

/**
  * Ad accounts and profiles the business member/partner has access to.
  * @param adAccounts List of ad account IDs and respective permission levels.
  * @param profiles List of profile IDs and respective permission levels.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BusinessMemberAssetsSummary(
  adAccounts: Option[List[BusinessMemberAssetsSummaryAdAccountsInner]],
  profiles: Option[List[BusinessMemberAssetsSummaryProfilesInner]]
)

object BusinessMemberAssetsSummary {
  implicit lazy val businessMemberAssetsSummaryJsonFormat: Format[BusinessMemberAssetsSummary] = Json.format[BusinessMemberAssetsSummary]
}

