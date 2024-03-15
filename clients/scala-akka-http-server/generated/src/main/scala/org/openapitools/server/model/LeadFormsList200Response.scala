package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class LeadFormsList200Response (
  items: Seq[LeadFormResponse],
  bookmark: Option[String] = None
)

