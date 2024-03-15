package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class AdsList200Response (
  items: Seq[AdResponse],
  bookmark: Option[String] = None
)

