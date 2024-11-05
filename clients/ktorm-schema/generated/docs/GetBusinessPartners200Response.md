
# Table `get_business_partners_200_response`
(mapped from: GetBusinessPartners200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;UserBusinessRoleBinding&gt;**](UserBusinessRoleBinding.md) | List of business partners. | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `GetBusinessPartners200ResponseUserBusinessRoleBinding`**
(mapped from: GetBusinessPartners200ResponseUserBusinessRoleBinding)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
getBusinessPartners200Response | getBusinessPartners200Response | long | | kotlin.Long | Primary Key | *one*
userBusinessRoleBinding | userBusinessRoleBinding | long | | kotlin.Long | Foreign Key | *many*




