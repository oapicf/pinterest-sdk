
# Table `LeadFormTestRequest`
(mapped from: LeadFormTestRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**answers** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Test lead answers. Should follow the creation order. | 


# **Table `LeadFormTestRequestAnswers`**
(mapped from: LeadFormTestRequestAnswers)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormTestRequest | leadFormTestRequest | long | | kotlin.Long | Primary Key | *one*
answers | answers | text | | kotlin.String | Foreign Key | *many*



