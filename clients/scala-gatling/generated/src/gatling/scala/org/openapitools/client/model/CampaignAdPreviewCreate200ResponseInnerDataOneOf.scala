
package org.openapitools.client.model


case class CampaignAdPreviewCreate200ResponseInnerDataOneOf (
    _exceptions: Error
)
object CampaignAdPreviewCreate200ResponseInnerDataOneOf {
    def toStringBody(var_exceptions: Object) =
        s"""
        | {
        | "exceptions":$var_exceptions
        | }
        """.stripMargin
}
