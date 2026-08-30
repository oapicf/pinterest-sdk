package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for page_visit_conversion_tags_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class PageVisitConversionTagsGet200Response(
  bookmark: Option[String],
  items: List[ConversionEventResponse]
)

object PageVisitConversionTagsGet200Response {
  implicit lazy val pageVisitConversionTagsGet200ResponseJsonFormat: Format[PageVisitConversionTagsGet200Response] = Json.format[PageVisitConversionTagsGet200Response]
}

