package model

import play.api.libs.json._

/**
  * The main hotel image
  * @param link <p><= 2000 characters</p> <p>The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Use the additional_image_link field to add more images of your hotel. The URL of your main_image.link must be accessible by the Pinterest user-agent, and send the accurate image. Please make sure there is no template or placeholder image at the link. Must start with http:// or https://.</p>
  * @param tag Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsHotelAttributesAllOfMainImage(
  link: Option[String],
  tag: Option[List[String]]
)

object CatalogsHotelAttributesAllOfMainImage {
  implicit lazy val catalogsHotelAttributesAllOfMainImageJsonFormat: Format[CatalogsHotelAttributesAllOfMainImage] = Json.format[CatalogsHotelAttributesAllOfMainImage]
}

