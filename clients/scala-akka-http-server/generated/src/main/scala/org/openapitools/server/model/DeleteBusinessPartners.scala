package org.openapitools.server.model


/**
 * @param deletedPartners  for example: ''null''
*/
final case class DeleteBusinessPartners (
  deletedPartners: Option[Seq[String]] = None
)

