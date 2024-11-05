
# Table `business_member_assets_get_200_response`
(mapped from: BusinessMemberAssetsGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AssetIdPermissions&gt;**](AssetIdPermissions.md) | List asset permissions the given member was granted. | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BusinessMemberAssetsGet200ResponseAssetIdPermissions`**
(mapped from: BusinessMemberAssetsGet200ResponseAssetIdPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessMemberAssetsGet200Response | businessMemberAssetsGet200Response | long | | kotlin.Long | Primary Key | *one*
assetIdPermissions | assetIdPermissions | long | | kotlin.Long | Foreign Key | *many*




