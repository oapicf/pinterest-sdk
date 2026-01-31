package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InviteAssetsSummary_profiles_inner.
  * @param id Unique identifier of a business profile.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class InviteAssetsSummaryProfilesInner(
  id: Option[String],
  permissions: Option[List[String]]
)

object InviteAssetsSummaryProfilesInner {
  implicit lazy val inviteAssetsSummaryProfilesInnerJsonFormat: Format[InviteAssetsSummaryProfilesInner] = Json.format[InviteAssetsSummaryProfilesInner]
}

