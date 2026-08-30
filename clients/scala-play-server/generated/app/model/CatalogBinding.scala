package model

import play.api.libs.json._

/**
  * Information about a catalog asset.
  * @param catalogType Catalog type
  * @param id Catalog ID.
  * @param name Catalog name
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogBinding(
  catalogType: Option[String],
  id: Option[String],
  name: Option[String]
)

object CatalogBinding {
  implicit lazy val catalogBindingJsonFormat: Format[CatalogBinding] = Json.format[CatalogBinding]
}

