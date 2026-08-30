
# Table `LabelBulkCreateRequest`
(mapped from: LabelBulkCreateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**labels** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;LabelCreateItem&gt;**](LabelCreateItem.md) | Labels that you are applying to the campaign. | 
**parentId** | parent_id | text NOT NULL |  | **kotlin.String** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | 


# **Table `LabelBulkCreateRequestLabelCreateItem`**
(mapped from: LabelBulkCreateRequestLabelCreateItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
labelBulkCreateRequest | labelBulkCreateRequest | long | | kotlin.Long | Primary Key | *one*
labelCreateItem | labelCreateItem | long | | kotlin.Long | Foreign Key | *many*




