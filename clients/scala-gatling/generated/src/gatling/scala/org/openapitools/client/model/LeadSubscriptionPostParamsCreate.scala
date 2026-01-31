
package org.openapitools.client.model


case class LeadSubscriptionPostParamsCreate (
    /* Lead form ID. */
    _leadFormId: Option[String],
    /* Standard HTTPS webhook URL. */
    _webhookUrl: String,
    /* Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
    _partnerAccessToken: Option[String],
    _partnerMetadata: Option[LeadSubscriptionPostParamsCreateAllOfPartnerMetadata],
    /* Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
    _partnerRefreshToken: Option[String]
)
object LeadSubscriptionPostParamsCreate {
    def toStringBody(var_leadFormId: Object, var_webhookUrl: Object, var_partnerAccessToken: Object, var_partnerMetadata: Object, var_partnerRefreshToken: Object) =
        s"""
        | {
        | "leadFormId":$var_leadFormId,"webhookUrl":$var_webhookUrl,"partnerAccessToken":$var_partnerAccessToken,"partnerMetadata":$var_partnerMetadata,"partnerRefreshToken":$var_partnerRefreshToken
        | }
        """.stripMargin
}
