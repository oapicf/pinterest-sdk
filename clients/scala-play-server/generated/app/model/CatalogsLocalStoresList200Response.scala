package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_local_stores_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsLocalStoresList200Response(
  bookmark: Option[String],
  items: List[LocalStore]
)

object CatalogsLocalStoresList200Response {
  implicit lazy val catalogsLocalStoresList200ResponseJsonFormat: Format[CatalogsLocalStoresList200Response] = Json.format[CatalogsLocalStoresList200Response]
}

