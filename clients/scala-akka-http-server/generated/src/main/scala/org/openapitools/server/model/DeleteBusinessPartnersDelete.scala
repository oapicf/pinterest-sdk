package org.openapitools.server.model


/**
 * @param partnerIds A list of partner ids to be deleted for example: ''null''
 * @param partnerType  for example: ''null''
*/
final case class DeleteBusinessPartnersDelete (
  partnerIds: Seq[String],
  partnerType: Option[NullablePartnerType] = None
)

