
package org.openapitools.client.model


case class AdPreviewSourceImage (
    /* Image URL. */
    _imageUrl: String,
    /* Promotion id for the ad to preview, optional and only applicable when creating ad preview for an existing promotion. */
    _promotionId: Option[String],
    /* Title displayed below ad. */
    _title: String
)
object AdPreviewSourceImage {
    def toStringBody(var_imageUrl: Object, var_promotionId: Object, var_title: Object) =
        s"""
        | {
        | "imageUrl":$var_imageUrl,"promotionId":$var_promotionId,"title":$var_title
        | }
        """.stripMargin
}
