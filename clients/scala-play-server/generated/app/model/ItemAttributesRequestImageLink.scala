package model

import play.api.libs.json._

/**
  * <= 2000 characters The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ItemAttributesRequestImageLink(
)

object ItemAttributesRequestImageLink {
  implicit lazy val itemAttributesRequestImageLinkJsonFormat: Format[ItemAttributesRequestImageLink] = Json.format[ItemAttributesRequestImageLink]
}

