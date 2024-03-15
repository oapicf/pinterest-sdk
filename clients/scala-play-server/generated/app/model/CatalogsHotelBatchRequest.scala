package model

import play.api.libs.json._

/**
  * Request object to update catalogs hotel items
  * @param items Array with catalogs item operations
  * @param catalogId Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsHotelBatchRequest(
  catalogType: CatalogsType,
  country: Country,
  language: Language,
  items: List[CatalogsHotelBatchItem],
  catalogId: Option[String]
)

object CatalogsHotelBatchRequest {
  implicit lazy val catalogsHotelBatchRequestJsonFormat: Format[CatalogsHotelBatchRequest] = Json.format[CatalogsHotelBatchRequest]
}

