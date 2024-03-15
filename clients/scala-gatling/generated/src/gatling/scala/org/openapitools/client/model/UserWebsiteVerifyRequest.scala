
package org.openapitools.client.model


case class UserWebsiteVerifyRequest (
    _website: Option[String],
    _verificationMethod: Option[String]
)
object UserWebsiteVerifyRequest {
    def toStringBody(var_website: Object, var_verificationMethod: Object) =
        s"""
        | {
        | "website":$var_website,"verificationMethod":$var_verificationMethod
        | }
        """.stripMargin
}
