# SupplementalOperationResult

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | Option<[**Vec<models::SupplementalItemValidationEvent>**](SupplementalItemValidationEvent.md)> | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional]
**item_id** | **String** | Catalog item id in the merchant namespace | 
**status** | [**models::SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | 
**store_code** | **String** | Store code for the local inventory item | 
**supplemental_type** | **SupplementalType** |  (enum: LOCAL_INVENTORY) | 
**warnings** | Option<[**Vec<models::SupplementalItemValidationEvent>**](SupplementalItemValidationEvent.md)> | Array with the validation warnings for the item processing record | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


