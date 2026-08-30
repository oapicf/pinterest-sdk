package model

import play.api.libs.json._

/**
  * Resource create or update operation model with required body fields (no OptionalProperties).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class BoardSectionUpdateWithRequiredBody(
  id: Option[String],
  name: String
)

object BoardSectionUpdateWithRequiredBody {
  implicit lazy val boardSectionUpdateWithRequiredBodyJsonFormat: Format[BoardSectionUpdateWithRequiredBody] = Json.format[BoardSectionUpdateWithRequiredBody]
}

