
package org.openapitools.client.model


case class CampaignAdPreviewCreate (
    /* Ad group ID to create a preview record for. */
    _adGroupId: String
)
object CampaignAdPreviewCreate {
    def toStringBody(var_adGroupId: Object) =
        s"""
        | {
        | "adGroupId":$var_adGroupId
        | }
        """.stripMargin
}
