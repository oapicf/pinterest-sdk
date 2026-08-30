# CatalogsRetailProductGroupCreateRequest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **String** | Catalog ID pertaining to the product group. | 
**catalog_type** | **CatalogType** | Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. (enum: RETAIL) | 
**country** | Option<[**models::Country**](Country.md)> |  | [optional]
**description** | Option<**String**> |  | [optional]
**filters** | [**models::CatalogsProductGroupFiltersRequest**](CatalogsProductGroupFiltersRequest.md) |  | 
**locale** | Option<[**models::CatalogsLocale**](CatalogsLocale.md)> |  | [optional]
**name** | **String** |  | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


