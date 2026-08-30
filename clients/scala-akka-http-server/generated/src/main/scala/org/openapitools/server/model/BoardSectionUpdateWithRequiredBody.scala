package org.openapitools.server.model


/**
 * Resource create or update operation model with required body fields (no OptionalProperties).
 *
 * @param id  for example: ''549755885175''
 * @param name  for example: ''Salads''
*/
final case class BoardSectionUpdateWithRequiredBody (
  id: Option[String] = None,
  name: String
)

