
package org.openapitools.client.model


case class AdAccountCreateSubscriptionResponse (
    /* Subscription ID. */
    _id: Option[String],
    /* Base64 encoded key for client to decrypt lead data. */
    _cryptographicKey: Option[String],
    /* Lead data encryption algorithm. */
    _cryptographicAlgorithm: Option[String],
    /* Subscription creation time. Unix timestamp in milliseconds. */
    _createdTime: Option[Integer]
)
object AdAccountCreateSubscriptionResponse {
    def toStringBody(var_id: Object, var_cryptographicKey: Object, var_cryptographicAlgorithm: Object, var_createdTime: Object) =
        s"""
        | {
        | "id":$var_id,"cryptographicKey":$var_cryptographicKey,"cryptographicAlgorithm":$var_cryptographicAlgorithm,"createdTime":$var_createdTime
        | }
        """.stripMargin
}
