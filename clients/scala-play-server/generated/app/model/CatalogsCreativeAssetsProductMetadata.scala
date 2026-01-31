package model

import play.api.libs.json._

/**
  * Creative assets product metadata entity
  * @param creativeAssetsId The user-created unique ID that represents the creative assets item.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsCreativeAssetsProductMetadata(
  creativeAssetsId: String,
  visibility: CreativeAssetsVisibilityType
)

object CatalogsCreativeAssetsProductMetadata {
  implicit lazy val catalogsCreativeAssetsProductMetadataJsonFormat: Format[CatalogsCreativeAssetsProductMetadata] = Json.format[CatalogsCreativeAssetsProductMetadata]
}

