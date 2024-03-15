package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupArrayResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdGroupArrayResponse(
  items: Option[List[AdGroupArrayResponseElement]]
)

object AdGroupArrayResponse {
  implicit lazy val adGroupArrayResponseJsonFormat: Format[AdGroupArrayResponse] = Json.format[AdGroupArrayResponse]
}

