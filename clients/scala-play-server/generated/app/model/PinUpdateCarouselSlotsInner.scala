package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinUpdate_carousel_slots_inner.
  * @param title Carousel Pin slot title.
  * @param description Carousel Pin slot description.
  * @param link Carousel Pin slot link.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class PinUpdateCarouselSlotsInner(
  title: Option[String],
  description: Option[String],
  link: Option[String]
)

object PinUpdateCarouselSlotsInner {
  implicit lazy val pinUpdateCarouselSlotsInnerJsonFormat: Format[PinUpdateCarouselSlotsInner] = Json.format[PinUpdateCarouselSlotsInner]
}

