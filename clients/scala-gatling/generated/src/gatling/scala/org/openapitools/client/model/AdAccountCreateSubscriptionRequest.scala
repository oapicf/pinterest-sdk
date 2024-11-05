
package org.openapitools.client.model


case class AdAccountCreateSubscriptionRequest (
    /* Standard HTTPS webhook URL. */
    _webhookUrl: String,
    /* Lead form ID. */
    _leadFormId: Option[String],
    /* Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
    _partnerAccessToken: Option[String],
    /* Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
    _partnerRefreshToken: Option[String],
    _partnerMetadata: Option[AdAccountCreateSubscriptionRequestPartnerMetadata]
)
object AdAccountCreateSubscriptionRequest {
    def toStringBody(var_webhookUrl: Object, var_leadFormId: Object, var_partnerAccessToken: Object, var_partnerRefreshToken: Object, var_partnerMetadata: Object) =
        s"""
        | {
        | "webhookUrl":$var_webhookUrl,"leadFormId":$var_leadFormId,"partnerAccessToken":$var_partnerAccessToken,"partnerRefreshToken":$var_partnerRefreshToken,"partnerMetadata":$var_partnerMetadata
        | }
        """.stripMargin
}
