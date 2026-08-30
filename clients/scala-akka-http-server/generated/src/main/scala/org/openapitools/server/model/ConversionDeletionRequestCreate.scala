package org.openapitools.server.model


/**
 * Resource create operation model.
 *
 * @param deletionTargets Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request. for example: ''null''
*/
final case class ConversionDeletionRequestCreate (
  deletionTargets: ConversionDeletionRequestTargets
)

