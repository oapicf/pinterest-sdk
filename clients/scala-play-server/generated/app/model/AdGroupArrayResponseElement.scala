package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupArrayResponseElement.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdGroupArrayResponseElement(
  data: Option[AdGroupResponse],
  exceptions: Option[List[Exception]]
)

object AdGroupArrayResponseElement {
  implicit lazy val adGroupArrayResponseElementJsonFormat: Format[AdGroupArrayResponseElement] = Json.format[AdGroupArrayResponseElement]
}

