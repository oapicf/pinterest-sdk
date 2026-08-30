package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for catalogs_local_stores_delete_200_response_inner.
  * @param id The ID of the local store.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsLocalStoresDelete200ResponseInner(
  id: String,
  status: CampaignAdPreviewDelete200ResponseInnerStatus
)

object CatalogsLocalStoresDelete200ResponseInner {
  implicit lazy val catalogsLocalStoresDelete200ResponseInnerJsonFormat: Format[CatalogsLocalStoresDelete200ResponseInner] = Json.format[CatalogsLocalStoresDelete200ResponseInner]
}

