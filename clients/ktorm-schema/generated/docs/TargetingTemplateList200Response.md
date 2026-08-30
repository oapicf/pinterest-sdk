
# Table `targeting_template_list_200_response`
(mapped from: TargetingTemplateList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingTemplate&gt;**](TargetingTemplate.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `TargetingTemplateList200ResponseTargetingTemplate`**
(mapped from: TargetingTemplateList200ResponseTargetingTemplate)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingTemplateList200Response | targetingTemplateList200Response | long | | kotlin.Long | Primary Key | *one*
targetingTemplate | targetingTemplate | long | | kotlin.Long | Foreign Key | *many*




