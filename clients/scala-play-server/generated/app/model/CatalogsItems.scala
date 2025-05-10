package model

import play.api.libs.json._

/**
  * Response object of catalogs items
  * @param items Array with catalogs items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsItems(
  items: Option[List[ItemResponse]]
)

object CatalogsItems {
  implicit lazy val catalogsItemsJsonFormat: Format[CatalogsItems] = Json.format[CatalogsItems]
}

