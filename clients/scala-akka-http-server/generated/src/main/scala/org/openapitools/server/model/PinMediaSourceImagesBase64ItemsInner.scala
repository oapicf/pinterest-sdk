package org.openapitools.server.model


/**
 * @param title  for example: ''null''
 * @param description  for example: ''null''
 * @param link Destination link for the image. for example: ''null''
 * @param contentType  for example: ''null''
 * @param data Image to upload as base64 string. for example: ''null''
*/
final case class PinMediaSourceImagesBase64ItemsInner (
  title: Option[String] = None,
  description: Option[String] = None,
  link: Option[String] = None,
  contentType: String,
  data: String
)

