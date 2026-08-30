
# Table `LeadFormTestCreate`
(mapped from: LeadFormTestCreate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**answers** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.String&gt;** | Test lead answers. Should follow the creation order. | 


# **Table `LeadFormTestCreateAnswers`**
(mapped from: LeadFormTestCreateAnswers)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormTestCreate | leadFormTestCreate | long | | kotlin.Long | Primary Key | *one*
answers | answers | text | | kotlin.String | Foreign Key | *many*



