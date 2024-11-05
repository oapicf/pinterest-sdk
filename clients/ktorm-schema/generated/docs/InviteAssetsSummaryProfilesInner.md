
# Table `InviteAssetsSummary_profiles_inner`
(mapped from: InviteAssetsSummaryProfilesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Unique identifier of a business profile. |  [optional]
**permissions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Permission levels member or partner has on an asset. |  [optional]



# **Table `InviteAssetsSummaryProfilesInnerPermissions`**
(mapped from: InviteAssetsSummaryProfilesInnerPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
inviteAssetsSummaryProfilesInner | inviteAssetsSummaryProfilesInner | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | text | | kotlin.String | Foreign Key | *many*



