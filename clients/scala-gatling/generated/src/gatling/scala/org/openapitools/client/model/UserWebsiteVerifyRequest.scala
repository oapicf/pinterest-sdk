
package org.openapitools.client.model


case class UserWebsiteVerifyRequest (
    _verificationMethod: Option[String],
    _website: Option[String]
)
object UserWebsiteVerifyRequest {
    def toStringBody(var_verificationMethod: Object, var_website: Object) =
        s"""
        | {
        | "verificationMethod":$var_verificationMethod,"website":$var_website
        | }
        """.stripMargin
}
