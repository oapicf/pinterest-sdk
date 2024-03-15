
package org.openapitools.client.model


case class CampaignCreateResponseItem (
    _data: Option[CampaignCreateResponseData],
    _exceptions: Option[List[Exception]]
)
object CampaignCreateResponseItem {
    def toStringBody(var_data: Object, var_exceptions: Object) =
        s"""
        | {
        | "data":$var_data,"exceptions":$var_exceptions
        | }
        """.stripMargin
}
