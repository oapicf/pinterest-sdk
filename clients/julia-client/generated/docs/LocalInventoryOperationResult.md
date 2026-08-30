# LocalInventoryOperationResult


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`errors`** | [**`Vector{SupplementalItemValidationEvent}`**](SupplementalItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] [default to nothing]
**`item_id`** | **`String`** | Catalog item id in the merchant namespace | [default to nothing]
**`status`** | [**`*SupplementalItemProcessingStatus`**](SupplementalItemProcessingStatus.md) | Status of the item processing record | [default to nothing]
**`store_code`** | **`String`** | Store code for the local inventory item | [default to nothing]
**`supplemental_type`** | **`String`** |  | [default to nothing]
**`warnings`** | [**`Vector{SupplementalItemValidationEvent}`**](SupplementalItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


