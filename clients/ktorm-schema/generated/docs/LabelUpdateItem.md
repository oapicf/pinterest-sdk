
# Table `LabelUpdateItem`
(mapped from: LabelUpdateItem)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Label ID. | 
**status** | status | long |  | [**LabelStatus**](LabelStatus.md) |  |  [optional] [foreignkey]
**value** | value | text |  | **kotlin.String** | Label name. 100-character limit. |  [optional]





