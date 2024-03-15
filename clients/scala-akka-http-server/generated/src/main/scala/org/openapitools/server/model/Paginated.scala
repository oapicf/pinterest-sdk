package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class Paginated (
  items: Seq[Any],
  bookmark: Option[String] = None
)

