package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for audience_insights_scope_and_type_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AudienceInsightsScopeAndTypeGet200Response(
  items: List[AudienceDefinition]
)

object AudienceInsightsScopeAndTypeGet200Response {
  implicit lazy val audienceInsightsScopeAndTypeGet200ResponseJsonFormat: Format[AudienceInsightsScopeAndTypeGet200Response] = Json.format[AudienceInsightsScopeAndTypeGet200Response]
}

