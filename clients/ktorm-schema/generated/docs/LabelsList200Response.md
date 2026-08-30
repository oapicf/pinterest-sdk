
# Table `labels_list_200_response`
(mapped from: LabelsList200Response)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**items** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;Label&gt;**](Label.md) |  | 
**bookmark** | bookmark | text |  | **kotlin.String** |  |  [optional]


# **Table `LabelsList200ResponseLabel`**
(mapped from: LabelsList200ResponseLabel)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labelsList200Response | labelsList200Response | long | | kotlin.Long | Primary Key | *one*
label | label | long | | kotlin.Long | Foreign Key | *many*




