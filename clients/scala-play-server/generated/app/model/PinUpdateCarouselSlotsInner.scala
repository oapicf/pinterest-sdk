package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for PinUpdate_carousel_slots_inner.
  * @param title Carousel Pin slot title.
  * @param description Carousel Pin slot description.
  * @param link Carousel Pin slot link.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class PinUpdateCarouselSlotsInner(
  title: Option[String],
  description: Option[String],
  link: Option[String]
)

object PinUpdateCarouselSlotsInner {
  implicit lazy val pinUpdateCarouselSlotsInnerJsonFormat: Format[PinUpdateCarouselSlotsInner] = Json.format[PinUpdateCarouselSlotsInner]
}

