package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreativeAssetsIdFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreativeAssetsIdFilter(
  CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria
)

object CreativeAssetsIdFilter {
  implicit lazy val creativeAssetsIdFilterJsonFormat: Format[CreativeAssetsIdFilter] = Json.format[CreativeAssetsIdFilter]
}

