package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AudienceInsightCategoryArrayResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class AudienceInsightCategoryArrayResponse(
  items: Option[List[AudienceInsightCategoryCommon]]
)

object AudienceInsightCategoryArrayResponse {
  implicit lazy val audienceInsightCategoryArrayResponseJsonFormat: Format[AudienceInsightCategoryArrayResponse] = Json.format[AudienceInsightCategoryArrayResponse]
}

