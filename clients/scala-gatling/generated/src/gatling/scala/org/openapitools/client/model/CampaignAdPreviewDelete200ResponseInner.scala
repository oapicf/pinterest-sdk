
package org.openapitools.client.model


case class CampaignAdPreviewDelete200ResponseInner (
    _status: CampaignAdPreviewDelete200ResponseInnerStatus
)
object CampaignAdPreviewDelete200ResponseInner {
    def toStringBody(var_status: Object) =
        s"""
        | {
        | "status":$var_status
        | }
        """.stripMargin
}
