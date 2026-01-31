
package org.openapitools.client.model


case class TermsOfService (
    /* The ID of the ad account. */
    _adAccountId: Option[String],
    /* Whether the ad account has accepted terms of service. */
    _hasAccepted: Option[Boolean],
    /* The terms of service content */
    _html: Option[String],
    /* The ID of the terms of service */
    _id: Option[String]
)
object TermsOfService {
    def toStringBody(var_adAccountId: Object, var_hasAccepted: Object, var_html: Object, var_id: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"hasAccepted":$var_hasAccepted,"html":$var_html,"id":$var_id
        | }
        """.stripMargin
}
