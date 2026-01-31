
package org.openapitools.client.model


case class PinMediaSourceImageURL (
    /* Set the parameter to false to create the new simplified Pin instead of the standard pin. Currently the field is only available to a list of beta users. */
    _isStandard: Option[Boolean],
    /* The source type of the media. */
    _sourceType: String,
    _url: String
)
object PinMediaSourceImageURL {
    def toStringBody(var_isStandard: Object, var_sourceType: Object, var_url: Object) =
        s"""
        | {
        | "isStandard":$var_isStandard,"sourceType":$var_sourceType,"url":$var_url
        | }
        """.stripMargin
}
