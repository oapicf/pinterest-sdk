package model

import play.api.libs.json._

/**
  * The main hotel image
  * @param link <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://.
  * @param tag Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CatalogsHotelMainImage(
  link: Option[String],
  tag: Option[List[String]]
)

object CatalogsHotelMainImage {
  implicit lazy val catalogsHotelMainImageJsonFormat: Format[CatalogsHotelMainImage] = Json.format[CatalogsHotelMainImage]
}

