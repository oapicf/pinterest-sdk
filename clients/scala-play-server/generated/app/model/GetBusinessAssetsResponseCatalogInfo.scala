package model

import play.api.libs.json._

/**
  * An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'.
  * @param catalogType Catalog type
  * @param id Catalog ID.
  * @param name Catalog name
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GetBusinessAssetsResponseCatalogInfo(
  catalogType: Option[String],
  id: Option[String],
  name: Option[String]
)

object GetBusinessAssetsResponseCatalogInfo {
  implicit lazy val getBusinessAssetsResponseCatalogInfoJsonFormat: Format[GetBusinessAssetsResponseCatalogInfo] = Json.format[GetBusinessAssetsResponseCatalogInfo]
}

