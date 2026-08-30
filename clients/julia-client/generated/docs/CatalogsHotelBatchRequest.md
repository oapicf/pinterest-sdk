# CatalogsHotelBatchRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`catalog_id`** | **`String`** | Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog | [optional] [default to nothing]
**`catalog_type`** | **`String`** |  | [default to nothing]
**`country`** | [**`*Country`**](Country.md) |  | [default to nothing]
**`items`** | [**`Vector{CatalogsHotelBatchItem}`**](CatalogsHotelBatchItem.md) | Array with catalogs item operations | [default to nothing]
**`language`** | **`String`** | We recommend using the CatalogsLocale values. | [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


