
package org.openapitools.client.model


case class ConversionAccessToken (
    _accessToken: String,
    _tokenType: Option[String]
)
object ConversionAccessToken {
    def toStringBody(var_accessToken: Object, var_tokenType: Object) =
        s"""
        | {
        | "accessToken":$var_accessToken,"tokenType":$var_tokenType
        | }
        """.stripMargin
}
