package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_groups_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AdGroupsList200Response(
  items: List[AdGroupResponse],
  bookmark: Option[String]
)

object AdGroupsList200Response {
  implicit lazy val adGroupsList200ResponseJsonFormat: Format[AdGroupsList200Response] = Json.format[AdGroupsList200Response]
}

