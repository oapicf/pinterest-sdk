# WWW::OpenAPIClient::Object::AdvancedAuctionItemsSubmitDeleteRecord

## Load the model package
```perl
use WWW::OpenAPIClient::Object::AdvancedAuctionItemsSubmitDeleteRecord;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | [**Country**](Country.md) |  | 
**errors** | [**ARRAY[AdvancedAuctionOperationError]**](AdvancedAuctionOperationError.md) | Array with validation errors for the supplied item bid option modification operation. A non empty errors list means this single item operation was not applied. | [optional] 
**item_id** | **string** | The catalog retail item id in the merchant namespace | 
**language** | [**Language**](Language.md) |  | 
**operation** | **string** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


