# SUPPLEMENTAL_OPERATION_RESULT

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**LIST [SUPPLEMENTAL_ITEM_VALIDATION_EVENT]**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] [default to null]
**item_id** | [**STRING_32**](STRING_32.md) | Catalog item id in the merchant namespace | [default to null]
**status** | [**SUPPLEMENTAL_ITEM_PROCESSING_STATUS**](SupplementalItemProcessingStatus.md) | Status of the item processing record | [default to null]
**store_code** | [**STRING_32**](STRING_32.md) | Store code for the local inventory item | [default to null]
**supplemental_type** | [**STRING_32**](STRING_32.md) |  | [default to null]
**warnings** | [**LIST [SUPPLEMENTAL_ITEM_VALIDATION_EVENT]**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


