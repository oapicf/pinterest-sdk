package org.openapitools.server.model


/**
 * @param description Carousel Pin slot description. for example: ''null''
 * @param link Carousel Pin slot link. for example: ''null''
 * @param title Carousel Pin slot title. for example: ''null''
*/
final case class CarouselSlot (
  description: Option[String] = None,
  link: Option[String] = None,
  title: Option[String] = None
)

