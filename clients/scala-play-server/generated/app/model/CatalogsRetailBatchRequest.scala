package model

import play.api.libs.json._

/**
  * A request object that can have multiple operations on a single retail batch
  * @param items Array with catalogs item operations
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsRetailBatchRequest(
  catalogType: CatalogsType,
  country: Country,
  language: Language,
  items: List[CatalogsRetailBatchRequestItemsInner]
)

object CatalogsRetailBatchRequest {
  implicit lazy val catalogsRetailBatchRequestJsonFormat: Format[CatalogsRetailBatchRequest] = Json.format[CatalogsRetailBatchRequest]
}

