
package org.openapitools.client.model


case class PinMediaSourceVideoID (
    _sourceType: String,
    /* Cover image url. */
    _coverImageUrl: Option[String],
    /* Content type for cover image Base64. */
    _coverImageContentType: Option[String],
    /* Cover image Base64. */
    _coverImageData: Option[String],
    _mediaId: String,
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    _isStandard: Option[Boolean]
)
object PinMediaSourceVideoID {
    def toStringBody(var_sourceType: Object, var_coverImageUrl: Object, var_coverImageContentType: Object, var_coverImageData: Object, var_mediaId: Object, var_isStandard: Object) =
        s"""
        | {
        | "sourceType":$var_sourceType,"coverImageUrl":$var_coverImageUrl,"coverImageContentType":$var_coverImageContentType,"coverImageData":$var_coverImageData,"mediaId":$var_mediaId,"isStandard":$var_isStandard
        | }
        """.stripMargin
}
