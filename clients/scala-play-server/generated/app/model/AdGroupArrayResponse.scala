package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AdGroupArrayResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AdGroupArrayResponse(
  items: Option[List[AdGroupArrayResponseElement]]
)

object AdGroupArrayResponse {
  implicit lazy val adGroupArrayResponseJsonFormat: Format[AdGroupArrayResponse] = Json.format[AdGroupArrayResponse]
}

