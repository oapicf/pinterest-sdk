package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param id  for example: ''549755885175''
 * @param name  for example: ''Salads''
*/
final case class BoardSectionCreate (
  id: Option[String] = None,
  name: String
)

