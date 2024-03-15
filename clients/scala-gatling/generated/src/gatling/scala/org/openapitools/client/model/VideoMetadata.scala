
package org.openapitools.client.model


case class VideoMetadata (
    _itemType: Option[String],
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
object VideoMetadata {
    def toStringBody(var_itemType: Object, var_coverImageUrl: Object, var_videoUrl: Object, var_duration: Object, var_height: Object, var_width: Object) =
        s"""
        | {
        | "itemType":$var_itemType,"coverImageUrl":$var_coverImageUrl,"videoUrl":$var_videoUrl,"duration":$var_duration,"height":$var_height,"width":$var_width
        | }
        """.stripMargin
}
