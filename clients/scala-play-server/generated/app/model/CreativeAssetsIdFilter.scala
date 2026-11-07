package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreativeAssetsIdFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CreativeAssetsIdFilter(
  CREATIVE_ASSETS_ID: CatalogsProductGroupMultipleStringCriteria
)

object CreativeAssetsIdFilter {
  implicit lazy val creativeAssetsIdFilterJsonFormat: Format[CreativeAssetsIdFilter] = Json.format[CreativeAssetsIdFilter]
}

