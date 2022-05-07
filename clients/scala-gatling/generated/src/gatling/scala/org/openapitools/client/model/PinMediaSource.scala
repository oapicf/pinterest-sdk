
package org.openapitools.client.model


case class PinMediaSource (
    _sourceType: String,
    _contentType: String,
    _data: String,
    _url: String,
    _coverImageUrl: String,
    _mediaId: String
)
object PinMediaSource {
    def toStringBody(var_sourceType: Object, var_contentType: Object, var_data: Object, var_url: Object, var_coverImageUrl: Object, var_mediaId: Object) =
        s"""
        | {
        | "sourceType":$var_sourceType,"contentType":$var_contentType,"data":$var_data,"url":$var_url,"coverImageUrl":$var_coverImageUrl,"mediaId":$var_mediaId
        | }
        """.stripMargin
}
