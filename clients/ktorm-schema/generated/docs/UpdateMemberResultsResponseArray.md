
# Table `UpdateMemberResultsResponseArray`
(mapped from: UpdateMemberResultsResponseArray)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UpdateMemberResult&gt;**](UpdateMemberResult.md) | List of members with updated business access role. |  [optional]


# **Table `UpdateMemberResultsResponseArrayUpdateMemberResult`**
(mapped from: UpdateMemberResultsResponseArrayUpdateMemberResult)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
updateMemberResultsResponseArray | updateMemberResultsResponseArray | long | | kotlin.Long | Primary Key | *one*
updateMemberResult | updateMemberResult | long | | kotlin.Long | Foreign Key | *many*



