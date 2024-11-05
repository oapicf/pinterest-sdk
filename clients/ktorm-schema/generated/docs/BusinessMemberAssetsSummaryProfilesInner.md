
# Table `BusinessMemberAssetsSummary_profiles_inner`
(mapped from: BusinessMemberAssetsSummaryProfilesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Unique identifier of a business profile. |  [optional]
**permissions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Permission levels member or partner has on an asset. |  [optional]



# **Table `BusinessMemberAssetsSummaryProfilesInnerPermissions`**
(mapped from: BusinessMemberAssetsSummaryProfilesInnerPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessMemberAssetsSummaryProfilesInner | businessMemberAssetsSummaryProfilesInner | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | text | | kotlin.String | Foreign Key | *many*



