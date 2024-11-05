
# Table `RespondToInvitesResponseArray`
(mapped from: RespondToInvitesResponseArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;RespondToInvitesResponseArrayItemsInner&gt;**](RespondToInvitesResponseArrayItemsInner.md) | List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned. |  [optional]


# **Table `RespondToInvitesResponseArrayRespondToInvitesResponseArrayItemsInner`**
(mapped from: RespondToInvitesResponseArrayRespondToInvitesResponseArrayItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
respondToInvitesResponseArray | respondToInvitesResponseArray | long | | kotlin.Long | Primary Key | *one*
respondToInvitesResponseArrayItemsInner | respondToInvitesResponseArrayItemsInner | long | | kotlin.Long | Foreign Key | *many*



