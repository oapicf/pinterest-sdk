# CampaignUpdateRequestAllOf2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bid_options** | Option<[**models::CampaignBidOptionsUpdate**](CampaignBidOptionsUpdate.md)> |  | [optional]
**intended_promotion_type** | Option<[**models::IntendedPromotionType**](IntendedPromotionType.md)> |  | [optional]
**is_ltv_optimized** | Option<**bool**> | Specifies whether the campaign is optimized for Lifetime Value (LTV). Only available for eligible advertisers. | [optional]
**is_performance_plus** | Option<**bool**> | Enable Pinterest Performance+ for your campaign. To learn more, see <a href=\"https://developers.pinterest.com/docs/api-features/pinterest-performance-plus-setup/\">Pinterest Performance+ Setup</a>. This field is immutable, except only for campaigns in draft status which may update this field. | [optional]
**is_top_of_search** | Option<**bool**> | Enable Top Of Search for your campaign. This field is immutable, except only for campaigns in draft status which may update this field. | [optional]
**objective_type** | Option<[**models::ObjectiveType**](ObjectiveType.md)> |  | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


