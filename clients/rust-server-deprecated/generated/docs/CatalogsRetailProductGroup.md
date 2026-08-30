# CatalogsRetailProductGroup

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**catalog_id** | **String** | Catalog ID pertaining to the product group. | 
**catalog_type** | [***models::CatalogsRetailAvailableFilterValuesCatalogType**](CatalogsRetailAvailableFilterValues_catalog_type.md) |  | 
**country** | **swagger::Nullable<String>** |  | [optional] [default to None]
**created_at** | **i32** | Unix timestamp in seconds of when catalog product group was created. | [optional] [default to None]
**description** | **swagger::Nullable<String>** |  | [optional] [default to None]
**feed_id** | **swagger::Nullable<String>** | id of the catalogs feed belonging to this catalog product group | 
**filters** | [***models::CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**id** | **String** | ID of the catalog product group. | 
**is_featured** | **bool** | boolean indicator of whether the product group is being featured or not | [optional] [default to None]
**locale** | **swagger::Nullable<String>** |  | [optional] [default to None]
**name** | **String** | Name of catalog product group | [optional] [default to None]
**status** | [***models::CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] [default to None]
**r#type** | [***models::CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | 
**updated_at** | **i32** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] [default to None]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


