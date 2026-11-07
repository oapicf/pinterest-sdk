package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CarouselSlot.
  * @param description Carousel Pin slot description.
  * @param link Carousel Pin slot link.
  * @param title Carousel Pin slot title.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class CarouselSlot(
  description: Option[String],
  link: Option[String],
  title: Option[String]
)

object CarouselSlot {
  implicit lazy val carouselSlotJsonFormat: Format[CarouselSlot] = Json.format[CarouselSlot]
}

