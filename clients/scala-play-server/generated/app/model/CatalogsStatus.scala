package model

import play.api.libs.json._

/**
  * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsStatus(
)

object CatalogsStatus {
  implicit lazy val catalogsStatusJsonFormat: Format[CatalogsStatus] = Json.format[CatalogsStatus]
}

