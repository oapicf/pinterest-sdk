
package org.openapitools.client.model


case class AdPreviewCreateFromImage (
    /* Image URL. */
    _imageUrl: String,
    /* Title displayed below ad. */
    _title: String
)
object AdPreviewCreateFromImage {
    def toStringBody(var_imageUrl: Object, var_title: Object) =
        s"""
        | {
        | "imageUrl":$var_imageUrl,"title":$var_title
        | }
        """.stripMargin
}
