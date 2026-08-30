
package org.openapitools.client.model


case class PinMedia (
    _images: Option[ImageSize],
    _mediaType: String,
    _coverImageUrl: Option[String],
    /* Duration (in miliseconds). Field maybe null after creation due to video processing time. */
    _duration: Option[Number],
    /* Height (in pixels). Field maybe null after creation due to video processing time. */
    _height: Option[Integer],
    /* Video url (720p).  **Note:** This field is limited and not available to all apps. */
    _videoUrl: Option[String],
    /* Video url (HLS).  **Note:** This field is limited and not available to all apps. */
    _videoUrlHls: Option[String],
    /* Width (in pixels). Field maybe null after creation due to video processing time. */
    _width: Option[Integer],
    _items: Option[List[PinMediaMetadata]]
)
object PinMedia {
    def toStringBody(var_images: Object, var_mediaType: Object, var_coverImageUrl: Object, var_duration: Object, var_height: Object, var_videoUrl: Object, var_videoUrlHls: Object, var_width: Object, var_items: Object) =
        s"""
        | {
        | "images":$var_images,"mediaType":$var_mediaType,"coverImageUrl":$var_coverImageUrl,"duration":$var_duration,"height":$var_height,"videoUrl":$var_videoUrl,"videoUrlHls":$var_videoUrlHls,"width":$var_width,"items":$var_items
        | }
        """.stripMargin
}
