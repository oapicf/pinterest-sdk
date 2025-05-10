package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for CatalogsDbItem.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class CatalogsDbItem(
  createdAt: OffsetDateTime,
  id: String,
  updatedAt: OffsetDateTime
)

object CatalogsDbItem {
  implicit lazy val catalogsDbItemJsonFormat: Format[CatalogsDbItem] = Json.format[CatalogsDbItem]
}

