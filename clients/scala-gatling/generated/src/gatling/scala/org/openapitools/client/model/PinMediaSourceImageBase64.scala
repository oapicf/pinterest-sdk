
package org.openapitools.client.model


case class PinMediaSourceImageBase64 (
    _sourceType: String,
    _contentType: String,
    _data: String
)
object PinMediaSourceImageBase64 {
    def toStringBody(var_sourceType: Object, var_contentType: Object, var_data: Object) =
        s"""
        | {
        | "sourceType":$var_sourceType,"contentType":$var_contentType,"data":$var_data
        | }
        """.stripMargin
}
