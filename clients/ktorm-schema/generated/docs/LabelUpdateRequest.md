
# Table `LabelUpdateRequest`
(mapped from: LabelUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**labels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LabelUpdateRequestLabelsInner&gt;**](LabelUpdateRequestLabelsInner.md) | Labels that you are applying to the campaign. | 


# **Table `LabelUpdateRequestLabelUpdateRequestLabelsInner`**
(mapped from: LabelUpdateRequestLabelUpdateRequestLabelsInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labelUpdateRequest | labelUpdateRequest | long | | kotlin.Long | Primary Key | *one*
labelUpdateRequestLabelsInner | labelUpdateRequestLabelsInner | long | | kotlin.Long | Foreign Key | *many*



