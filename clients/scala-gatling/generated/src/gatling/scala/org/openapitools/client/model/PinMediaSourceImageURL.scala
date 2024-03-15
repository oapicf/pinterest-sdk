
package org.openapitools.client.model


case class PinMediaSourceImageURL (
    _sourceType: String,
    _url: String,
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    _isStandard: Option[Boolean]
)
object PinMediaSourceImageURL {
    def toStringBody(var_sourceType: Object, var_url: Object, var_isStandard: Object) =
        s"""
        | {
        | "sourceType":$var_sourceType,"url":$var_url,"isStandard":$var_isStandard
        | }
        """.stripMargin
}
