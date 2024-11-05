
# Table `InviteAssetsSummary`
(mapped from: InviteAssetsSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccounts** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;InviteAssetsSummaryAdAccountsInner&gt;**](InviteAssetsSummaryAdAccountsInner.md) | List of ad account IDs and respective permission levels that will be assigned. |  [optional]
**profiles** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;InviteAssetsSummaryProfilesInner&gt;**](InviteAssetsSummaryProfilesInner.md) | List of profile IDs and respective permission levels that will be assigned. |  [optional]


# **Table `InviteAssetsSummaryInviteAssetsSummaryAdAccountsInner`**
(mapped from: InviteAssetsSummaryInviteAssetsSummaryAdAccountsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
inviteAssetsSummary | inviteAssetsSummary | long | | kotlin.Long | Primary Key | *one*
inviteAssetsSummaryAdAccountsInner | inviteAssetsSummaryAdAccountsInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `InviteAssetsSummaryInviteAssetsSummaryProfilesInner`**
(mapped from: InviteAssetsSummaryInviteAssetsSummaryProfilesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
inviteAssetsSummary | inviteAssetsSummary | long | | kotlin.Long | Primary Key | *one*
inviteAssetsSummaryProfilesInner | inviteAssetsSummaryProfilesInner | long | | kotlin.Long | Foreign Key | *many*



