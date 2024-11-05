
# Table `CreateInvitesResultsResponseArray_items_inner_invite`
(mapped from: CreateInvitesResultsResponseArrayItemsInnerInvite)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Unique identifier of the invite/request. |  [optional]
**user** | user | long |  | [**BusinessAccessUserSummary**](BusinessAccessUserSummary.md) | Metadata for the member/partner that was sent the invite/request. |  [optional] [foreignkey]




