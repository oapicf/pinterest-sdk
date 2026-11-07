package model

import play.api.libs.json._

/**
  * Creative assets product metadata entity
  * @param creativeAssetsId The user-created unique ID that represents the creative assets item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CatalogsCreativeAssetsProductMetadata(
  creativeAssetsId: String,
  visibility: CreativeAssetsVisibilityType
)

object CatalogsCreativeAssetsProductMetadata {
  implicit lazy val catalogsCreativeAssetsProductMetadataJsonFormat: Format[CatalogsCreativeAssetsProductMetadata] = Json.format[CatalogsCreativeAssetsProductMetadata]
}

