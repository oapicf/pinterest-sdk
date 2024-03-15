
package org.openapitools.client.model


case class PinMediaSourcePinURL (
    _sourceType: String,
    /* This is an affiliate link or sponsored product. The FTC requires disclosure for paid partnerships and affiliate products. */
    _isAffiliateLink: Option[Boolean]
)
object PinMediaSourcePinURL {
    def toStringBody(var_sourceType: Object, var_isAffiliateLink: Object) =
        s"""
        | {
        | "sourceType":$var_sourceType,"isAffiliateLink":$var_isAffiliateLink
        | }
        """.stripMargin
}
