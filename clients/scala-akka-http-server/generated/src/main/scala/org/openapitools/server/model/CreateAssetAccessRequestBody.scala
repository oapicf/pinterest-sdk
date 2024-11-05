package org.openapitools.server.model


/**
 * An object containing a list of all the asset access requests
 *
 * @param assetRequests  for example: ''null''
*/
final case class CreateAssetAccessRequestBody (
  assetRequests: Seq[CreateAssetAccessRequestBodyAssetRequestsInner]
)

