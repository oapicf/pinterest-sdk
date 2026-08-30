
# Table `UpdateInvitesResultsResponseArray`
(mapped from: UpdateInvitesResultsResponseArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;InviteActionResultItem&gt;**](InviteActionResultItem.md) | List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. |  [optional]


# **Table `UpdateInvitesResultsResponseArrayInviteActionResultItem`**
(mapped from: UpdateInvitesResultsResponseArrayInviteActionResultItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateInvitesResultsResponseArray | updateInvitesResultsResponseArray | long | | kotlin.Long | Primary Key | *one*
inviteActionResultItem | inviteActionResultItem | long | | kotlin.Long | Foreign Key | *many*



