package model

import play.api.libs.json._

/**
  * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsStatus(
)

object CatalogsStatus {
  implicit lazy val catalogsStatusJsonFormat: Format[CatalogsStatus] = Json.format[CatalogsStatus]
}

