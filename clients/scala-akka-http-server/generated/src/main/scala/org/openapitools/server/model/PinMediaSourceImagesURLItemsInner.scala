package org.openapitools.server.model


/**
 * @param title  for example: ''null''
 * @param description  for example: ''null''
 * @param link Destination link for the image. for example: ''null''
 * @param url URL of image to upload. for example: ''null''
*/
final case class PinMediaSourceImagesURLItemsInner (
  title: Option[String] = None,
  description: Option[String] = None,
  link: Option[String] = None,
  url: String
)

