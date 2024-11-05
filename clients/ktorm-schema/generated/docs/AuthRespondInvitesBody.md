
# Table `AuthRespondInvitesBody`
(mapped from: AuthRespondInvitesBody)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**invites** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AuthRespondInvitesBodyInvitesInner&gt;**](AuthRespondInvitesBodyInvitesInner.md) |  | 


# **Table `AuthRespondInvitesBodyAuthRespondInvitesBodyInvitesInner`**
(mapped from: AuthRespondInvitesBodyAuthRespondInvitesBodyInvitesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
authRespondInvitesBody | authRespondInvitesBody | long | | kotlin.Long | Primary Key | *one*
authRespondInvitesBodyInvitesInner | authRespondInvitesBodyInvitesInner | long | | kotlin.Long | Foreign Key | *many*



