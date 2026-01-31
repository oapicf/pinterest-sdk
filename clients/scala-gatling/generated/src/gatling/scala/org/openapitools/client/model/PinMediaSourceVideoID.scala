
package org.openapitools.client.model


case class PinMediaSourceVideoID (
    /* Content type for cover image Base64. */
    _coverImageContentType: Option[ModelContentType],
    /* Cover image Base64. */
    _coverImageData: Option[String],
    /* Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. */
    _coverImageKeyFrameTime: Option[Integer],
    /* Cover image URL. */
    _coverImageUrl: Option[String],
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    _isStandard: Option[Boolean],
    _mediaId: String,
    _sourceType: String
)
object PinMediaSourceVideoID {
    def toStringBody(var_coverImageContentType: Object, var_coverImageData: Object, var_coverImageKeyFrameTime: Object, var_coverImageUrl: Object, var_isStandard: Object, var_mediaId: Object, var_sourceType: Object) =
        s"""
        | {
        | "coverImageContentType":$var_coverImageContentType,"coverImageData":$var_coverImageData,"coverImageKeyFrameTime":$var_coverImageKeyFrameTime,"coverImageUrl":$var_coverImageUrl,"isStandard":$var_isStandard,"mediaId":$var_mediaId,"sourceType":$var_sourceType
        | }
        """.stripMargin
}
