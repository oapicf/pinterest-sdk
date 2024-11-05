package org.openapitools.server.model


/**
 * @param exceptions A list of errors associated with the asset access requests. Will be returned if there is an error. for example: ''null''
 * @param invites  for example: ''{"766456567741825556":"5349280584552211583","733242520489967216":"5349280584552211845"}''
*/
final case class CreateAssetAccessRequestResponse (
  exceptions: Option[Seq[CreateAssetAccessRequestErrorMessageInner]] = None,
  invites: Option[Map[String, String]] = None
)

