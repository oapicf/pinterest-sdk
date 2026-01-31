package org.openapitools.server.model


/**
 * @param assetGroupId Asset group id of the exception. for example: ''666791336903426391''
 * @param code Error code associated with the error editing asset group. for example: ''29''
 * @param message Error message associated with the error editing asset group. for example: ''You are not permitted to access that resource.''
*/
final case class UpdateAssetGroupResponseExceptionsInner (
  assetGroupId: Option[String] = None,
  code: Option[Int] = None,
  message: Option[String] = None
)

