
# Table `LabelCreateRequest`
(mapped from: LabelCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**labels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LabelCreateRequestLabelsInner&gt;**](LabelCreateRequestLabelsInner.md) | Labels that you are applying to the campaign. | 
**parentId** | parent_id | text NOT NULL |  | **kotlin.String** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | 


# **Table `LabelCreateRequestLabelCreateRequestLabelsInner`**
(mapped from: LabelCreateRequestLabelCreateRequestLabelsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labelCreateRequest | labelCreateRequest | long | | kotlin.Long | Primary Key | *one*
labelCreateRequestLabelsInner | labelCreateRequestLabelsInner | long | | kotlin.Long | Foreign Key | *many*




