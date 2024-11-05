
# Table `BusinessMemberAssetsSummary_ad_accounts_inner`
(mapped from: BusinessMemberAssetsSummaryAdAccountsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Unique identifier of a business ad account. |  [optional]
**permissions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Permission levels member or partner has on an asset. |  [optional]



# **Table `BusinessMemberAssetsSummaryAdAccountsInnerPermissions`**
(mapped from: BusinessMemberAssetsSummaryAdAccountsInnerPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessMemberAssetsSummaryAdAccountsInner | businessMemberAssetsSummaryAdAccountsInner | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | text | | kotlin.String | Foreign Key | *many*



