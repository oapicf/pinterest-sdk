package model

import play.api.libs.json._

/**
  * Status for catalogs entities. Present in catalogs_feed values. When a feed is deleted, the response will inform DELETED as status.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2022-05-07T10:47:31.836531Z[Etc/UTC]")
case class CatalogsStatus(
)

object CatalogsStatus {
  implicit lazy val catalogsStatusJsonFormat: Format[CatalogsStatus] = Json.format[CatalogsStatus]
}

