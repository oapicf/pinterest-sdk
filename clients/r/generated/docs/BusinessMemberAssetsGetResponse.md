# openapi::BusinessMemberAssetsGetResponse

Paginated response for business member assets with total count metadata.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **character** |  | [optional] 
**items** | [**array[AssetIdPermissions]**](AssetIdPermissions.md) |  | 
**total_data_count** | **integer** | Total number of assets matching the query | 
**total_data_count_by_status** | [**TotalCountByEntityStatus**](TotalCountByEntityStatus.md) | Breakdown of asset counts by entity status (ad accounts only) | [optional] 


