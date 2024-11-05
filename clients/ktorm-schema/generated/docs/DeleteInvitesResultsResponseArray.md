
# Table `DeleteInvitesResultsResponseArray`
(mapped from: DeleteInvitesResultsResponseArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DeleteInvitesResultsResponseArrayItemsInner&gt;**](DeleteInvitesResultsResponseArrayItemsInner.md) | List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled. |  [optional]


# **Table `DeleteInvitesResultsResponseArrayDeleteInvitesResultsResponseArrayItemsInner`**
(mapped from: DeleteInvitesResultsResponseArrayDeleteInvitesResultsResponseArrayItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteInvitesResultsResponseArray | deleteInvitesResultsResponseArray | long | | kotlin.Long | Primary Key | *one*
deleteInvitesResultsResponseArrayItemsInner | deleteInvitesResultsResponseArrayItemsInner | long | | kotlin.Long | Foreign Key | *many*



