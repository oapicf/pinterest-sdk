package model

import play.api.libs.json._

/**
  * Request object to list products for a given feed_id and product group filter.
  * @param feedId Catalog Feed id pertaining to the catalog product group filter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsListProductsByFilterRequestOneOf(
  feedId: String,
  filters: CatalogsProductGroupFilters
)

object CatalogsListProductsByFilterRequestOneOf {
  implicit lazy val catalogsListProductsByFilterRequestOneOfJsonFormat: Format[CatalogsListProductsByFilterRequestOneOf] = Json.format[CatalogsListProductsByFilterRequestOneOf]
}

