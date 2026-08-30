# AdGroupCreateRequestAllOf1

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**auto_targeting_enabled** | Option<**bool**> | Enable auto-targeting for ad group. Default value is True. Also known as <a href=\"https://help.pinterest.com/en/business/article/performance-plus-targeting\" target=\"_blank\">\"Pinterest Performance+ targeting\"</a>. | [optional]
**bid_multiplier** | Option<**f64**> | <a href=\"/docs/getting-started/using-beta-and-restricted-features/\" target=\"blank>Open beta</a> Bid multiplier for ad group. This value is a double between 0.1 and 10.0. Enter 0 to remove the bid multiplier. - Make sure the `bid_strategy` type for your ad group is set to `AUTOMATIC_BID`. - Not currently supported for <a href=\"/docs/api-features/pinterest-performance-plus-setup/\" target=\"blank\">Pinterest Performance+ campaigns</a>. | [optional]
**budget_type** | Option<[**models::BudgetType**](BudgetType.md)> |  | [optional][default to Daily]
**pacing_delivery_type** | Option<[**models::PacingDeliveryType**](PacingDeliveryType.md)> |  | [optional][default to Standard]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


