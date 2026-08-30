package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for audiences_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AudiencesList200Response(
  bookmark: Option[String],
  items: List[AdAccountsAudience]
)

object AudiencesList200Response {
  implicit lazy val audiencesList200ResponseJsonFormat: Format[AudiencesList200Response] = Json.format[AudiencesList200Response]
}

