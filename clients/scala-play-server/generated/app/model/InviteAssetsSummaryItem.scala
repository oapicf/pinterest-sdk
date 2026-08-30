package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InviteAssetsSummaryItem.
  * @param id Unique identifier of the asset.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class InviteAssetsSummaryItem(
  id: Option[String],
  permissions: Option[List[String]]
)

object InviteAssetsSummaryItem {
  implicit lazy val inviteAssetsSummaryItemJsonFormat: Format[InviteAssetsSummaryItem] = Json.format[InviteAssetsSummaryItem]
}

