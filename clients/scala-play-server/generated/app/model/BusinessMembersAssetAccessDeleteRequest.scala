package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_members_asset_access_delete_request.
  * @param accesses List of members asset access to be deleted
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class BusinessMembersAssetAccessDeleteRequest(
  accesses: List[BusinessMembersAssetAccessDeleteRequestAccessesInner]
)

object BusinessMembersAssetAccessDeleteRequest {
  implicit lazy val businessMembersAssetAccessDeleteRequestJsonFormat: Format[BusinessMembersAssetAccessDeleteRequest] = Json.format[BusinessMembersAssetAccessDeleteRequest]
}

