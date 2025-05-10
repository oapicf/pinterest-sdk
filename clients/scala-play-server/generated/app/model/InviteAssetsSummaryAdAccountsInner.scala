package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InviteAssetsSummary_ad_accounts_inner.
  * @param id Unique identifier of a business ad account.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class InviteAssetsSummaryAdAccountsInner(
  id: Option[String],
  permissions: Option[List[String]]
)

object InviteAssetsSummaryAdAccountsInner {
  implicit lazy val inviteAssetsSummaryAdAccountsInnerJsonFormat: Format[InviteAssetsSummaryAdAccountsInner] = Json.format[InviteAssetsSummaryAdAccountsInner]
}

