
# Table `DeleteMemberAccessResultsResponseArray`
(mapped from: DeleteMemberAccessResultsResponseArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;DeleteMemberAccessResult&gt;**](DeleteMemberAccessResult.md) | List of member asset permissions that were deleted. |  [optional]


# **Table `DeleteMemberAccessResultsResponseArrayDeleteMemberAccessResult`**
(mapped from: DeleteMemberAccessResultsResponseArrayDeleteMemberAccessResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteMemberAccessResultsResponseArray | deleteMemberAccessResultsResponseArray | long | | kotlin.Long | Primary Key | *one*
deleteMemberAccessResult | deleteMemberAccessResult | long | | kotlin.Long | Foreign Key | *many*



