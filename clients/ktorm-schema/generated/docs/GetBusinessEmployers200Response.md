
# Table `get_business_employers_200_response`
(mapped from: GetBusinessEmployers200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UserBusinessRoleBinding&gt;**](UserBusinessRoleBinding.md) | List of employers. | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `GetBusinessEmployers200ResponseUserBusinessRoleBinding`**
(mapped from: GetBusinessEmployers200ResponseUserBusinessRoleBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getBusinessEmployers200Response | getBusinessEmployers200Response | long | | kotlin.Long | Primary Key | *one*
userBusinessRoleBinding | userBusinessRoleBinding | long | | kotlin.Long | Foreign Key | *many*




