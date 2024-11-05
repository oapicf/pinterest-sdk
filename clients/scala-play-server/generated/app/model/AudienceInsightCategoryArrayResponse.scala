package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceInsightCategoryArrayResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AudienceInsightCategoryArrayResponse(
  items: Option[List[AudienceInsightCategoryCommon]]
)

object AudienceInsightCategoryArrayResponse {
  implicit lazy val audienceInsightCategoryArrayResponseJsonFormat: Format[AudienceInsightCategoryArrayResponse] = Json.format[AudienceInsightCategoryArrayResponse]
}

