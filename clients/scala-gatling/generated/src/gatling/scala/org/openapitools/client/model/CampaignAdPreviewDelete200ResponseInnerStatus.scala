
package org.openapitools.client.model


case class CampaignAdPreviewDelete200ResponseInnerStatus (
    _statusCode: Number,
    _code: Integer,
    _message: String
)
object CampaignAdPreviewDelete200ResponseInnerStatus {
    def toStringBody(var_statusCode: Object, var_code: Object, var_message: Object) =
        s"""
        | {
        | "statusCode":$var_statusCode,"code":$var_code,"message":$var_message
        | }
        """.stripMargin
}
