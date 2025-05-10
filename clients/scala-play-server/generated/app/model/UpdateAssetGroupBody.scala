package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for UpdateAssetGroupBody.
  * @param assetGroupsToUpdate A list of asset groups and the data that will be used to update them.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class UpdateAssetGroupBody(
  assetGroupsToUpdate: Option[List[UpdateAssetGroupBodyAssetGroupsToUpdateInner]]
)

object UpdateAssetGroupBody {
  implicit lazy val updateAssetGroupBodyJsonFormat: Format[UpdateAssetGroupBody] = Json.format[UpdateAssetGroupBody]
}

