
# Table `LabelCreateRequest`
(mapped from: LabelCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**labels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LabelCreateItem&gt;**](LabelCreateItem.md) | Labels that you are applying to the campaign. | 


# **Table `LabelCreateRequestLabelCreateItem`**
(mapped from: LabelCreateRequestLabelCreateItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labelCreateRequest | labelCreateRequest | long | | kotlin.Long | Primary Key | *one*
labelCreateItem | labelCreateItem | long | | kotlin.Long | Foreign Key | *many*



