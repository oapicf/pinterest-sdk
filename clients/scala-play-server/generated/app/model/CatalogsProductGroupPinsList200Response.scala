package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_product_group_pins_list_200_response.
  * @param items Pins
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsProductGroupPinsList200Response(
  items: List[CatalogsProduct],
  bookmark: Option[String]
)

object CatalogsProductGroupPinsList200Response {
  implicit lazy val catalogsProductGroupPinsList200ResponseJsonFormat: Format[CatalogsProductGroupPinsList200Response] = Json.format[CatalogsProductGroupPinsList200Response]
}

