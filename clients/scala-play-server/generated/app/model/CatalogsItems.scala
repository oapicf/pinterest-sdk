package model

import play.api.libs.json._

/**
  * Response object of catalogs items
  * @param items Array with catalogs items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsItems(
  items: Option[List[ItemResponse]]
)

object CatalogsItems {
  implicit lazy val catalogsItemsJsonFormat: Format[CatalogsItems] = Json.format[CatalogsItems]
}

