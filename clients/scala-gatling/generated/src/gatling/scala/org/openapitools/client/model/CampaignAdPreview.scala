
package org.openapitools.client.model


case class CampaignAdPreview (
    /* Advertiser ID for this preview. */
    _adAccountId: String,
    /* Ad group ID to create a preview record for. */
    _adGroupId: String,
    /* Client ID that created preview. */
    _clientId: Option[Integer],
    /* Unix timestamp in milliseconds for preview expiration. */
    _expiresAt: Integer,
    /* Whether preview link is active. */
    _isActive: Boolean,
    /* Pin ID for pin promotion preview. */
    _pinId: Option[Integer],
    /* Pin promotion ID for this preview. */
    _pinPromotionId: Option[Integer],
    /* Promoted product group ID for catalog previews. */
    _promotedProductGroupId: Option[Integer],
    /* Campaign ad preview URL. */
    _url: String,
    /* User ID that created preview. */
    _userId: Integer,
    /* Pin promotion preview key. */
    _uuid: String
)
object CampaignAdPreview {
    def toStringBody(var_adAccountId: Object, var_adGroupId: Object, var_clientId: Object, var_expiresAt: Object, var_isActive: Object, var_pinId: Object, var_pinPromotionId: Object, var_promotedProductGroupId: Object, var_url: Object, var_userId: Object, var_uuid: Object) =
        s"""
        | {
        | "adAccountId":$var_adAccountId,"adGroupId":$var_adGroupId,"clientId":$var_clientId,"expiresAt":$var_expiresAt,"isActive":$var_isActive,"pinId":$var_pinId,"pinPromotionId":$var_pinPromotionId,"promotedProductGroupId":$var_promotedProductGroupId,"url":$var_url,"userId":$var_userId,"uuid":$var_uuid
        | }
        """.stripMargin
}
