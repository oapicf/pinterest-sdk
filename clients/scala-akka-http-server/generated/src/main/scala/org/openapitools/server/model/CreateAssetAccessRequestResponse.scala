package org.openapitools.server.model


/**
 * @param exceptions A list of errors associated with the asset access requests. Will be returned if there is an error. for example: ''null''
 * @param invites An object mapping each partner id to the asset access request id. Only one request id is returned per partner. for example: ''{"766456567741825556":"5349280584552211583","733242520489967216":"5349280584552211845"}''
*/
final case class CreateAssetAccessRequestResponse (
  exceptions: Option[Seq[AssetAccessRequestError]] = None,
  invites: Option[Map[String, String]] = None
)

