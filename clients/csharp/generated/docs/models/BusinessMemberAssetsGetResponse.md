# Org.OpenAPITools.Model.BusinessMemberAssetsGetResponse
Paginated response for business member assets with total count metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Items** | [**List&lt;AssetIdPermissions&gt;**](AssetIdPermissions.md) |  | 
**TotalDataCount** | **int** | Total number of assets matching the query | 
**Bookmark** | **string** |  | [optional] 
**TotalDataCountByStatus** | [**TotalCountByEntityStatus**](TotalCountByEntityStatus.md) | Breakdown of asset counts by entity status (ad accounts only) | [optional] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

