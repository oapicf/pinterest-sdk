package model

import play.api.libs.json._

/**
  * Select whether to promote the image or video pin by default for items in the promoted product group. If selecting IMAGE, image will be promoted for all ads in the product group, and when selecting VIDEO, video will be promoted when present, otherwise fall back to image. This is applicable for standard shopping ads only.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class PreferredMediaType(
)

object PreferredMediaType {
  implicit lazy val preferredMediaTypeJsonFormat: Format[PreferredMediaType] = Json.format[PreferredMediaType]
}

