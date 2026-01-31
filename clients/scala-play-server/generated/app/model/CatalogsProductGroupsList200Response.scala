package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_product_groups_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsProductGroupsList200Response(
  bookmark: Option[String],
  items: List[CatalogsVerticalProductGroup]
)

object CatalogsProductGroupsList200Response {
  implicit lazy val catalogsProductGroupsList200ResponseJsonFormat: Format[CatalogsProductGroupsList200Response] = Json.format[CatalogsProductGroupsList200Response]
}

