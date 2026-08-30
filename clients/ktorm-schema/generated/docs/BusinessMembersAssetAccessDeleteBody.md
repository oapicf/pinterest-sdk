
# Table `BusinessMembersAssetAccessDeleteBody`
(mapped from: BusinessMembersAssetAccessDeleteBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**accesses** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DeleteMemberAssetAccessItem&gt;**](DeleteMemberAssetAccessItem.md) | List of members asset access to be deleted | 


# **Table `BusinessMembersAssetAccessDeleteBodyDeleteMemberAssetAccessItem`**
(mapped from: BusinessMembersAssetAccessDeleteBodyDeleteMemberAssetAccessItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessMembersAssetAccessDeleteBody | businessMembersAssetAccessDeleteBody | long | | kotlin.Long | Primary Key | *one*
deleteMemberAssetAccessItem | deleteMemberAssetAccessItem | long | | kotlin.Long | Foreign Key | *many*



