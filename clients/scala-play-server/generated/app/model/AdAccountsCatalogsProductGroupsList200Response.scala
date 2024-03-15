package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_accounts_catalogs_product_groups_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdAccountsCatalogsProductGroupsList200Response(
  items: List[CatalogProductGroup],
  bookmark: Option[String]
)

object AdAccountsCatalogsProductGroupsList200Response {
  implicit lazy val adAccountsCatalogsProductGroupsList200ResponseJsonFormat: Format[AdAccountsCatalogsProductGroupsList200Response] = Json.format[AdAccountsCatalogsProductGroupsList200Response]
}

