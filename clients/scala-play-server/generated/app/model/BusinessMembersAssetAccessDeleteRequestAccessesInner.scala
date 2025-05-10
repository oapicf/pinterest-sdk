package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_members_asset_access_delete_request_accesses_inner.
  * @param assetId Id of the asset on which to remove member permissions.
  * @param memberId Unique identifier of the member on which to perform the asset permission removal
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BusinessMembersAssetAccessDeleteRequestAccessesInner(
  assetId: String,
  memberId: String
)

object BusinessMembersAssetAccessDeleteRequestAccessesInner {
  implicit lazy val businessMembersAssetAccessDeleteRequestAccessesInnerJsonFormat: Format[BusinessMembersAssetAccessDeleteRequestAccessesInner] = Json.format[BusinessMembersAssetAccessDeleteRequestAccessesInner]
}

