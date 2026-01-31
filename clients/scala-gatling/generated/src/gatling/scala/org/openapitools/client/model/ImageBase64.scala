
package org.openapitools.client.model


case class ImageBase64 (
    _contentType: String,
    _data: String
)
object ImageBase64 {
    def toStringBody(var_contentType: Object, var_data: Object) =
        s"""
        | {
        | "contentType":$var_contentType,"data":$var_data
        | }
        """.stripMargin
}
