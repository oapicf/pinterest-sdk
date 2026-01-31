
# Table `labels_list_200_response`
(mapped from: LabelsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LabelsResponse&gt;**](LabelsResponse.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `LabelsList200ResponseLabelsResponse`**
(mapped from: LabelsList200ResponseLabelsResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labelsList200Response | labelsList200Response | long | | kotlin.Long | Primary Key | *one*
labelsResponse | labelsResponse | long | | kotlin.Long | Foreign Key | *many*




