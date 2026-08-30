
# Table `LabelBulkUpdateRequest`
(mapped from: LabelBulkUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Label ID. | 
**parentId** | parent_id | text NOT NULL |  | **kotlin.String** | Unique identifier of the asset you are labelling. Currently, you can only label campaigns. | 
**status** | status | long NOT NULL |  | [**LabelStatusBulkUpdate**](LabelStatusBulkUpdate.md) |  |  [foreignkey]





