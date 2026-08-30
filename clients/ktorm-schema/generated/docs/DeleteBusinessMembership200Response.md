
# Table `delete_business_membership_200_response`
(mapped from: DeleteBusinessMembership200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**deletedMembers** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** |  |  [optional]


# **Table `DeleteBusinessMembership200ResponseDeletedMembers`**
(mapped from: DeleteBusinessMembership200ResponseDeletedMembers)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
deleteBusinessMembership200Response | deleteBusinessMembership200Response | long | | kotlin.Long | Primary Key | *one*
deletedMembers | deletedMembers | text | | kotlin.String | Foreign Key | *many*



