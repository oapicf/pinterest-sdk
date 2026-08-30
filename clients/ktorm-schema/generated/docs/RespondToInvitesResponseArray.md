
# Table `RespondToInvitesResponseArray`
(mapped from: RespondToInvitesResponseArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RespondToInviteResultItem&gt;**](RespondToInviteResultItem.md) | List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned. |  [optional]


# **Table `RespondToInvitesResponseArrayRespondToInviteResultItem`**
(mapped from: RespondToInvitesResponseArrayRespondToInviteResultItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
respondToInvitesResponseArray | respondToInvitesResponseArray | long | | kotlin.Long | Primary Key | *one*
respondToInviteResultItem | respondToInviteResultItem | long | | kotlin.Long | Foreign Key | *many*



