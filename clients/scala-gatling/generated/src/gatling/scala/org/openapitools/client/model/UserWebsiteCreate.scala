
package org.openapitools.client.model


case class UserWebsiteCreate (
    /* Method used to verify website ownership. */
    _verificationMethod: Option[WebsiteVerificationMethod],
    /* Website with path or domain only */
    _website: Option[String]
)
object UserWebsiteCreate {
    def toStringBody(var_verificationMethod: Object, var_website: Object) =
        s"""
        | {
        | "verificationMethod":$var_verificationMethod,"website":$var_website
        | }
        """.stripMargin
}
