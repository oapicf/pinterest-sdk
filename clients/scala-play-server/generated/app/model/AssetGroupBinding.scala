package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetGroupBinding.
  * @param id Asset Group ID.
  * @param assetGroupName Asset Group name
  * @param assetGroupDescription Asset group description
  * @param assetGroupTypes Asset group types
  * @param adAccountsIds A list of ad account IDs under the asset group
  * @param profilesIds A list of profile IDs under asset group
  * @param createdTime The creation time of the asset group
  * @param updatedTime The last update time of the asset group
  * @param owner The data of the business that owns the asset group.
  * @param createdBy The data of the user that created the asset group.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AssetGroupBinding(
  id: Option[String],
  assetGroupName: Option[String],
  assetGroupDescription: Option[String],
  assetGroupTypes: Option[List[String]],
  adAccountsIds: Option[List[String]],
  profilesIds: Option[List[String]],
  createdTime: Option[Int],
  updatedTime: Option[Int],
  owner: Option[BusinessAccessUserSummary],
  createdBy: Option[BusinessAccessUserSummary]
)

object AssetGroupBinding {
  implicit lazy val assetGroupBindingJsonFormat: Format[AssetGroupBinding] = Json.format[AssetGroupBinding]
}

