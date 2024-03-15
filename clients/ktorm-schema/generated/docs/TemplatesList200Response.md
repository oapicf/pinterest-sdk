
# Table `templates_list_200_response`
(mapped from: TemplatesList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TemplateResponse&gt;**](TemplateResponse.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `TemplatesList200ResponseTemplateResponse`**
(mapped from: TemplatesList200ResponseTemplateResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
templatesList200Response | templatesList200Response | long | | kotlin.Long | Primary Key | *one*
templateResponse | templateResponse | long | | kotlin.Long | Foreign Key | *many*




