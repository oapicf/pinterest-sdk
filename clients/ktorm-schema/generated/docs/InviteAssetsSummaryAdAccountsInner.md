
# Table `InviteAssetsSummary_ad_accounts_inner`
(mapped from: InviteAssetsSummaryAdAccountsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Unique identifier of a business ad account. |  [optional]
**permissions** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Permission levels member or partner has on an asset. |  [optional]



# **Table `InviteAssetsSummaryAdAccountsInnerPermissions`**
(mapped from: InviteAssetsSummaryAdAccountsInnerPermissions)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
inviteAssetsSummaryAdAccountsInner | inviteAssetsSummaryAdAccountsInner | long | | kotlin.Long | Primary Key | *one*
permissions | permissions | text | | kotlin.String | Foreign Key | *many*



