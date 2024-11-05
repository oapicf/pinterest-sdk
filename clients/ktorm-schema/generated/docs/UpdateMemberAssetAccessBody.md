
# Table `UpdateMemberAssetAccessBody`
(mapped from: UpdateMemberAssetAccessBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accesses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateMemberAssetAccessBodyAccessesInner&gt;**](UpdateMemberAssetAccessBodyAccessesInner.md) |  | 


# **Table `UpdateMemberAssetAccessBodyUpdateMemberAssetAccessBodyAccessesInner`**
(mapped from: UpdateMemberAssetAccessBodyUpdateMemberAssetAccessBodyAccessesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateMemberAssetAccessBody | updateMemberAssetAccessBody | long | | kotlin.Long | Primary Key | *one*
updateMemberAssetAccessBodyAccessesInner | updateMemberAssetAccessBodyAccessesInner | long | | kotlin.Long | Foreign Key | *many*



