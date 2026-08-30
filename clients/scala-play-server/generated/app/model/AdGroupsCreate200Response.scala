package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ad_groups_create_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdGroupsCreate200Response(
  items: List[AdGroupsCreate200ResponseItemsInner]
)

object AdGroupsCreate200Response {
  implicit lazy val adGroupsCreate200ResponseJsonFormat: Format[AdGroupsCreate200Response] = Json.format[AdGroupsCreate200Response]
}

