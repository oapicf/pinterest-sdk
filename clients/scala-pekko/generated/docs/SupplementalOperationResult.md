

# SupplementalOperationResult

Result of a supplemental item operation, discriminated by supplemental_type

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**errors** | [**Seq&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. |  [optional]
**itemId** | **String** | Catalog item id in the merchant namespace | 
**status** | **SupplementalItemProcessingStatus** | Status of the item processing record | 
**storeCode** | **String** | Store code for the local inventory item | 
**supplementalType** | [**SupplementalType**](#SupplementalType) |  | 
**warnings** | [**Seq&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record |  [optional]


## Enum: SupplementalType
Allowed values: [LOCAL_INVENTORY]




