package model

import play.api.libs.json._

/**
  * The counts can be null early in the process.
  * @param ingested The number of products successfully ingested from the feed file.
  * @param original The number of products in the feed file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsFeedProductCounts(
  ingested: Option[Int],
  original: Option[Int]
)

object CatalogsFeedProductCounts {
  implicit lazy val catalogsFeedProductCountsJsonFormat: Format[CatalogsFeedProductCounts] = Json.format[CatalogsFeedProductCounts]
}

