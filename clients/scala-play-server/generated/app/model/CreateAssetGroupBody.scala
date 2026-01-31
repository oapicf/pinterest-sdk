package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssetGroupBody.
  * @param assetGroupDescription Asset group description
  * @param assetGroupName Asset Group name
  * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateAssetGroupBody(
  assetGroupDescription: String,
  assetGroupName: String,
  assetGroupTypes: List[AssetGroupType]
)

object CreateAssetGroupBody {
  implicit lazy val createAssetGroupBodyJsonFormat: Format[CreateAssetGroupBody] = Json.format[CreateAssetGroupBody]
}

