package org.openapitools.server.model


/**
 * An object with a list of partners that were deleted.
 *
 * @param deletedPartners List of partners whose business partnership have been terminated. for example: ''["809944451643622187","383791336903426391"]''
*/
final case class DeletePartnersResponse (
  deletedPartners: Option[Seq[String]] = None
)

