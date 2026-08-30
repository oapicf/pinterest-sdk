
# Table `UpdateMemberAssetAccessItem`
(mapped from: UpdateMemberAssetAccessItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetId** | asset_id | text NOT NULL |  | **kotlin.String** | Id of the asset to update. | 
**memberId** | member_id | text NOT NULL |  | **kotlin.String** | Unique identifier of the member on which to perform the update | 
**permissions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Permissions&gt;**](Permissions.md) | A non-empty array of permissions to assign to the member. | 




# **Table `UpdateMemberAssetAccessItemPermissions`**
(mapped from: UpdateMemberAssetAccessItemPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateMemberAssetAccessItem | updateMemberAssetAccessItem | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | long | | kotlin.Long | Foreign Key | *many*



