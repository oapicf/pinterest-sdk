
# Table `lead_forms_create_200_response`
(mapped from: LeadFormsCreate200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormsCreate200ResponseItemsInner&gt;**](LeadFormsCreate200ResponseItemsInner.md) |  | 


# **Table `LeadFormsCreate200ResponseLeadFormsCreate200ResponseItemsInner`**
(mapped from: LeadFormsCreate200ResponseLeadFormsCreate200ResponseItemsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormsCreate200Response | leadFormsCreate200Response | long | | kotlin.Long | Primary Key | *one*
leadFormsCreate200ResponseItemsInner | leadFormsCreate200ResponseItemsInner | long | | kotlin.Long | Foreign Key | *many*



