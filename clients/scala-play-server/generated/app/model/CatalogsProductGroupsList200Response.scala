package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_product_groups_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsProductGroupsList200Response(
  items: List[CatalogsVerticalProductGroup],
  bookmark: Option[String]
)

object CatalogsProductGroupsList200Response {
  implicit lazy val catalogsProductGroupsList200ResponseJsonFormat: Format[CatalogsProductGroupsList200Response] = Json.format[CatalogsProductGroupsList200Response]
}

