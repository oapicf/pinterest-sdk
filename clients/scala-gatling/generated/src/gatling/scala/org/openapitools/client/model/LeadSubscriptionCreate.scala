
package org.openapitools.client.model


case class LeadSubscriptionCreate (
    /* Lead form ID. */
    _leadFormId: Option[String],
    /* Standard HTTPS webhook URL. */
    _webhookUrl: String
)
object LeadSubscriptionCreate {
    def toStringBody(var_leadFormId: Object, var_webhookUrl: Object) =
        s"""
        | {
        | "leadFormId":$var_leadFormId,"webhookUrl":$var_webhookUrl
        | }
        """.stripMargin
}
