
package org.openapitools.client.model


case class PinMediaSourceVideoID (
    _sourceType: String,
    _coverImageUrl: String,
    _mediaId: String
)
object PinMediaSourceVideoID {
    def toStringBody(var_sourceType: Object, var_coverImageUrl: Object, var_mediaId: Object) =
        s"""
        | {
        | "sourceType":$var_sourceType,"coverImageUrl":$var_coverImageUrl,"mediaId":$var_mediaId
        | }
        """.stripMargin
}
