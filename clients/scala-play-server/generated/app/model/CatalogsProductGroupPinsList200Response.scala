package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_product_group_pins_list_200_response.
  * @param items Pins
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsProductGroupPinsList200Response(
  items: List[CatalogsProduct],
  bookmark: Option[String]
)

object CatalogsProductGroupPinsList200Response {
  implicit lazy val catalogsProductGroupPinsList200ResponseJsonFormat: Format[CatalogsProductGroupPinsList200Response] = Json.format[CatalogsProductGroupPinsList200Response]
}

