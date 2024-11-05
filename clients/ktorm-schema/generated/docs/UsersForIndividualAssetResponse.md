
# Table `UsersForIndividualAssetResponse`
(mapped from: UsersForIndividualAssetResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**assetId** | asset_id | text |  | **kotlin.String** | Unique identifier of a business asset. |  [optional]
**memberId** | member_id | text |  | **kotlin.String** | Unique identifier of the business member with asset access. |  [optional]
**permissions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Permission levels member or partner has on an asset. |  [optional]




# **Table `UsersForIndividualAssetResponsePermissions`**
(mapped from: UsersForIndividualAssetResponsePermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
usersForIndividualAssetResponse | usersForIndividualAssetResponse | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | text | | kotlin.String | Foreign Key | *many*



