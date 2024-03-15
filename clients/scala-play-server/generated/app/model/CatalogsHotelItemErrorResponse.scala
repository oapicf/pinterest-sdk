package model

import play.api.libs.json._

/**
  * Object describing a hotel item error
  * @param hotelId The catalog hotel id in the merchant namespace
  * @param errors Array with the errors for the item id requested
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsHotelItemErrorResponse(
  catalogType: CatalogsType,
  hotelId: Option[String],
  errors: Option[List[ItemValidationEvent]]
)

object CatalogsHotelItemErrorResponse {
  implicit lazy val catalogsHotelItemErrorResponseJsonFormat: Format[CatalogsHotelItemErrorResponse] = Json.format[CatalogsHotelItemErrorResponse]
}

