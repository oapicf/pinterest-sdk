# CatalogsProductGroupsCreate201Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **string** | ID of the catalog product group. | 
**name** | **string** | Name of catalog product group | [optional] 
**description** | **string** |  | [optional] 
**filters** | [**OpenAPI\Server\Model\CatalogsProductGroupFilters**](CatalogsProductGroupFilters.md) |  | 
**isFeatured** | **bool** | boolean indicator of whether the product group is being featured or not | [optional] 
**type** | [**OpenAPI\Server\Model\CatalogsProductGroupType**](CatalogsProductGroupType.md) |  | [optional] 
**status** | [**OpenAPI\Server\Model\CatalogsProductGroupStatus**](CatalogsProductGroupStatus.md) |  | [optional] 
**createdAt** | **int** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**updatedAt** | **int** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**feedId** | **string** | id of the catalogs feed belonging to this catalog product group | 
**catalogType** | **string** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


