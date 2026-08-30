
# Table `BusinessMemberAssetsGetResponse`
(mapped from: BusinessMemberAssetsGetResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetIdPermissions&gt;**](AssetIdPermissions.md) |  | 
**totalDataCount** | total_data_count | int NOT NULL |  | **kotlin.Int** | Total number of assets matching the query | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]
**totalDataCountByStatus** | total_data_count_by_status | long |  | [**TotalCountByEntityStatus**](TotalCountByEntityStatus.md) | Breakdown of asset counts by entity status (ad accounts only) |  [optional] [foreignkey]


# **Table `BusinessMemberAssetsGetResponseAssetIdPermissions`**
(mapped from: BusinessMemberAssetsGetResponseAssetIdPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessMemberAssetsGetResponse | businessMemberAssetsGetResponse | long | | kotlin.Long | Primary Key | *one*
assetIdPermissions | assetIdPermissions | long | | kotlin.Long | Foreign Key | *many*






