# Org.OpenAPITools.Model.SupplementalOperationResult
Result of a supplemental item operation, discriminated by supplemental_type

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ItemId** | **string** | Catalog item id in the merchant namespace | 
**Status** | **SupplementalItemProcessingStatus** | Status of the item processing record | 
**StoreCode** | **string** | Store code for the local inventory item | 
**SupplementalType** | **string** |  | 
**Errors** | [**List&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**Warnings** | [**List&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

