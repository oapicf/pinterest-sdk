package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_members_asset_access_delete_request_accesses_inner.
  * @param assetId Id of the asset on which to remove member permissions.
  * @param memberId Unique identifier of the member on which to perform the asset permission removal
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BusinessMembersAssetAccessDeleteRequestAccessesInner(
  assetId: String,
  memberId: String
)

object BusinessMembersAssetAccessDeleteRequestAccessesInner {
  implicit lazy val businessMembersAssetAccessDeleteRequestAccessesInnerJsonFormat: Format[BusinessMembersAssetAccessDeleteRequestAccessesInner] = Json.format[BusinessMembersAssetAccessDeleteRequestAccessesInner]
}

