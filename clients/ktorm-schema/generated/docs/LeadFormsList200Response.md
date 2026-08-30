
# Table `lead_forms_list_200_response`
(mapped from: LeadFormsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LeadForm&gt;**](LeadForm.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `LeadFormsList200ResponseLeadForm`**
(mapped from: LeadFormsList200ResponseLeadForm)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
leadFormsList200Response | leadFormsList200Response | long | | kotlin.Long | Primary Key | *one*
leadForm | leadForm | long | | kotlin.Long | Foreign Key | *many*




