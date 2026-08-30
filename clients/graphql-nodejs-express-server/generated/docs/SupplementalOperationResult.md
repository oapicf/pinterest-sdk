# SupplementalOperationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**SupplementalItemValidationEvent**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] [default to null]
**itemId** | **String!** | Catalog item id in the merchant namespace | [default to null]
**status** | [***SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | [default to null]
**storeCode** | **String!** | Store code for the local inventory item | [default to null]
**supplementalType** | **String!** |  | [default to null]
**warnings** | [**SupplementalItemValidationEvent**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


