package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateAssetGroupBody.
  * @param assetGroupsToUpdate A list of asset groups and the data that will be used to update them.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UpdateAssetGroupBody(
  assetGroupsToUpdate: Option[List[UpdateAssetGroupBodyAssetGroupsToUpdateInner]]
)

object UpdateAssetGroupBody {
  implicit lazy val updateAssetGroupBodyJsonFormat: Format[UpdateAssetGroupBody] = Json.format[UpdateAssetGroupBody]
}

