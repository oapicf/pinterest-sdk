package model

import play.api.libs.json._

/**
  * Request body used to delete asset groups
  * @param assetGroupsToDelete List of ids of asset groups to be deleted
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class DeleteAssetGroupBody(
  assetGroupsToDelete: List[String]
)

object DeleteAssetGroupBody {
  implicit lazy val deleteAssetGroupBodyJsonFormat: Format[DeleteAssetGroupBody] = Json.format[DeleteAssetGroupBody]
}

