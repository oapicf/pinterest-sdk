
package org.openapitools.client.model


case class PinMediaSourceImageBase64 (
    _contentType: ModelContentType,
    _data: String,
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    _isStandard: Option[Boolean],
    /* The source type of the media. */
    _sourceType: String
)
object PinMediaSourceImageBase64 {
    def toStringBody(var_contentType: Object, var_data: Object, var_isStandard: Object, var_sourceType: Object) =
        s"""
        | {
        | "contentType":$var_contentType,"data":$var_data,"isStandard":$var_isStandard,"sourceType":$var_sourceType
        | }
        """.stripMargin
}
