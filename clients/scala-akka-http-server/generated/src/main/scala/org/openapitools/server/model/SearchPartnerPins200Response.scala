package org.openapitools.server.model


/**
 * @param items  for example: ''null''
 * @param bookmark  for example: ''null''
*/
final case class SearchPartnerPins200Response (
  items: Seq[SummaryPin],
  bookmark: Option[String] = None
)

