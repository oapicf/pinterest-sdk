package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_groups_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AdGroupsList200Response(
  bookmark: Option[String],
  items: List[AdGroupResponse]
)

object AdGroupsList200Response {
  implicit lazy val adGroupsList200ResponseJsonFormat: Format[AdGroupsList200Response] = Json.format[AdGroupsList200Response]
}

