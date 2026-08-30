# openapi::SupplementalOperationResult

Result of a supplemental item operation, discriminated by supplemental_type

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**array[SupplementalItemValidationEvent]**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] 
**item_id** | **character** | Catalog item id in the merchant namespace | 
**status** | [**SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | [Enum: ] 
**store_code** | **character** | Store code for the local inventory item | 
**supplemental_type** | **character** |  | [Enum: [LOCAL_INVENTORY]] 
**warnings** | [**array[SupplementalItemValidationEvent]**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] 


