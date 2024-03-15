
package org.openapitools.client.model


case class PinMediaWithVideo (
    _mediaType: Option[String],
    _images: Option[ImageMetadataImages],
    _coverImageUrl: Option[String],
    /* Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps. */
    _videoUrl: Option[String],
    /* Duration (in milliseconds) */
    _duration: Option[Number],
    /* Height (in pixels) */
    _height: Option[Integer],
    /* Width (in pixels) */
    _width: Option[Integer]
)
object PinMediaWithVideo {
    def toStringBody(var_mediaType: Object, var_images: Object, var_coverImageUrl: Object, var_videoUrl: Object, var_duration: Object, var_height: Object, var_width: Object) =
        s"""
        | {
        | "mediaType":$var_mediaType,"images":$var_images,"coverImageUrl":$var_coverImageUrl,"videoUrl":$var_videoUrl,"duration":$var_duration,"height":$var_height,"width":$var_width
        | }
        """.stripMargin
}
