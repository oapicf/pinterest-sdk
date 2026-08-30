package org.openapitools.server.model


/**
 * @param userEmails Array of plain text user emails. for example: ''null''
 * @param epiks Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie). for example: ''null''
*/
final case class ConversionDeletionRequestTargets (
  userEmails: Seq[String],
  epiks: Seq[String]
)

