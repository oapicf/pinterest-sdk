package org.openapitools.server.model


/**
 * @param items  for example: ''null''
*/
final case class ConversionTagListResponse (
  items: Option[Seq[ConversionTagResponse]] = None
)

