package model

import play.api.libs.json._

/**
  * Paginated response for business member assets with total count metadata.
  * @param totalDataCount Total number of assets matching the query
  * @param totalDataCountByStatus Breakdown of asset counts by entity status (ad accounts only)
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class BusinessMemberAssetsGetResponse(
  bookmark: Option[String],
  items: List[AssetIdPermissions],
  totalDataCount: Int,
  totalDataCountByStatus: Option[TotalCountByEntityStatus]
)

object BusinessMemberAssetsGetResponse {
  implicit lazy val businessMemberAssetsGetResponseJsonFormat: Format[BusinessMemberAssetsGetResponse] = Json.format[BusinessMemberAssetsGetResponse]
}

