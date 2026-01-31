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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AssetGroupBinding(
  adAccountsIds: Option[List[String]],
  assetGroupDescription: Option[String],
  assetGroupName: Option[String],
  assetGroupTypes: Option[List[String]],
  catalogsIds: Option[List[String]],
  createdBy: Option[BusinessAccessUserSummary],
  createdTime: Option[Int],
  id: Option[String],
  owner: Option[BusinessAccessUserSummary],
  profilesIds: Option[List[String]],
  updatedTime: Option[Int]
)

object AssetGroupBinding {
  implicit lazy val assetGroupBindingJsonFormat: Format[AssetGroupBinding] = Json.format[AssetGroupBinding]
}

