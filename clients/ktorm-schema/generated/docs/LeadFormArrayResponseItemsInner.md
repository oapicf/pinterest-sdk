
# Table `LeadFormArrayResponse_items_inner`
(mapped from: LeadFormArrayResponseItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**data** | data | long |  | [**LeadFormResponse**](LeadFormResponse.md) |  |  [optional] [foreignkey]
**exceptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Exception&gt;**](Exception.md) |  |  [optional]



# **Table `LeadFormArrayResponseItemsInnerException`**
(mapped from: LeadFormArrayResponseItemsInnerException)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormArrayResponseItemsInner | leadFormArrayResponseItemsInner | long | | kotlin.Long | Primary Key | *one*
exception | exception | long | | kotlin.Long | Foreign Key | *many*



