
# Table `CancelInvitesRequest`
(mapped from: CancelInvitesRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**inviteIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | A list of invite/request ids to cancel. | 


# **Table `CancelInvitesRequestInviteIds`**
(mapped from: CancelInvitesRequestInviteIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
cancelInvitesRequest | cancelInvitesRequest | long | | kotlin.Long | Primary Key | *one*
inviteIds | inviteIds | text | | kotlin.String | Foreign Key | *many*



