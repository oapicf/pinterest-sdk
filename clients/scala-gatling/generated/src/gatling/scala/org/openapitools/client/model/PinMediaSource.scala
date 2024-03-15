
package org.openapitools.client.model


case class PinMediaSource (
    _sourceType: String,
    _contentType: String,
    _data: String,
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    _isStandard: Option[Boolean],
    _url: String,
    /* Cover image url. */
    _coverImageUrl: Option[String],
    /* Content type for cover image Base64. */
    _coverImageContentType: Option[String],
    /* Cover image Base64. */
    _coverImageData: Option[String],
    _mediaId: String,
    /* Array with image objects. */
    _items: List[PinMediaSourceImagesURLItemsInner],
    _index: Option[Integer],
    /* This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. */
    _isAffiliateLink: Option[Boolean]
)
object PinMediaSource {
    def toStringBody(var_sourceType: Object, var_contentType: Object, var_data: Object, var_isStandard: Object, var_url: Object, var_coverImageUrl: Object, var_coverImageContentType: Object, var_coverImageData: Object, var_mediaId: Object, var_items: Object, var_index: Object, var_isAffiliateLink: Object) =
        s"""
        | {
        | "sourceType":$var_sourceType,"contentType":$var_contentType,"data":$var_data,"isStandard":$var_isStandard,"url":$var_url,"coverImageUrl":$var_coverImageUrl,"coverImageContentType":$var_coverImageContentType,"coverImageData":$var_coverImageData,"mediaId":$var_mediaId,"items":$var_items,"index":$var_index,"isAffiliateLink":$var_isAffiliateLink
        | }
        """.stripMargin
}
