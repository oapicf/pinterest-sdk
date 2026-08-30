
# Table `LabelUpdateRequest`
(mapped from: LabelUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**labels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LabelUpdateItem&gt;**](LabelUpdateItem.md) | Labels that you are applying to the campaign. | 


# **Table `LabelUpdateRequestLabelUpdateItem`**
(mapped from: LabelUpdateRequestLabelUpdateItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labelUpdateRequest | labelUpdateRequest | long | | kotlin.Long | Primary Key | *one*
labelUpdateItem | labelUpdateItem | long | | kotlin.Long | Foreign Key | *many*



