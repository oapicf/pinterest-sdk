package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for shared_audiences_for_business_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class SharedAudiencesForBusinessList200Response(
  bookmark: Option[String],
  items: List[Audience]
)

object SharedAudiencesForBusinessList200Response {
  implicit lazy val sharedAudiencesForBusinessList200ResponseJsonFormat: Format[SharedAudiencesForBusinessList200Response] = Json.format[SharedAudiencesForBusinessList200Response]
}

