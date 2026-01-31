
package org.openapitools.client.model


case class AmazonConnectRequest (
    /* The Amazon storefront id */
    _amazonStorefrontId: Option[String],
    /* The Amazon storefront name */
    _amazonStorefrontName: String,
    /* The Amazon storefront url */
    _amazonStorefrontUrl: String,
    /* The Amazon user id */
    _amazonUserId: Option[String],
    /* The Amazon account linking status */
    _isAmazonAccountLinked: Boolean,
    /* The one time passcode for Pinterest-initiated linking requests */
    _oneTimePasscode: Option[String],
    /* The Pinterest user id for Amazon-initiated linking requests */
    _pinterestUserId: Option[String]
)
object AmazonConnectRequest {
    def toStringBody(var_amazonStorefrontId: Object, var_amazonStorefrontName: Object, var_amazonStorefrontUrl: Object, var_amazonUserId: Object, var_isAmazonAccountLinked: Object, var_oneTimePasscode: Object, var_pinterestUserId: Object) =
        s"""
        | {
        | "amazonStorefrontId":$var_amazonStorefrontId,"amazonStorefrontName":$var_amazonStorefrontName,"amazonStorefrontUrl":$var_amazonStorefrontUrl,"amazonUserId":$var_amazonUserId,"isAmazonAccountLinked":$var_isAmazonAccountLinked,"oneTimePasscode":$var_oneTimePasscode,"pinterestUserId":$var_pinterestUserId
        | }
        """.stripMargin
}
