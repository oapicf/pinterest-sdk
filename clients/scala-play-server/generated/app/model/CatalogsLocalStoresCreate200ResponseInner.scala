package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_local_stores_create_200_response_inner.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsLocalStoresCreate200ResponseInner(
  data: CatalogsLocalStoresCreate200ResponseInnerData
)

object CatalogsLocalStoresCreate200ResponseInner {
  implicit lazy val catalogsLocalStoresCreate200ResponseInnerJsonFormat: Format[CatalogsLocalStoresCreate200ResponseInner] = Json.format[CatalogsLocalStoresCreate200ResponseInner]
}

