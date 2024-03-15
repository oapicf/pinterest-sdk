
# Table `customer_lists_list_200_response`
(mapped from: CustomerListsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CustomerList&gt;**](CustomerList.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `CustomerListsList200ResponseCustomerList`**
(mapped from: CustomerListsList200ResponseCustomerList)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
customerListsList200Response | customerListsList200Response | long | | kotlin.Long | Primary Key | *one*
customerList | customerList | long | | kotlin.Long | Foreign Key | *many*




