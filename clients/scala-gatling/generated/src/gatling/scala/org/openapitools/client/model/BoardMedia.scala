
package org.openapitools.client.model


case class BoardMedia (
    /* Board cover image. */
    _imageCoverUrl: Option[String],
    /* Board pin thumbnail urls. */
    _pinThumbnailUrls: Option[List[String]]
)
object BoardMedia {
    def toStringBody(var_imageCoverUrl: Object, var_pinThumbnailUrls: Object) =
        s"""
        | {
        | "imageCoverUrl":$var_imageCoverUrl,"pinThumbnailUrls":$var_pinThumbnailUrls
        | }
        """.stripMargin
}
