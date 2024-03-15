package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_product_groups_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsProductGroupsList200Response(
  items: List[CatalogsProductGroupsList200ResponseAllOfItemsInner],
  bookmark: Option[String]
)

object CatalogsProductGroupsList200Response {
  implicit lazy val catalogsProductGroupsList200ResponseJsonFormat: Format[CatalogsProductGroupsList200Response] = Json.format[CatalogsProductGroupsList200Response]
}

