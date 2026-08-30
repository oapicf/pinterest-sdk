# CatalogsAvailableFilterValues



## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**value** | This is a oneOf model. The value must be exactly one of the following types: CatalogsCreativeAssetsAvailableFilterValues, CatalogsHotelAvailableFilterValues, CatalogsRetailAvailableFilterValues | Object holding available filter values for each filter key | [optional] 

The discriminator field is `catalog_type` with the following mapping:
 - `CREATIVE_ASSETS`: `CatalogsCreativeAssetsAvailableFilterValues`
 - `HOTEL`: `CatalogsHotelAvailableFilterValues`
 - `RETAIL`: `CatalogsRetailAvailableFilterValues`



[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


