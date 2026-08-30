
# Table `UpdatePartnerAssetAccessItem`
(mapped from: UpdatePartnerAssetAccessItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetId** | asset_id | text NOT NULL |  | **kotlin.String** | Unique identifier of the business asset. | 
**partnerId** | partner_id | text NOT NULL |  | **kotlin.String** | Unique identifier of a business partner to update asset access to. | 
**permissions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Permissions&gt;**](Permissions.md) | A non-empty array of permissions to assign to the partner. | 




# **Table `UpdatePartnerAssetAccessItemPermissions`**
(mapped from: UpdatePartnerAssetAccessItemPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updatePartnerAssetAccessItem | updatePartnerAssetAccessItem | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | long | | kotlin.Long | Foreign Key | *many*



