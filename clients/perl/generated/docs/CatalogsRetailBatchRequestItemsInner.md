# WWW::OpenAPIClient::Object::CatalogsRetailBatchRequestItemsInner

## Load the model package
```perl
use WWW::OpenAPIClient::Object::CatalogsRetailBatchRequestItemsInner;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**item_id** | **string** | The catalog item id in the merchant namespace | 
**operation** | **string** |  | 
**attributes** | [**ItemAttributes**](ItemAttributes.md) |  | 
**update_mask** | [**ARRAY[UpdateMaskFieldType]**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


