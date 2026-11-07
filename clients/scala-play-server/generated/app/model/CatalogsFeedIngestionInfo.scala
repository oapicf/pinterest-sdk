package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedIngestionInfo.
  * @param IN_STOCK The number of ingested products that are in stock.
  * @param OUT_OF_STOCK The number of ingested products that are in out of stock.
  * @param PREORDER The number of ingested products that are in preorder.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsFeedIngestionInfo(
  IN_STOCK: Option[Int],
  OUT_OF_STOCK: Option[Int],
  PREORDER: Option[Int]
)

object CatalogsFeedIngestionInfo {
  implicit lazy val catalogsFeedIngestionInfoJsonFormat: Format[CatalogsFeedIngestionInfo] = Json.format[CatalogsFeedIngestionInfo]
}

