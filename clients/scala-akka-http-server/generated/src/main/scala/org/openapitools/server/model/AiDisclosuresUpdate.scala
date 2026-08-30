package org.openapitools.server.model


/**
 * AI disclosure declarations the creator has made about the Pin.
 *
 * @param values List of AI disclosure declarations the creator has made about this Pin. for example: ''null''
*/
final case class AiDisclosuresUpdate (
  values: Option[Seq[AiDisclosureItem]] = None
)

