package model

import play.api.libs.json._

/**
  * The counts can be null early in the process.
  * @param original The number of products in the feed file.
  * @param ingested The number of products successfully ingested from the feed file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsFeedProductCounts(
  original: Option[Int],
  ingested: Option[Int]
)

object CatalogsFeedProductCounts {
  implicit lazy val catalogsFeedProductCountsJsonFormat: Format[CatalogsFeedProductCounts] = Json.format[CatalogsFeedProductCounts]
}

