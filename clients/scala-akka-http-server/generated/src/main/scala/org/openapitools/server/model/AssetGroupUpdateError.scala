package org.openapitools.server.model


/**
 * @param assetGroupId  for example: ''null''
 * @param code  for example: ''null''
 * @param message  for example: ''null''
*/
final case class AssetGroupUpdateError (
  assetGroupId: Option[String] = None,
  code: Option[Int] = None,
  message: Option[String] = None
)

