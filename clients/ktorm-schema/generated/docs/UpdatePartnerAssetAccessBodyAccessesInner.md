
# Table `UpdatePartnerAssetAccessBody_accesses_inner`
(mapped from: UpdatePartnerAssetAccessBodyAccessesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**partnerId** | partner_id | text NOT NULL |  | **kotlin.String** | Unique identifier of a business partner to update asset access to. | 
**assetId** | asset_id | text NOT NULL |  | **kotlin.String** | Unique identifier of the business asset. | 
**permissions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Permissions&gt;**](Permissions.md) | A non-empty array of permissions to assign to the partner. | 




# **Table `UpdatePartnerAssetAccessBodyAccessesInnerPermissions`**
(mapped from: UpdatePartnerAssetAccessBodyAccessesInnerPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updatePartnerAssetAccessBodyAccessesInner | updatePartnerAssetAccessBodyAccessesInner | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | long | | kotlin.Long | Foreign Key | *many*



