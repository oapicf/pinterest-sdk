package org.openapitools.server.model


/**
 * @param items Media for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class MediaList200Response (
  items: Seq[MediaUploadDetails],
  bookmark: Option[String] = None
)

