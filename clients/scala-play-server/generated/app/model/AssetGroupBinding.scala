package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssetGroupBinding.
  * @param adAccountsIds A list of ad account IDs under the asset group
  * @param assetGroupDescription Asset group description
  * @param assetGroupName Asset Group name
  * @param assetGroupTypes Asset group types
  * @param catalogsIds A list of catalog IDs under asset group
  * @param createdBy The data of the user that created the asset group.
  * @param createdTime The creation time of the asset group
  * @param id Asset Group ID.
  * @param owner The data of the business that owns the asset group.
  * @param profilesIds A list of profile IDs under asset group
  * @param updatedTime The last update time of the asset group
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AssetGroupBinding(
  adAccountsIds: List[String],
  assetGroupDescription: String,
  assetGroupName: String,
  assetGroupTypes: List[String],
  catalogsIds: List[String],
  createdBy: BusinessAccessUserSummary,
  createdTime: Int,
  id: String,
  owner: BusinessAccessUserSummary,
  profilesIds: List[String],
  updatedTime: Int
)

object AssetGroupBinding {
  implicit lazy val assetGroupBindingJsonFormat: Format[AssetGroupBinding] = Json.format[AssetGroupBinding]
}

