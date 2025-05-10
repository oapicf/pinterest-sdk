package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for Paginated.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class Paginated(
  items: List[JsObject],
  bookmark: Option[String]
)

object Paginated {
  implicit lazy val paginatedJsonFormat: Format[Paginated] = Json.format[Paginated]
}

