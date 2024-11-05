
# Table `targeting_template_list_200_response`
(mapped from: TargetingTemplateList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;TargetingTemplateResponseData&gt;**](TargetingTemplateResponseData.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `TargetingTemplateList200ResponseTargetingTemplateResponseData`**
(mapped from: TargetingTemplateList200ResponseTargetingTemplateResponseData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
targetingTemplateList200Response | targetingTemplateList200Response | long | | kotlin.Long | Primary Key | *one*
targetingTemplateResponseData | targetingTemplateResponseData | long | | kotlin.Long | Foreign Key | *many*




