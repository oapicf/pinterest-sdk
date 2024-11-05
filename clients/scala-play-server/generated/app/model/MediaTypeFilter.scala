package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MediaTypeFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MediaTypeFilter(
  MEDIA_TYPE: CatalogsProductGroupMultipleMediaTypesCriteria
)

object MediaTypeFilter {
  implicit lazy val mediaTypeFilterJsonFormat: Format[MediaTypeFilter] = Json.format[MediaTypeFilter]
}

