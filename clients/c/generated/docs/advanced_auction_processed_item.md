# advanced_auction_processed_item_t

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**operation** | **advanced_auction_operation_t \*** |  | 
**item_id** | **char \*** | The catalog retail item id in the merchant namespace | 
**country** | **country_t \*** |  | 
**language** | **language_t \*** |  | 
**bid_options** | [**advanced_auction_bid_options_t**](advanced_auction_bid_options.md) \* |  | 
**update_mask** | [**list_t**](update_mask_bid_option_field.md) \* | The list of item bid option fields to be set or updated. Fields specified in the updated mask without a value specified in the &#x60;bid_options&#x60; object in the body will be set to &#x60;null&#x60;. If an item bid option record is being created, fields not specified in the update mask will be initialized to &#x60;null&#x60;. | 
**errors** | [**list_t**](advanced_auction_operation_error.md) \* | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


