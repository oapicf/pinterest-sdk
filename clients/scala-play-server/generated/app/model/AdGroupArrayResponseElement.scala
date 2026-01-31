package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupArrayResponseElement.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdGroupArrayResponseElement(
  data: Option[AdGroupResponse],
  exceptions: Option[List[Exception]]
)

object AdGroupArrayResponseElement {
  implicit lazy val adGroupArrayResponseElementJsonFormat: Format[AdGroupArrayResponseElement] = Json.format[AdGroupArrayResponseElement]
}

