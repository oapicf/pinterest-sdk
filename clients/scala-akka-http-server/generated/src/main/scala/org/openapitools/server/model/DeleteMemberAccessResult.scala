package org.openapitools.server.model


/**
 * The terminated asset access.
 *
 * @param assetId Unique identifier of the business asset. for example: ''549755885175''
 * @param memberId Unique identifier of the business member. for example: ''140943737684417''
*/
final case class DeleteMemberAccessResult (
  assetId: Option[String] = None,
  memberId: Option[String] = None
)

