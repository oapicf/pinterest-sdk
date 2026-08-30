
package org.openapitools.client.model


case class UserWebsite (
    /* Status of the verification process */
    _status: Option[String],
    /* UTC timestamp when the verification happened - sometimes missing */
    _verifiedAt: Option[String],
    /* Website with path or domain only */
    _website: Option[String]
)
object UserWebsite {
    def toStringBody(var_status: Object, var_verifiedAt: Object, var_website: Object) =
        s"""
        | {
        | "status":$var_status,"verifiedAt":$var_verifiedAt,"website":$var_website
        | }
        """.stripMargin
}
