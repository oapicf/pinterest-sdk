# LocalInventoryOperationResult
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **errors** | [**List**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] [default to null] |
| **item\_id** | **String** | Catalog item id in the merchant namespace | [default to null] |
| **status** | [**SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | [default to null] |
| **store\_code** | **String** | Store code for the local inventory item | [default to null] |
| **supplemental\_type** | **String** |  | [default to null] |
| **warnings** | [**List**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

