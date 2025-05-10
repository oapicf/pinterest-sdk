package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupArrayResponseElement.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AdGroupArrayResponseElement(
  data: Option[AdGroupResponse],
  exceptions: Option[List[Exception]]
)

object AdGroupArrayResponseElement {
  implicit lazy val adGroupArrayResponseElementJsonFormat: Format[AdGroupArrayResponseElement] = Json.format[AdGroupArrayResponseElement]
}

