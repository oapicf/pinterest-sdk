package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_local_stores_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsLocalStoresList200Response(
  bookmark: Option[String],
  items: List[LocalStore]
)

object CatalogsLocalStoresList200Response {
  implicit lazy val catalogsLocalStoresList200ResponseJsonFormat: Format[CatalogsLocalStoresList200Response] = Json.format[CatalogsLocalStoresList200Response]
}

