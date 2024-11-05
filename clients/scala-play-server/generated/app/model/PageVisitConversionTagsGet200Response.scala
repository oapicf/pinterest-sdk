package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for page_visit_conversion_tags_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class PageVisitConversionTagsGet200Response(
  items: List[ConversionEventResponse],
  bookmark: Option[String]
)

object PageVisitConversionTagsGet200Response {
  implicit lazy val pageVisitConversionTagsGet200ResponseJsonFormat: Format[PageVisitConversionTagsGet200Response] = Json.format[PageVisitConversionTagsGet200Response]
}

