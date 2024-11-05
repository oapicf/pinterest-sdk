
# Table `UpdateInvitesResultsResponseArray`
(mapped from: UpdateInvitesResultsResponseArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateInvitesResultsResponseArrayItemsInner&gt;**](UpdateInvitesResultsResponseArrayItemsInner.md) | List of invite/Request action status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. |  [optional]


# **Table `UpdateInvitesResultsResponseArrayUpdateInvitesResultsResponseArrayItemsInner`**
(mapped from: UpdateInvitesResultsResponseArrayUpdateInvitesResultsResponseArrayItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateInvitesResultsResponseArray | updateInvitesResultsResponseArray | long | | kotlin.Long | Primary Key | *one*
updateInvitesResultsResponseArrayItemsInner | updateInvitesResultsResponseArrayItemsInner | long | | kotlin.Long | Foreign Key | *many*



