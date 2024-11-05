
# Table `get_business_members_200_response`
(mapped from: GetBusinessMembers200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UserBusinessRoleBinding&gt;**](UserBusinessRoleBinding.md) | List of business members. | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `GetBusinessMembers200ResponseUserBusinessRoleBinding`**
(mapped from: GetBusinessMembers200ResponseUserBusinessRoleBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getBusinessMembers200Response | getBusinessMembers200Response | long | | kotlin.Long | Primary Key | *one*
userBusinessRoleBinding | userBusinessRoleBinding | long | | kotlin.Long | Foreign Key | *many*




