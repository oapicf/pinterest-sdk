package model

import play.api.libs.json._

/**
  * The counts can be null early in the process.
  * @param original The number of products in the feed file.
  * @param ingested The number of products successfully ingested from the feed file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsFeedProductCounts(
  original: Option[Int],
  ingested: Option[Int]
)

object CatalogsFeedProductCounts {
  implicit lazy val catalogsFeedProductCountsJsonFormat: Format[CatalogsFeedProductCounts] = Json.format[CatalogsFeedProductCounts]
}

