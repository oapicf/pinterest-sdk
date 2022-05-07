
package org.openapitools.client.model


case class PinMediaSourceImageURL (
    _sourceType: String,
    _url: String
)
object PinMediaSourceImageURL {
    def toStringBody(var_sourceType: Object, var_url: Object) =
        s"""
        | {
        | "sourceType":$var_sourceType,"url":$var_url
        | }
        """.stripMargin
}
