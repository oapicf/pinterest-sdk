
package org.openapitools.client.model


case class CampaignAdPreviewCreate200ResponseInner (
    _data: CampaignAdPreviewCreate200ResponseInnerData
)
object CampaignAdPreviewCreate200ResponseInner {
    def toStringBody(var_data: Object) =
        s"""
        | {
        | "data":$var_data
        | }
        """.stripMargin
}
