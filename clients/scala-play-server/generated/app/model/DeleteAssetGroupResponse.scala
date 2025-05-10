package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteAssetGroupResponse.
  * @param deletedAssetGroups A list of ids of successfully deleted asset groups.
  * @param exceptions A list of errors associated with the asset groups. Will be returned if there is an error.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class DeleteAssetGroupResponse(
  deletedAssetGroups: Option[List[String]],
  exceptions: Option[List[DeleteAssetGroupResponseExceptionsInner]]
)

object DeleteAssetGroupResponse {
  implicit lazy val deleteAssetGroupResponseJsonFormat: Format[DeleteAssetGroupResponse] = Json.format[DeleteAssetGroupResponse]
}

