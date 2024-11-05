package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateAssetGroupBody.
  * @param assetGroupsToUpdate A list of asset groups and the data that will be used to update them.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class UpdateAssetGroupBody(
  assetGroupsToUpdate: Option[List[UpdateAssetGroupBodyAssetGroupsToUpdateInner]]
)

object UpdateAssetGroupBody {
  implicit lazy val updateAssetGroupBodyJsonFormat: Format[UpdateAssetGroupBody] = Json.format[UpdateAssetGroupBody]
}

