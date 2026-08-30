# CatalogsRetailBatchRequestItemsItems

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | [**OpenAPI\Server\Model\ItemAttributesRequest**](ItemAttributesRequest.md) |  | 
**itemId** | **string** | The catalog item id in the merchant namespace | 
**operation** | **string** |  | 
**updateMask** | [**OpenAPI\Server\Model\UpdateMaskFieldType**](UpdateMaskFieldType.md) | The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. | [optional] 
**lastUpdatedTime** | **int** | The millisecond timestamp when the item was lastly modified by the merchant. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


