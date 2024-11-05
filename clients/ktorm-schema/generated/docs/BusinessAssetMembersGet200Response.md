
# Table `business_asset_members_get_200_response`
(mapped from: BusinessAssetMembersGet200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UserSingleAssetBinding&gt;**](UserSingleAssetBinding.md) | List of members with permissions to the asset. | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `BusinessAssetMembersGet200ResponseUserSingleAssetBinding`**
(mapped from: BusinessAssetMembersGet200ResponseUserSingleAssetBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessAssetMembersGet200Response | businessAssetMembersGet200Response | long | | kotlin.Long | Primary Key | *one*
userSingleAssetBinding | userSingleAssetBinding | long | | kotlin.Long | Foreign Key | *many*




