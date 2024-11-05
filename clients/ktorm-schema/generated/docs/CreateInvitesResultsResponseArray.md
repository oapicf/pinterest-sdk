
# Table `CreateInvitesResultsResponseArray`
(mapped from: CreateInvitesResultsResponseArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CreateInvitesResultsResponseArrayItemsInner&gt;**](CreateInvitesResultsResponseArrayItemsInner.md) | List of invite/request creation status. If there is an error, an exception object will be returned. If the action was successfully completed, an invite object will be returned. |  [optional]


# **Table `CreateInvitesResultsResponseArrayCreateInvitesResultsResponseArrayItemsInner`**
(mapped from: CreateInvitesResultsResponseArrayCreateInvitesResultsResponseArrayItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
createInvitesResultsResponseArray | createInvitesResultsResponseArray | long | | kotlin.Long | Primary Key | *one*
createInvitesResultsResponseArrayItemsInner | createInvitesResultsResponseArrayItemsInner | long | | kotlin.Long | Foreign Key | *many*



