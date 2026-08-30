
package org.openapitools.client.model


case class CampaignBatchItem (
    /* Campaign data on success. */
    _data: Option[CampaignBatchResponseData],
    /* Exceptions on failure. */
    _exceptions: Option[List[Exception]]
)
object CampaignBatchItem {
    def toStringBody(var_data: Object, var_exceptions: Object) =
        s"""
        | {
        | "data":$var_data,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
