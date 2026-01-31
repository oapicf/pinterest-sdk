
package org.openapitools.client.model


case class AdAccountGetSubscriptionResponse (
    /* Lead form ID. */
    _leadFormId: Option[String],
    /* Standard HTTPS webhook URL. */
    _webhookUrl: Option[String],
    /* The Ad Account ID that this lead form belongs to. */
    _adAccountId: Option[String],
    /* API version. */
    _apiVersion: Option[String],
    /* Lead subscription creation time. Unix timestamp in milliseconds. */
    _createdTime: Option[Integer],
    /* Lead data encryption algorithm. */
    _cryptographicAlgorithm: Option[String],
    /* Base64 encoded key for client to decrypt lead data. */
    _cryptographicKey: Option[String],
    /* Subscription ID. */
    _id: Option[String],
    /* User account used to subscribe lead data. */
    _userAccountId: Option[String]
)
object AdAccountGetSubscriptionResponse {
    def toStringBody(var_leadFormId: Object, var_webhookUrl: Object, var_adAccountId: Object, var_apiVersion: Object, var_createdTime: Object, var_cryptographicAlgorithm: Object, var_cryptographicKey: Object, var_id: Object, var_userAccountId: Object) =
        s"""
        | {
        | "leadFormId":$var_leadFormId,"webhookUrl":$var_webhookUrl,"adAccountId":$var_adAccountId,"apiVersion":$var_apiVersion,"createdTime":$var_createdTime,"cryptographicAlgorithm":$var_cryptographicAlgorithm,"cryptographicKey":$var_cryptographicKey,"id":$var_id,"userAccountId":$var_userAccountId
        | }
        """.stripMargin
}
