
package org.openapitools.client.model


case class BusinessMemberAssetsGetResponse (
    _bookmark: Option[String],
    _items: List[AssetIdPermissions],
    /* Total number of assets matching the query */
    _totalDataCount: Integer,
    /* Breakdown of asset counts by entity status (ad accounts only) */
    _totalDataCountByStatus: Option[TotalCountByEntityStatus]
)
object BusinessMemberAssetsGetResponse {
    def toStringBody(var_bookmark: Object, var_items: Object, var_totalDataCount: Object, var_totalDataCountByStatus: Object) =
        s"""
        | {
        | "bookmark":$var_bookmark,"items":$var_items,"totalDataCount":$var_totalDataCount,"totalDataCountByStatus":$var_totalDataCountByStatus
        | }
        """.stripMargin
}
