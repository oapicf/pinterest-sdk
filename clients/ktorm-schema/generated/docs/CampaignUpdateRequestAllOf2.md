
# Table `CampaignUpdateRequestAllOf2`
(mapped from: CampaignUpdateRequestAllOf2)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**bidOptions** | bid_options | long |  | [**CampaignBidOptionsUpdate**](CampaignBidOptionsUpdate.md) |  |  [optional] [foreignkey]
**intendedPromotionType** | intended_promotion_type | long |  | [**IntendedPromotionType**](IntendedPromotionType.md) |  |  [optional] [foreignkey]
**isLtvOptimized** | is_ltv_optimized | boolean |  | **kotlin.Boolean** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. |  [optional]
**isPerformancePlus** | is_performance_plus | boolean |  | **kotlin.Boolean** | Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field. |  [optional]
**isTopOfSearch** | is_top_of_search | boolean |  | **kotlin.Boolean** | Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. |  [optional]
**objectiveType** | objective_type | long |  | [**ObjectiveType**](ObjectiveType.md) |  |  [optional] [foreignkey]








