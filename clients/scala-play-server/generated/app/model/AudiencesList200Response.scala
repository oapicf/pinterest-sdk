package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for audiences_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AudiencesList200Response(
  bookmark: Option[String],
  items: List[AdAccountsAudience]
)

object AudiencesList200Response {
  implicit lazy val audiencesList200ResponseJsonFormat: Format[AudiencesList200Response] = Json.format[AudiencesList200Response]
}

