
# Table `LabelBulkUpdateRequest`
(mapped from: LabelBulkUpdateRequest)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Label ID. | 
**status** | status | text |  | [**status**](#Status) | Set status to &#x60;ARCHIVED&#x60; to remove the label from the parent entity. |  [optional]
**value** | value | text |  | **kotlin.String** | &lt;/p&gt;&lt;strong&gt;Note:&lt;/strong&gt; value field will be deprecated. Label name. 100-character limit. |  [optional]





