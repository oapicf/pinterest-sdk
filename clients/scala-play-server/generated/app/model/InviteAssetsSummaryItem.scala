package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InviteAssetsSummaryItem.
  * @param id Unique identifier of the asset.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class InviteAssetsSummaryItem(
  id: Option[String],
  permissions: Option[List[String]]
)

object InviteAssetsSummaryItem {
  implicit lazy val inviteAssetsSummaryItemJsonFormat: Format[InviteAssetsSummaryItem] = Json.format[InviteAssetsSummaryItem]
}

