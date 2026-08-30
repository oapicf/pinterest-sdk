# CatalogsCreativeAssetsBatchRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`catalog_id`** | **`String`** | Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog | [optional] [default to nothing]
**`catalog_type`** | **`String`** |  | [default to nothing]
**`country`** | [**`*Country`**](Country.md) |  | [default to nothing]
**`items`** | [**`Vector{CatalogsCreativeAssetsBatchItem}`**](CatalogsCreativeAssetsBatchItem.md) | Array with creative assets item operations | [default to nothing]
**`language`** | **`String`** | We recommend using the CatalogsLocale values. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


