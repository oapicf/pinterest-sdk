package org.openapitools.server.model


/**
 * @param assetGroupId Asset group id of the exception. for example: ''null''
 * @param code Error code associated with the error deleting asset group. for example: ''null''
 * @param message Error message associated with the error deleting asset group. for example: ''null''
*/
final case class AssetGroupDeleteError (
  assetGroupId: Option[String] = None,
  code: Option[Int] = None,
  message: Option[String] = None
)

