
package org.openapitools.client.model


case class VideoMetadataWithItemType (
    _coverImageUrl: Option[String],
    /* Duration (in miliseconds). Field maybe null after creation due to video processing time. */
    _duration: Option[Number],
    /* Height (in pixels). Field maybe null after creation due to video processing time. */
    _height: Option[Integer],
    _itemType: Option[String],
    /* Video url (720p).  **Note:** This field is limited and not available to all apps. */
    _videoUrl: Option[String],
    /* Width (in pixels). Field maybe null after creation due to video processing time. */
    _width: Option[Integer]
)
object VideoMetadataWithItemType {
    def toStringBody(var_coverImageUrl: Object, var_duration: Object, var_height: Object, var_itemType: Object, var_videoUrl: Object, var_width: Object) =
        s"""
        | {
        | "coverImageUrl":$var_coverImageUrl,"duration":$var_duration,"height":$var_height,"itemType":$var_itemType,"videoUrl":$var_videoUrl,"width":$var_width
        | }
        """.stripMargin
}
