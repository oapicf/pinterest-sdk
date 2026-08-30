
# Table `templates_list_200_response`
(mapped from: TemplatesList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AccountTemplate&gt;**](AccountTemplate.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `TemplatesList200ResponseAccountTemplate`**
(mapped from: TemplatesList200ResponseAccountTemplate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
templatesList200Response | templatesList200Response | long | | kotlin.Long | Primary Key | *one*
accountTemplate | accountTemplate | long | | kotlin.Long | Foreign Key | *many*




