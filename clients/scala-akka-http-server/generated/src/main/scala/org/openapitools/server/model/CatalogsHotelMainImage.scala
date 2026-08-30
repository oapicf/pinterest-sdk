package org.openapitools.server.model


/**
 * The main hotel image
 *
 * @param link <= 2000 characters. The link to the main hotel image. Image should be at least 75x75 pixels to avoid errors. Must start with http:// or https://. for example: ''null''
 * @param tag Tag appended to the image that identifies image category or details. There can be multiple tags associated with an image for example: ''null''
*/
final case class CatalogsHotelMainImage (
  link: Option[String] = None,
  tag: Option[Seq[String]] = None
)

