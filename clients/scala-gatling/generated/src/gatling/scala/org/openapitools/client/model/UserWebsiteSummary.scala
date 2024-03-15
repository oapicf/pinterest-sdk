
package org.openapitools.client.model


case class UserWebsiteSummary (
    /* Website with path or domain only */
    _website: Option[String],
    /* Status of the verification process */
    _status: Option[String],
    /* UTC timestamp when the verification happened - sometimes missing */
    _verifiedAt: Option[String]
)
object UserWebsiteSummary {
    def toStringBody(var_website: Object, var_status: Object, var_verifiedAt: Object) =
        s"""
        | {
        | "website":$var_website,"status":$var_status,"verifiedAt":$var_verifiedAt
        | }
        """.stripMargin
}
