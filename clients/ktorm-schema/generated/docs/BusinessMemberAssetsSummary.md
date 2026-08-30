
# Table `BusinessMemberAssetsSummary`
(mapped from: BusinessMemberAssetsSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccounts** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetIdWithPermissions&gt;**](AssetIdWithPermissions.md) | List of ad account IDs and respective permission levels. |  [optional]
**profiles** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetIdWithPermissions&gt;**](AssetIdWithPermissions.md) | List of profile IDs and respective permission levels. |  [optional]


# **Table `BusinessMemberAssetsSummaryAssetIdWithPermissions`**
(mapped from: BusinessMemberAssetsSummaryAssetIdWithPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessMemberAssetsSummary | businessMemberAssetsSummary | long | | kotlin.Long | Primary Key | *one*
assetIdWithPermissions | assetIdWithPermissions | long | | kotlin.Long | Foreign Key | *many*



# **Table `BusinessMemberAssetsSummaryAssetIdWithPermissions`**
(mapped from: BusinessMemberAssetsSummaryAssetIdWithPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessMemberAssetsSummary | businessMemberAssetsSummary | long | | kotlin.Long | Primary Key | *one*
assetIdWithPermissions | assetIdWithPermissions | long | | kotlin.Long | Foreign Key | *many*



