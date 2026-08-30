

# LocalInventoryOperationResult

Result model for local inventory operation

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**errors** | [**List&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. |  [optional] |
|**itemId** | **String** | Catalog item id in the merchant namespace |  |
|**status** | **SupplementalItemProcessingStatus** | Status of the item processing record |  |
|**storeCode** | **String** | Store code for the local inventory item |  |
|**supplementalType** | [**SupplementalTypeEnum**](#SupplementalTypeEnum) |  |  |
|**warnings** | [**List&lt;SupplementalItemValidationEvent&gt;**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record |  [optional] |



## Enum: SupplementalTypeEnum

| Name | Value |
|---- | -----|
| LOCAL_INVENTORY | &quot;LOCAL_INVENTORY&quot; |



