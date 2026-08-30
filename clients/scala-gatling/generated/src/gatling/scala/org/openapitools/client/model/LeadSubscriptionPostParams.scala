
package org.openapitools.client.model


case class LeadSubscriptionPostParams (
    /* The Ad Account ID that this lead form belongs to. */
    _adAccountId: Option[String],
    /* API version. */
    _apiVersion: Option[String],
    /* Subscription creation time. Unix timestamp in milliseconds. */
    _createdTime: Option[Integer],
    /* Lead data encryption algorithm. */
    _cryptographicAlgorithm: Option[String],
    /* Base64 encoded key for client to decrypt lead data. */
    _cryptographicKey: Option[String],
    /* Subscription ID. */
    _id: Option[String],
    /* Lead form ID. */
    _leadFormId: Option[String],
    /* User account used to subscribe lead data. */
    _userAccountId: Option[String],
    /* Standard HTTPS webhook URL. */
    _webhookUrl: Option[String],
    /* Partner access token. Only for clients that requires authentication. We recommend to avoid this param. */
    _partnerAccessToken: Option[String],
    /* Partner metadata. Only for clients that requires special handling. We recommend to avoid this param. */
    _partnerMetadata: Option[PartnerMetadata],
    /* Partner refresh token. Only for clients that requires authentication. We recommend to avoid this param. */
    _partnerRefreshToken: Option[String]
)
object LeadSubscriptionPostParams {
    def toStringBody(var_adAccountId: Object, var_apiVersion: Object, var_createdTime: Object, var_cryptographicAlgorithm: Object, var_cryptographicKey: Object, var_id: Object, var_leadFormId: Object, var_userAccountId: Object, var_webhookUrl: Object, var_partnerAccessToken: Object, var_partnerMetadata: Object, var_partnerRefreshToken: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"apiVersion":$var_apiVersion,"createdTime":$var_createdTime,"cryptographicAlgorithm":$var_cryptographicAlgorithm,"cryptographicKey":$var_cryptographicKey,"id":$var_id,"leadFormId":$var_leadFormId,"userAccountId":$var_userAccountId,"webhookUrl":$var_webhookUrl,"partnerAccessToken":$var_partnerAccessToken,"partnerMetadata":$var_partnerMetadata,"partnerRefreshToken":$var_partnerRefreshToken
        | }
        """.stripMargin
}
