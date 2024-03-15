
package org.openapitools.client.model


case class PinMediaSourceImageBase64 (
    _sourceType: String,
    _contentType: String,
    _data: String,
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    _isStandard: Option[Boolean]
)
object PinMediaSourceImageBase64 {
    def toStringBody(var_sourceType: Object, var_contentType: Object, var_data: Object, var_isStandard: Object) =
        s"""
        | {
        | "sourceType":$var_sourceType,"contentType":$var_contentType,"data":$var_data,"isStandard":$var_isStandard
        | }
        """.stripMargin
}
