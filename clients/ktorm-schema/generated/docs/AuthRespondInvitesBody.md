
# Table `AuthRespondInvitesBody`
(mapped from: AuthRespondInvitesBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**invites** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AuthRespondInvitesBodyItem&gt;**](AuthRespondInvitesBodyItem.md) |  | 


# **Table `AuthRespondInvitesBodyAuthRespondInvitesBodyItem`**
(mapped from: AuthRespondInvitesBodyAuthRespondInvitesBodyItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
authRespondInvitesBody | authRespondInvitesBody | long | | kotlin.Long | Primary Key | *one*
authRespondInvitesBodyItem | authRespondInvitesBodyItem | long | | kotlin.Long | Foreign Key | *many*



