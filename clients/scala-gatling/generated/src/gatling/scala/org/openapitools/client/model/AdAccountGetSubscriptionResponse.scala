
package org.openapitools.client.model


case class AdAccountGetSubscriptionResponse (
    /* Lead form ID. */
    _leadFormId: Option[String],
    /* Standard HTTPS webhook URL. */
    _webhookUrl: Option[String],
    /* Subscription ID. */
    _id: Option[String],
    /* User account used to subscribe lead data. */
    _userAccountId: Option[String],
    /* The Ad Account ID that this lead form belongs to. */
    _adAccountId: Option[String],
    /* API version. */
    _apiVersion: Option[String],
    /* Base64 encoded key for client to decrypt lead data. */
    _cryptographicKey: Option[String],
    /* Lead data encryption algorithm. */
    _cryptographicAlgorithm: Option[String],
    /* Lead form creation time. Unix timestamp in milliseconds. */
    _createdTime: Option[Integer]
)
object AdAccountGetSubscriptionResponse {
    def toStringBody(var_leadFormId: Object, var_webhookUrl: Object, var_id: Object, var_userAccountId: Object, var_adAccountId: Object, var_apiVersion: Object, var_cryptographicKey: Object, var_cryptographicAlgorithm: Object, var_createdTime: Object) =
        s"""
        | {
        | "leadFormId":$var_leadFormId,"webhookUrl":$var_webhookUrl,"id":$var_id,"userAccountId":$var_userAccountId,"adAccountId":$var_adAccountId,"apiVersion":$var_apiVersion,"cryptographicKey":$var_cryptographicKey,"cryptographicAlgorithm":$var_cryptographicAlgorithm,"createdTime":$var_createdTime
        | }
        """.stripMargin
}
