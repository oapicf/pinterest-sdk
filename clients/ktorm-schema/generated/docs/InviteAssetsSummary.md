
# Table `InviteAssetsSummary`
(mapped from: InviteAssetsSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**adAccounts** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;InviteAssetsSummaryItem&gt;**](InviteAssetsSummaryItem.md) | List of ad account IDs and respective permission levels that will be assigned. |  [optional]
**profiles** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;InviteAssetsSummaryItem&gt;**](InviteAssetsSummaryItem.md) | List of profile IDs and respective permission levels that will be assigned. |  [optional]


# **Table `InviteAssetsSummaryInviteAssetsSummaryItem`**
(mapped from: InviteAssetsSummaryInviteAssetsSummaryItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
inviteAssetsSummary | inviteAssetsSummary | long | | kotlin.Long | Primary Key | *one*
inviteAssetsSummaryItem | inviteAssetsSummaryItem | long | | kotlin.Long | Foreign Key | *many*



# **Table `InviteAssetsSummaryInviteAssetsSummaryItem`**
(mapped from: InviteAssetsSummaryInviteAssetsSummaryItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
inviteAssetsSummary | inviteAssetsSummary | long | | kotlin.Long | Primary Key | *one*
inviteAssetsSummaryItem | inviteAssetsSummaryItem | long | | kotlin.Long | Foreign Key | *many*



