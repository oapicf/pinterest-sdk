package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for business_members_asset_access_delete_request.
  * @param accesses List of members asset access to be deleted
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class BusinessMembersAssetAccessDeleteRequest(
  accesses: List[BusinessMembersAssetAccessDeleteRequestAccessesInner]
)

object BusinessMembersAssetAccessDeleteRequest {
  implicit lazy val businessMembersAssetAccessDeleteRequestJsonFormat: Format[BusinessMembersAssetAccessDeleteRequest] = Json.format[BusinessMembersAssetAccessDeleteRequest]
}

