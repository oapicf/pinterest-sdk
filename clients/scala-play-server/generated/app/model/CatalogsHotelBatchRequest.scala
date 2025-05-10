package model

import play.api.libs.json._

/**
  * Request object to update catalogs hotel items
  * @param items Array with catalogs item operations
  * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsHotelBatchRequest(
  catalogType: CatalogsHotelBatchRequest.CatalogType.Value,
  country: Country,
  language: CatalogsItemsRequestLanguage,
  items: List[CatalogsHotelBatchItem],
  catalogId: Option[String]
)

object CatalogsHotelBatchRequest {
  implicit lazy val catalogsHotelBatchRequestJsonFormat: Format[CatalogsHotelBatchRequest] = Json.format[CatalogsHotelBatchRequest]

  // noinspection TypeAnnotation
  object CatalogType extends Enumeration {
    val HOTEL = Value("HOTEL")

    type CatalogType = Value
    implicit lazy val CatalogTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

