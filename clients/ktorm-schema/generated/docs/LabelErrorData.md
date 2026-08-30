
# Table `LabelErrorData`
(mapped from: LabelErrorData)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | text PRIMARY KEY |  | **kotlin.String** | Label ID. |  [optional]
**labelType** | label_type | long |  | [**NullableLabelType**](NullableLabelType.md) |  |  [optional] [foreignkey]
**status** | status | long |  | [**NullableLabelStatus**](NullableLabelStatus.md) |  |  [optional] [foreignkey]
**value** | value | text |  | **kotlin.String** | Label name. 100-character limit. |  [optional]






