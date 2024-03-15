
package org.openapitools.client.model


case class TermsOfService (
    /* The ID of the terms of service */
    _id: Option[String],
    /* The terms of service content */
    _html: Option[String],
    /* Whether the ad account has accepted terms of service. */
    _hasAccepted: Option[Boolean],
    /* The ID of the ad account. */
    _adAccountId: Option[String]
)
object TermsOfService {
    def toStringBody(var_id: Object, var_html: Object, var_hasAccepted: Object, var_adAccountId: Object) =
        s"""
        | {
        | "id":$var_id,"html":$var_html,"hasAccepted":$var_hasAccepted,"adAccountId":$var_adAccountId
        | }
        """.stripMargin
}
