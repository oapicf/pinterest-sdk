package org.openapitools.server.model


/**
 * Paginated response for business member assets with total count metadata.
 *
 * @param bookmark  for example: ''null''
 * @param items  for example: ''null''
 * @param totalDataCount Total number of assets matching the query for example: ''null''
 * @param totalDataCountByStatus Breakdown of asset counts by entity status (ad accounts only) for example: ''null''
*/
final case class BusinessMemberAssetsGetResponse (
  bookmark: Option[String] = None,
  items: Seq[AssetIdPermissions],
  totalDataCount: Int,
  totalDataCountByStatus: Option[TotalCountByEntityStatus] = None
)

