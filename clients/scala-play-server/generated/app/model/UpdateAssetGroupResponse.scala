package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateAssetGroupResponse.
  * @param updatedAssetGroups A list of successfully edited asset groups.
  * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdateAssetGroupResponse(
  updatedAssetGroups: Option[List[AssetGroupBinding]],
  exceptions: Option[List[UpdateAssetGroupResponseExceptionsInner]]
)

object UpdateAssetGroupResponse {
  implicit lazy val updateAssetGroupResponseJsonFormat: Format[UpdateAssetGroupResponse] = Json.format[UpdateAssetGroupResponse]
}

