package org.openapitools.server.model


/**
 * @param title Carousel Pin slot title. for example: ''null''
 * @param description Carousel Pin slot description. for example: ''null''
 * @param link Carousel Pin slot link. for example: ''null''
*/
final case class PinUpdateCarouselSlotsInner (
  title: Option[String] = None,
  description: Option[String] = None,
  link: Option[String] = None
)

