
# Table `LeadFormArrayResponse`
(mapped from: LeadFormArrayResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormArrayResponseItemsInner&gt;**](LeadFormArrayResponseItemsInner.md) |  |  [optional]


# **Table `LeadFormArrayResponseLeadFormArrayResponseItemsInner`**
(mapped from: LeadFormArrayResponseLeadFormArrayResponseItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormArrayResponse | leadFormArrayResponse | long | | kotlin.Long | Primary Key | *one*
leadFormArrayResponseItemsInner | leadFormArrayResponseItemsInner | long | | kotlin.Long | Foreign Key | *many*



