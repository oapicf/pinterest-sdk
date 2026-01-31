package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_product_group_pins_list_200_response.
  * @param items Pins
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsProductGroupPinsList200Response(
  bookmark: Option[String],
  items: List[CatalogsProduct]
)

object CatalogsProductGroupPinsList200Response {
  implicit lazy val catalogsProductGroupPinsList200ResponseJsonFormat: Format[CatalogsProductGroupPinsList200Response] = Json.format[CatalogsProductGroupPinsList200Response]
}

