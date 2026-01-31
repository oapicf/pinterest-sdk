
package org.openapitools.client.model


case class PinMediaSourcePinURL (
    /* This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. */
    _isAffiliateLink: Option[Boolean],
    _sourceType: String
)
object PinMediaSourcePinURL {
    def toStringBody(var_isAffiliateLink: Object, var_sourceType: Object) =
        s"""
        | {
        | "isAffiliateLink":$var_isAffiliateLink,"sourceType":$var_sourceType
        | }
        """.stripMargin
}
