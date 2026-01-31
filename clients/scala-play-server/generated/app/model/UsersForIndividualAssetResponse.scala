package model

import play.api.libs.json._

/**
  * An object containing the permissions a business member has on the asset.
  * @param assetId Unique identifier of a business asset.
  * @param memberId Unique identifier of the business member with asset access.
  * @param permissions Permission levels member or partner has on an asset.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UsersForIndividualAssetResponse(
  assetId: Option[String],
  memberId: Option[String],
  permissions: Option[List[String]]
)

object UsersForIndividualAssetResponse {
  implicit lazy val usersForIndividualAssetResponseJsonFormat: Format[UsersForIndividualAssetResponse] = Json.format[UsersForIndividualAssetResponse]
}

