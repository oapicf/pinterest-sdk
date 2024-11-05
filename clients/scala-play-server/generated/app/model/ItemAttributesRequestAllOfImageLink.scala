package model

import play.api.libs.json._

/**
  * <p><= 2000 characters</p> <p>The links to the main product images. Images should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your product. The URL of your image_link must be accessible by the Pinterest user-agent, and send the accurate images. Please make sure there are no template or placeholder images at the link. Must start with http:// or https://.</p>
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ItemAttributesRequestAllOfImageLink(
)

object ItemAttributesRequestAllOfImageLink {
  implicit lazy val itemAttributesRequestAllOfImageLinkJsonFormat: Format[ItemAttributesRequestAllOfImageLink] = Json.format[ItemAttributesRequestAllOfImageLink]
}

