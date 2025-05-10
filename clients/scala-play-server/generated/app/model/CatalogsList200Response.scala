package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsList200Response(
  items: List[Catalog],
  bookmark: Option[String]
)

object CatalogsList200Response {
  implicit lazy val catalogsList200ResponseJsonFormat: Format[CatalogsList200Response] = Json.format[CatalogsList200Response]
}

