package model

import play.api.libs.json._
import java.time.OffsetDateTime

/**
  * Represents the Swagger definition for CatalogsDbItem.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsDbItem(
  createdAt: Option[OffsetDateTime],
  id: Option[String],
  updatedAt: Option[OffsetDateTime]
)

object CatalogsDbItem {
  implicit lazy val catalogsDbItemJsonFormat: Format[CatalogsDbItem] = Json.format[CatalogsDbItem]
}

