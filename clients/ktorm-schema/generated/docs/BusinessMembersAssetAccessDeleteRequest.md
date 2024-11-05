
# Table `business_members_asset_access_delete_request`
(mapped from: BusinessMembersAssetAccessDeleteRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accesses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BusinessMembersAssetAccessDeleteRequestAccessesInner&gt;**](BusinessMembersAssetAccessDeleteRequestAccessesInner.md) | List of members asset access to be deleted | 


# **Table `BusinessMembersAssetAccessDeleteRequestBusinessMembersAssetAccessDeleteRequestAccessesInner`**
(mapped from: BusinessMembersAssetAccessDeleteRequestBusinessMembersAssetAccessDeleteRequestAccessesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessMembersAssetAccessDeleteRequest | businessMembersAssetAccessDeleteRequest | long | | kotlin.Long | Primary Key | *one*
businessMembersAssetAccessDeleteRequestAccessesInner | businessMembersAssetAccessDeleteRequestAccessesInner | long | | kotlin.Long | Foreign Key | *many*



