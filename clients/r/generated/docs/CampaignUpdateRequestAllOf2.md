# openapi::CampaignUpdateRequestAllOf2


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_options** | [**CampaignBidOptionsUpdate**](CampaignBidOptionsUpdate.md) |  | [optional] 
**intended_promotion_type** | [**IntendedPromotionType**](IntendedPromotionType.md) |  | [optional] [Enum: ] 
**is_ltv_optimized** | **character** | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional] 
**is_performance_plus** | **character** | Enable Pinterest Performance+ for your campaign. To learn more, see &lt;a href&#x3D;\&quot;https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\&quot;&gt;Pinterest Performance+ Setup&lt;/a&gt;. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] 
**is_top_of_search** | **character** | Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. | [optional] 
**objective_type** | [**ObjectiveType**](ObjectiveType.md) |  | [optional] [Enum: ] 


