
# Table `Label`
(mapped from: Label)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text NOT NULL PRIMARY KEY |  | **kotlin.String** | Label ID. | 
**labelType** | label_type | long NOT NULL |  | [**NullableLabelType**](NullableLabelType.md) |  |  [foreignkey]
**value** | value | text NOT NULL |  | **kotlin.String** | Label name. 100-character limit. | 
**status** | status | long |  | [**NullableLabelStatus**](NullableLabelStatus.md) |  |  [optional] [foreignkey]






