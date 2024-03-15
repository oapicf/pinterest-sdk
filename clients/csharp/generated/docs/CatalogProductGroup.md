# Org.OpenAPITools.Model.CatalogProductGroup
non-promoted catalog product group entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | ID of the catalog product group. | [optional] 
**MerchantId** | **string** | Merchant ID pertaining to the owner of the catalog product group. | [optional] 
**Name** | **string** | Name of catalog product group | [optional] 
**Filters** | **Object** | Object holding a list of filters | [optional] 
**FilterV2** | **Object** | Object holding a list of filters | [optional] 
**Type** | [**Board**](Board.md) |  | [optional] 
**Status** | **EntityStatus** |  | [optional] 
**FeedProfileId** | **string** | id of the feed profile belonging to this catalog product group | [optional] 
**CreatedAt** | **int** | Unix timestamp in seconds of when catalog product group was created. | [optional] 
**LastUpdate** | **int** | Unix timestamp in seconds of last time catalog product group was updated. | [optional] 
**ProductCount** | **int** | Amount of products in the catalog product group | [optional] 
**FeaturedPosition** | **int** | index of the featured position of the catalog product group | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

