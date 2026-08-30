package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_local_stores_create_200_response_inner_data_oneOf.
  * @param id The ID of the local store.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsLocalStoresCreate200ResponseInnerDataOneOf(
  id: String,
  exceptions: Error
)

object CatalogsLocalStoresCreate200ResponseInnerDataOneOf {
  implicit lazy val catalogsLocalStoresCreate200ResponseInnerDataOneOfJsonFormat: Format[CatalogsLocalStoresCreate200ResponseInnerDataOneOf] = Json.format[CatalogsLocalStoresCreate200ResponseInnerDataOneOf]
}

