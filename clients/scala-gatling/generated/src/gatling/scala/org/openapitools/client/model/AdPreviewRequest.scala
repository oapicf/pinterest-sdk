
package org.openapitools.client.model


case class AdPreviewRequest (
    /* Image URL. */
    _imageUrl: String,
    /* Title displayed below ad. */
    _title: String,
    /* Pin ID. */
    _pinId: String
)
object AdPreviewRequest {
    def toStringBody(var_imageUrl: Object, var_title: Object, var_pinId: Object) =
        s"""
        | {
        | "imageUrl":$var_imageUrl,"title":$var_title,"pinId":$var_pinId
        | }
        """.stripMargin
}
