package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CarouselSlot.
  * @param description Carousel Pin slot description.
  * @param link Carousel Pin slot link.
  * @param title Carousel Pin slot title.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CarouselSlot(
  description: Option[String],
  link: Option[String],
  title: Option[String]
)

object CarouselSlot {
  implicit lazy val carouselSlotJsonFormat: Format[CarouselSlot] = Json.format[CarouselSlot]
}

