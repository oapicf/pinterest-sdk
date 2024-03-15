package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class PinsList200Response (
  items: Seq[Pin],
  bookmark: Option[String] = None
)

