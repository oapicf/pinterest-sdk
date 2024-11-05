package model

import play.api.libs.json._

/**
  * Ad accounts and profiles the business member/partner has access to.
  * @param adAccounts List of ad account IDs and respective permission levels.
  * @param profiles List of profile IDs and respective permission levels.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BusinessMemberAssetsSummary(
  adAccounts: Option[List[BusinessMemberAssetsSummaryAdAccountsInner]],
  profiles: Option[List[BusinessMemberAssetsSummaryProfilesInner]]
)

object BusinessMemberAssetsSummary {
  implicit lazy val businessMemberAssetsSummaryJsonFormat: Format[BusinessMemberAssetsSummary] = Json.format[BusinessMemberAssetsSummary]
}

