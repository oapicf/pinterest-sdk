package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for page_visit_conversion_tags_get_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PageVisitConversionTagsGet200Response(
  bookmark: Option[String],
  items: List[ConversionEventResponse]
)

object PageVisitConversionTagsGet200Response {
  implicit lazy val pageVisitConversionTagsGet200ResponseJsonFormat: Format[PageVisitConversionTagsGet200Response] = Json.format[PageVisitConversionTagsGet200Response]
}

