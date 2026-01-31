package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedIngestionInfo.
  * @param IN_STOCK The number of ingested products that are in stock.
  * @param OUT_OF_STOCK The number of ingested products that are in out of stock.
  * @param PREORDER The number of ingested products that are in preorder.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsFeedIngestionInfo(
  IN_STOCK: Option[Int],
  OUT_OF_STOCK: Option[Int],
  PREORDER: Option[Int]
)

object CatalogsFeedIngestionInfo {
  implicit lazy val catalogsFeedIngestionInfoJsonFormat: Format[CatalogsFeedIngestionInfo] = Json.format[CatalogsFeedIngestionInfo]
}

