package model

import play.api.libs.json._

/**
  * A request object that can have multiple operations on a single retail batch
  * @param items Array with catalogs item operations
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsRetailBatchRequest(
  catalogType: CatalogsRetailBatchRequest.CatalogType.Value,
  country: Country,
  language: CatalogsItemsRequestLanguage,
  items: List[CatalogsRetailBatchRequestItemsInner]
)

object CatalogsRetailBatchRequest {
  implicit lazy val catalogsRetailBatchRequestJsonFormat: Format[CatalogsRetailBatchRequest] = Json.format[CatalogsRetailBatchRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val RETAIL = Value("RETAIL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

