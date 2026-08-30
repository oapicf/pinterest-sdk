# CreativeAssetsProcessingRecord


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`creative_assets_id`** | **`String`** | The catalog creative assets id in the merchant namespace | [optional] [default to nothing]
**`errors`** | [**`Vector{ItemValidationEvent}`**](ItemValidationEvent.md) | Array with the validation errors for the item processing record. A non empty errors list causes the item processing to fail. | [optional] [default to nothing]
**`status`** | [**`*ItemProcessingStatus`**](ItemProcessingStatus.md) |  | [optional] [default to nothing]
**`warnings`** | [**`Vector{ItemValidationEvent}`**](ItemValidationEvent.md) | Array with the validation warnings for the item processing record | [optional] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


