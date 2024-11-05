
# Table `DeletedMembersResponse`
(mapped from: DeletedMembersResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**deletedMembers** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | List of members whose business membership have been terminated. |  [optional]


# **Table `DeletedMembersResponseDeletedMembers`**
(mapped from: DeletedMembersResponseDeletedMembers)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deletedMembersResponse | deletedMembersResponse | long | | kotlin.Long | Primary Key | *one*
deletedMembers | deletedMembers | text | | kotlin.String | Foreign Key | *many*



