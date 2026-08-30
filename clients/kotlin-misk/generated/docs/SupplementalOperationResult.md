
# SupplementalOperationResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**itemId** | **kotlin.String** | Catalog item id in the merchant namespace | 
**status** | [**SupplementalItemProcessingStatus**](SupplementalItemProcessingStatus.md) | Status of the item processing record | 
**storeCode** | **kotlin.String** | Store code for the local inventory item | 
**supplementalType** | [**inline**](#SupplementalType) |  | 
**errors** | [**kotlin.collections.List&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. |  [optional]
**warnings** | [**kotlin.collections.List&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record |  [optional]


<a id="SupplementalType"></a>
## Enum: supplemental_type
Name | Value
---- | -----
supplementalType | LOCAL_INVENTORY



