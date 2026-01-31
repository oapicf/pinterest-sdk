package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for BusinessMemberAssetsSummary_profiles_inner.
  * @param id Unique identifier of a business profile.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class BusinessMemberAssetsSummaryProfilesInner(
  id: Option[String],
  permissions: Option[List[String]]
)

object BusinessMemberAssetsSummaryProfilesInner {
  implicit lazy val businessMemberAssetsSummaryProfilesInnerJsonFormat: Format[BusinessMemberAssetsSummaryProfilesInner] = Json.format[BusinessMemberAssetsSummaryProfilesInner]
}

