
package org.openapitools.client.model


case class PinMediaSource (
    _contentType: ModelContentType,
    _data: String,
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    _isStandard: Option[Boolean],
    _sourceType: String,
    _url: String,
    /* Content type for cover image Base64. */
    _coverImageContentType: Option[ModelContentType],
    /* Cover image Base64. */
    _coverImageData: Option[String],
    /* Keyframe timestamp for cover image (seconds). If entered time exceeds video duration, the last frame is used. */
    _coverImageKeyFrameTime: Option[Integer],
    /* Cover image URL. */
    _coverImageUrl: Option[String],
    _mediaId: String,
    _index: Option[Integer],
    /* Array with image objects. */
    _items: List[PinMediaSourceImagesURLItem],
    /* This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. */
    _isAffiliateLink: Option[Boolean]
)
object PinMediaSource {
    def toStringBody(var_contentType: Object, var_data: Object, var_isStandard: Object, var_sourceType: Object, var_url: Object, var_coverImageContentType: Object, var_coverImageData: Object, var_coverImageKeyFrameTime: Object, var_coverImageUrl: Object, var_mediaId: Object, var_index: Object, var_items: Object, var_isAffiliateLink: Object) =
        s"""
        | {
        | "contentType":$var_contentType,"data":$var_data,"isStandard":$var_isStandard,"sourceType":$var_sourceType,"url":$var_url,"coverImageContentType":$var_coverImageContentType,"coverImageData":$var_coverImageData,"coverImageKeyFrameTime":$var_coverImageKeyFrameTime,"coverImageUrl":$var_coverImageUrl,"mediaId":$var_mediaId,"index":$var_index,"items":$var_items,"isAffiliateLink":$var_isAffiliateLink
        | }
        """.stripMargin
}
