package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateAssetGroupResponse.
  * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
  * @param updatedAssetGroups A list of successfully edited asset groups.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdateAssetGroupResponse(
  exceptions: Option[List[UpdateAssetGroupResponseExceptionsInner]],
  updatedAssetGroups: Option[List[AssetGroupBinding]]
)

object UpdateAssetGroupResponse {
  implicit lazy val updateAssetGroupResponseJsonFormat: Format[UpdateAssetGroupResponse] = Json.format[UpdateAssetGroupResponse]
}

