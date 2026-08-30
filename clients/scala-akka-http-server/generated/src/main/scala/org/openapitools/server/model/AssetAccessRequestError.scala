package org.openapitools.server.model


/**
 * @param code Error code associated with the error in requesting asset access. for example: ''null''
 * @param messages  for example: ''null''
*/
final case class AssetAccessRequestError (
  code: Option[Int] = None,
  messages: Option[Seq[String]] = None
)

