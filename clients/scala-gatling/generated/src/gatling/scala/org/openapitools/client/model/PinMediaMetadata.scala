
package org.openapitools.client.model


case class PinMediaMetadata (
    _description: Option[String],
    _images: Option[ImageSize],
    /* Discriminator literal identifying this as video metadata inside a `PinMediaMetadata` payload. */
    _itemType: String,
    _link: Option[String],
    _title: Option[String],
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
    _width: Option[Integer]
)
object PinMediaMetadata {
    def toStringBody(var_description: Object, var_images: Object, var_itemType: Object, var_link: Object, var_title: Object, var_coverImageUrl: Object, var_duration: Object, var_height: Object, var_videoUrl: Object, var_videoUrlHls: Object, var_width: Object) =
        s"""
        | {
        | "description":$var_description,"images":$var_images,"itemType":$var_itemType,"link":$var_link,"title":$var_title,"coverImageUrl":$var_coverImageUrl,"duration":$var_duration,"height":$var_height,"videoUrl":$var_videoUrl,"videoUrlHls":$var_videoUrlHls,"width":$var_width
        | }
        """.stripMargin
}
