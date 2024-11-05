# # AdvancedAuctionItemsSubmitRecord

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | [**\OpenAPI\Client\Model\AdvancedAuctionOperation**](AdvancedAuctionOperation.md) |  |
**item_id** | **string** | The catalog retail item id in the merchant namespace |
**country** | [**\OpenAPI\Client\Model\Country**](Country.md) |  |
**language** | [**\OpenAPI\Client\Model\Language**](Language.md) |  |
**bid_options** | [**\OpenAPI\Client\Model\AdvancedAuctionBidOptions**](AdvancedAuctionBidOptions.md) |  |
**update_mask** | [**\OpenAPI\Client\Model\UpdateMaskBidOptionField[]**](UpdateMaskBidOptionField.md) | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
