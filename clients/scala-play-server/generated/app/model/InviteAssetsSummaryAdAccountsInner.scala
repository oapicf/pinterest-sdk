package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InviteAssetsSummary_ad_accounts_inner.
  * @param id Unique identifier of a business ad account.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class InviteAssetsSummaryAdAccountsInner(
  id: Option[String],
  permissions: Option[List[String]]
)

object InviteAssetsSummaryAdAccountsInner {
  implicit lazy val inviteAssetsSummaryAdAccountsInnerJsonFormat: Format[InviteAssetsSummaryAdAccountsInner] = Json.format[InviteAssetsSummaryAdAccountsInner]
}

