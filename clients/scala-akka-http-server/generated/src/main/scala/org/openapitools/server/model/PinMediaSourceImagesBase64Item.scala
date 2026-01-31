package org.openapitools.server.model


/**
 * @param contentType  for example: ''null''
 * @param data  for example: ''null''
 * @param description  for example: ''null''
 * @param link  for example: ''null''
 * @param title  for example: ''null''
*/
final case class PinMediaSourceImagesBase64Item (
  contentType: ContentType,
  data: String,
  description: Option[String] = None,
  link: Option[String] = None,
  title: Option[String] = None
)

