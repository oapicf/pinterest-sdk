# CatalogsRetailItemErrorResponse


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`catalog_type`** | **`String`** |  | [default to nothing]
**`errors`** | [**`Vector{ItemValidationEvent}`**](ItemValidationEvent.md) | Array with the errors for the item id requested | [default to nothing]
**`item_id`** | **`String`** | The catalog item id in the merchant namespace | [optional] [default to nothing]
**`item_response_kind`** | **`String`** | Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


