package model

import play.api.libs.json._

/**
  * Response object of catalogs items
  * @param items Array with catalogs items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsItems(
  items: Option[List[ItemResponse]]
)

object CatalogsItems {
  implicit lazy val catalogsItemsJsonFormat: Format[CatalogsItems] = Json.format[CatalogsItems]
}

