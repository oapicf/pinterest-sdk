package org.openapitools.server.model


/**
 * @param partnerIds  for example: ''null''
 * @param partnerType  for example: ''null''
*/
final case class DeletePartnersRequest (
  partnerIds: Seq[String],
  partnerType: Option[String] = None
)

