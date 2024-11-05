package org.openapitools.server.model


/**
 * @param code Error code associated with the error in requesting asset access. for example: ''2932''
 * @param messages  for example: ''["Invalid asset id: 549760723247","Invalid asset id: 546760723248"]''
*/
final case class CreateAssetAccessRequestErrorMessageInner (
  code: Option[Int] = None,
  messages: Option[Seq[String]] = None
)

