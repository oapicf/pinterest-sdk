package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for labels_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class LabelsList200Response(
  bookmark: Option[String],
  items: List[LabelsResponse]
)

object LabelsList200Response {
  implicit lazy val labelsList200ResponseJsonFormat: Format[LabelsList200Response] = Json.format[LabelsList200Response]
}

