
package org.openapitools.client.model


case class AdAccountCreateSubscriptionRequest (
    /* Lead form ID. */
    _leadFormId: Option[String],
    /* Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
    _partnerAccessToken: Option[String],
    _partnerMetadata: Option[AdAccountCreateSubscriptionRequestPartnerMetadata],
    /* Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
    _partnerRefreshToken: Option[String],
    /* Standard HTTPS webhook URL. */
    _webhookUrl: String
)
object AdAccountCreateSubscriptionRequest {
    def toStringBody(var_leadFormId: Object, var_partnerAccessToken: Object, var_partnerMetadata: Object, var_partnerRefreshToken: Object, var_webhookUrl: Object) =
        s"""
        | {
        | "leadFormId":$var_leadFormId,"partnerAccessToken":$var_partnerAccessToken,"partnerMetadata":$var_partnerMetadata,"partnerRefreshToken":$var_partnerRefreshToken,"webhookUrl":$var_webhookUrl
        | }
        """.stripMargin
}
