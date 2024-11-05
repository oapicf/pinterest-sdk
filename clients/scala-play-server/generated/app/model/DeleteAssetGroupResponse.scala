package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteAssetGroupResponse.
  * @param deletedAssetGroups A list of ids of successfully deleted asset groups.
  * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeleteAssetGroupResponse(
  deletedAssetGroups: Option[List[String]],
  exceptions: Option[List[DeleteAssetGroupResponseExceptionsInner]]
)

object DeleteAssetGroupResponse {
  implicit lazy val deleteAssetGroupResponseJsonFormat: Format[DeleteAssetGroupResponse] = Json.format[DeleteAssetGroupResponse]
}

