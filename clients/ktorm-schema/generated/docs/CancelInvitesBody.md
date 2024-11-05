
# Table `CancelInvitesBody`
(mapped from: CancelInvitesBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**inviteIds** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of invite/request ids to be cancelled | 


# **Table `CancelInvitesBodyInviteIds`**
(mapped from: CancelInvitesBodyInviteIds)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
cancelInvitesBody | cancelInvitesBody | long | | kotlin.Long | Primary Key | *one*
inviteIds | inviteIds | text | | kotlin.String | Foreign Key | *many*



