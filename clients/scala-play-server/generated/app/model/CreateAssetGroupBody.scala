package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateAssetGroupBody.
  * @param assetGroupName Asset Group name
  * @param assetGroupDescription Asset group description
  * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateAssetGroupBody(
  assetGroupName: String,
  assetGroupDescription: String,
  assetGroupTypes: List[AssetGroupType]
)

object CreateAssetGroupBody {
  implicit lazy val createAssetGroupBodyJsonFormat: Format[CreateAssetGroupBody] = Json.format[CreateAssetGroupBody]
}

