package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for CatalogsDbItem.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsDbItem(
  createdAt: OffsetDateTime,
  id: String,
  updatedAt: OffsetDateTime
)

object CatalogsDbItem {
  implicit lazy val catalogsDbItemJsonFormat: Format[CatalogsDbItem] = Json.format[CatalogsDbItem]
}

