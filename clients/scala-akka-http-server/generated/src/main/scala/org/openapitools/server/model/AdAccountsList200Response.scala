package org.openapitools.server.model


/**
 * @param items Ad accounts for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class AdAccountsList200Response (
  items: Seq[AdAccount],
  bookmark: Option[String] = None
)

