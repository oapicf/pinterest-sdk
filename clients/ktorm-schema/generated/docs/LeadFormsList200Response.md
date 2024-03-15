
# Table `lead_forms_list_200_response`
(mapped from: LeadFormsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadFormResponse&gt;**](LeadFormResponse.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `LeadFormsList200ResponseLeadFormResponse`**
(mapped from: LeadFormsList200ResponseLeadFormResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormsList200Response | leadFormsList200Response | long | | kotlin.Long | Primary Key | *one*
leadFormResponse | leadFormResponse | long | | kotlin.Long | Foreign Key | *many*




