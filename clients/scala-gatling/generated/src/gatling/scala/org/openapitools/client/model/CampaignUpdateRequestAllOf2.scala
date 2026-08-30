
package org.openapitools.client.model


case class CampaignUpdateRequestAllOf2 (
    _bidOptions: Option[CampaignBidOptionsUpdate],
    _intendedPromotionType: Option[IntendedPromotionType],
    /* Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. */
    _isLtvOptimized: Option[Boolean],
    /* Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field. */
    _isPerformancePlus: Option[Boolean],
    /* Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. */
    _isTopOfSearch: Option[Boolean],
    _objectiveType: Option[ObjectiveType]
)
object CampaignUpdateRequestAllOf2 {
    def toStringBody(var_bidOptions: Object, var_intendedPromotionType: Object, var_isLtvOptimized: Object, var_isPerformancePlus: Object, var_isTopOfSearch: Object, var_objectiveType: Object) =
        s"""
        | {
        | "bidOptions":$var_bidOptions,"intendedPromotionType":$var_intendedPromotionType,"isLtvOptimized":$var_isLtvOptimized,"isPerformancePlus":$var_isPerformancePlus,"isTopOfSearch":$var_isTopOfSearch,"objectiveType":$var_objectiveType
        | }
        """.stripMargin
}
