

# BusinessMemberAssetsGetResponse

Paginated response for business member assets with total count metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bookmark** | **String** |  |  [optional]
**items** | [**Seq&lt;AssetIdPermissions&gt;**](AssetIdPermissions.md) |  | 
**totalDataCount** | **Int** | Total number of assets matching the query | 
**totalDataCountByStatus** | [**TotalCountByEntityStatus**](TotalCountByEntityStatus.md) | Breakdown of asset counts by entity status (ad accounts only) |  [optional]



