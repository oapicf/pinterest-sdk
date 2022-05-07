
package org.openapitools.client.model


case class CatalogsFeedCredentials (
    /* The required password for downloading a feed. */
    _password: String,
    /* The required username for downloading a feed. */
    _username: String
)
object CatalogsFeedCredentials {
    def toStringBody(var_password: Object, var_username: Object) =
        s"""
        | {
        | "password":$var_password,"username":$var_username
        | }
        """.stripMargin
}
