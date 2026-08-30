
# Table `CancelInvitesResponse`
(mapped from: CancelInvitesResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CancelInviteResultItem&gt;**](CancelInviteResultItem.md) |  |  [optional]


# **Table `CancelInvitesResponseCancelInviteResultItem`**
(mapped from: CancelInvitesResponseCancelInviteResultItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
cancelInvitesResponse | cancelInvitesResponse | long | | kotlin.Long | Primary Key | *one*
cancelInviteResultItem | cancelInviteResultItem | long | | kotlin.Long | Foreign Key | *many*



