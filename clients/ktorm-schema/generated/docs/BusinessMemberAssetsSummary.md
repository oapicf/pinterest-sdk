
# Table `BusinessMemberAssetsSummary`
(mapped from: BusinessMemberAssetsSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccounts** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BusinessMemberAssetsSummaryAdAccountsInner&gt;**](BusinessMemberAssetsSummaryAdAccountsInner.md) | List of ad account IDs and respective permission levels. |  [optional]
**profiles** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;BusinessMemberAssetsSummaryProfilesInner&gt;**](BusinessMemberAssetsSummaryProfilesInner.md) | List of profile IDs and respective permission levels. |  [optional]


# **Table `BusinessMemberAssetsSummaryBusinessMemberAssetsSummaryAdAccountsInner`**
(mapped from: BusinessMemberAssetsSummaryBusinessMemberAssetsSummaryAdAccountsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessMemberAssetsSummary | businessMemberAssetsSummary | long | | kotlin.Long | Primary Key | *one*
businessMemberAssetsSummaryAdAccountsInner | businessMemberAssetsSummaryAdAccountsInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `BusinessMemberAssetsSummaryBusinessMemberAssetsSummaryProfilesInner`**
(mapped from: BusinessMemberAssetsSummaryBusinessMemberAssetsSummaryProfilesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
businessMemberAssetsSummary | businessMemberAssetsSummary | long | | kotlin.Long | Primary Key | *one*
businessMemberAssetsSummaryProfilesInner | businessMemberAssetsSummaryProfilesInner | long | | kotlin.Long | Foreign Key | *many*



