package model

import play.api.libs.json._

/**
  * Object describing a hotel item error
  * @param errors Array with the errors for the item id requested
  * @param hotelId The catalog hotel id in the merchant namespace
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelItemErrorResponse(
  catalogType: CatalogsType,
  errors: List[ItemValidationEvent],
  hotelId: Option[String]
)

object CatalogsHotelItemErrorResponse {
  implicit lazy val catalogsHotelItemErrorResponseJsonFormat: Format[CatalogsHotelItemErrorResponse] = Json.format[CatalogsHotelItemErrorResponse]
}

