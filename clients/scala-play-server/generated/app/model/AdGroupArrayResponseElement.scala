package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupArrayResponseElement.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdGroupArrayResponseElement(
  data: Option[AdGroupResponse],
  exceptions: Option[List[Exception]]
)

object AdGroupArrayResponseElement {
  implicit lazy val adGroupArrayResponseElementJsonFormat: Format[AdGroupArrayResponseElement] = Json.format[AdGroupArrayResponseElement]
}

