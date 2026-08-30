
# Table `UpdateMemberAssetAccessBody`
(mapped from: UpdateMemberAssetAccessBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accesses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateMemberAssetAccessItem&gt;**](UpdateMemberAssetAccessItem.md) | List of member asset accesses to assign or update. | 


# **Table `UpdateMemberAssetAccessBodyUpdateMemberAssetAccessItem`**
(mapped from: UpdateMemberAssetAccessBodyUpdateMemberAssetAccessItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateMemberAssetAccessBody | updateMemberAssetAccessBody | long | | kotlin.Long | Primary Key | *one*
updateMemberAssetAccessItem | updateMemberAssetAccessItem | long | | kotlin.Long | Foreign Key | *many*



