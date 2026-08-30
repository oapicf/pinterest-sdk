package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param answers Test lead answers. Should follow the creation order.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class LeadFormTestCreate(
  answers: List[String]
)

object LeadFormTestCreate {
  implicit lazy val leadFormTestCreateJsonFormat: Format[LeadFormTestCreate] = Json.format[LeadFormTestCreate]
}

